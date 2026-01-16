package org.oneedtech.inspect.lerrs.vc;

import static java.lang.Boolean.TRUE;
import static org.oneedtech.inspect.core.Inspector.Behavior.RESET_CACHES_ON_RUN;
import static org.oneedtech.inspect.core.report.ReportUtil.onProbeException;
import static org.oneedtech.inspect.util.json.ObjectMapperCache.Config.DEFAULT;
import static org.oneedtech.inspect.vc.VerifiableCredential.ProofType.EXTERNAL;

import java.util.ArrayList;
import java.util.List;

import org.oneedtech.inspect.core.probe.Probe;
import org.oneedtech.inspect.core.probe.RunContext;
import org.oneedtech.inspect.core.probe.RunContext.Key;
import org.oneedtech.inspect.core.probe.json.JsonPathEvaluator;
import org.oneedtech.inspect.core.report.Report;
import org.oneedtech.inspect.core.report.ReportItems;
import org.oneedtech.inspect.schema.JsonSchemaCache;
import org.oneedtech.inspect.schema.SchemaKey;
import org.oneedtech.inspect.util.json.ObjectMapperCache;
import org.oneedtech.inspect.util.resource.Resource;
import org.oneedtech.inspect.util.resource.ResourceType;
import org.oneedtech.inspect.util.spec.Specification;
import org.oneedtech.inspect.util.version.Version;
import org.oneedtech.inspect.vc.Credential;
import org.oneedtech.inspect.vc.VCInspector;
import org.oneedtech.inspect.vc.VerifiableCredential;
import org.oneedtech.inspect.vc.VerifiableCredential.Type;
import org.oneedtech.inspect.vc.payload.PngParser;
import org.oneedtech.inspect.vc.payload.SvgParser;
import org.oneedtech.inspect.vc.probe.ContextPropertyProbe;
import org.oneedtech.inspect.vc.probe.CredentialParseProbe;
import org.oneedtech.inspect.vc.probe.EmbeddedProofProbe;
import org.oneedtech.inspect.vc.probe.ExpirationProbe;
import org.oneedtech.inspect.vc.probe.ExternalProofProbe;
import org.oneedtech.inspect.vc.probe.InlineJsonSchemaProbe;
import org.oneedtech.inspect.vc.probe.IssuanceProbe;
import org.oneedtech.inspect.vc.probe.JsonSchemasProbe;
import org.oneedtech.inspect.vc.probe.RevocationListProbe;
import org.oneedtech.inspect.vc.probe.TypePropertyProbe;
import org.oneedtech.inspect.vc.util.CachingDocumentLoader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;

public class LERRSVCInspector extends VCInspector {
  protected final List<Probe<VerifiableCredential>> userProbes;

  protected LERRSVCInspector(LERRSVCInspector.Builder builder) {
    super(builder);
    this.userProbes = ImmutableList.copyOf(builder.getProbes());
  }

  @Override
  public Report run(Resource resource) {
    super.check(resource); // TODO because URIs, this should be a fetch and cache

    if (getBehavior(RESET_CACHES_ON_RUN) == TRUE) {
      JsonSchemaCache.reset();
      CachingDocumentLoader.reset();
    }

    ObjectMapper mapper = ObjectMapperCache.get(DEFAULT);
    JsonPathEvaluator jsonPath = new JsonPathEvaluator(mapper);

    VerifiableCredential.Builder credentialBuilder = new VerifiableCredential.Builder();
    RunContext ctx =
        new RunContext.Builder()
            .put(this)
            .put(resource)
            .put(Key.JACKSON_OBJECTMAPPER, mapper)
            .put(Key.JSONPATH_EVALUATOR, jsonPath)
            .put(Key.GENERATED_OBJECT_BUILDER, credentialBuilder)
            .put(Key.PNG_CREDENTIAL_KEY, PngParser.Keys.CLR20)
            .put(Key.SVG_CREDENTIAL_QNAME, SvgParser.QNames.CLR20)
            .put(Key.JWT_CREDENTIAL_NODE_NAME, VerifiableCredential.JWT_NODE_NAME)
            .build();

    List<ReportItems> accumulator = new ArrayList<>();
    int probeCount = 0;

    try {
      // detect type (png, svg, json, jwt) and extract json data
      probeCount++;
      accumulator.add(new CredentialParseProbe().run(resource, ctx));
      if (broken(accumulator)) return abort(ctx, accumulator, probeCount);

      // we expect the above to place a generated object in the context
      VerifiableCredential lerRsVc = ctx.getGeneratedObject(VerifiableCredential.ID);

      // context and type properties
      VerifiableCredential.Type type = Type.LerRsVc;
      for (Probe<JsonNode> probe :
          List.of(new ContextPropertyProbe(type), new TypePropertyProbe(type))) {
        probeCount++;
        accumulator.add(probe.run(lerRsVc.getJson(), ctx));
        if (broken(accumulator)) return abort(ctx, accumulator, probeCount);
      }

      // canonical schema
      SchemaKey schema = lerRsVc.getSchemaKey().orElseThrow();
      probeCount++;
      accumulator.add(new JsonSchemasProbe(schema).run(lerRsVc, ctx));
      if (broken(accumulator)) return abort(ctx, accumulator, probeCount);

      // inline schema
      probeCount++;
      accumulator.add(new InlineJsonSchemaProbe(schema).run(lerRsVc.getJson(), ctx));
      if (broken(accumulator)) return abort(ctx, accumulator, probeCount);

      // signatures, proofs
      probeCount++;
      if (lerRsVc.getProofType() == EXTERNAL) {
        // The credential originally contained in a JWT, validate the jwt and external proof.
        accumulator.add(new ExternalProofProbe().run(lerRsVc, ctx));
      } else {
        accumulator.add(new EmbeddedProofProbe().run(lerRsVc, ctx));
      }
      if (broken(accumulator)) return abort(ctx, accumulator, probeCount);

      // revocation, expiration and issuance
      for (Probe<Credential> probe :
          List.of(new RevocationListProbe(), new ExpirationProbe(), new IssuanceProbe())) {
        probeCount++;
        accumulator.add(probe.run(lerRsVc, ctx));
        if (broken(accumulator)) return abort(ctx, accumulator, probeCount);
      }

      // embedded subject credentials
      // String path = "$.credentialSubject.verifiableCredential";
      // List<JsonNode> vcs = asNodeList(clr.getJson(), path, jsonPath);
      // OB30Inspector.Builder obInspectorBuilder = new OB30Inspector.Builder();
      // if (didResolutionUrl != null) {
      // 	obInspectorBuilder = obInspectorBuilder.inject(DID_RESOLUTION_SERVICE_URL,
      // this.didResolutionUrl);
      // }
      // OB30Inspector obInspector = obInspectorBuilder.build();

      // for (int i = 0; i < vcs.size(); i++) {
      // 	JsonNode node = vcs.get(i);
      // 	String systemId = new StringBuilder().append(resource.getID()).append('/')
      // 			.append(path).append('[').append(i).append(']').toString();
      // 	Resource vcr = new StringResource(CharSource.wrap(node.toString()), systemId,
      // ResourceType.JSON);
      // 	VerifiableCredential vc = credentialBuilder.resource(vcr).jsonData(node).build();

      // 	if(vc.getCredentialType() == Type.AchievementCredential) {
      // 		Report report = obInspector.run(vcr, Map.of(CREDENTIAL_KEY, vc));
      // 		probeCount += report.getSummary().getTotalRun();
      // 		accumulator.add(report);
      // 		if(broken(accumulator)) return abort(ctx, accumulator, probeCount);
      // 	} else {
      // 		//TODO run generic proof check using iron?
      // 		//or issue warning that not checked?
      // 	}
      // }

      // finally, run any user-added probes
      for (Probe<VerifiableCredential> probe : userProbes) {
        probeCount++;
        accumulator.add(probe.run(lerRsVc, ctx));
      }

    } catch (Exception e) {
      accumulator.add(onProbeException(Probe.ID.NO_UNCAUGHT_EXCEPTIONS, resource, e));
    }

    return new Report(ctx, new ReportItems(accumulator), probeCount);
  }

  public static class Builder extends VCInspector.Builder<LERRSVCInspector.Builder> {
    @SuppressWarnings("unchecked")
    @Override
    public LERRSVCInspector build() {
      set(LER_RS_VC);
      set(ResourceType.UNKNOWN);
      return new LERRSVCInspector(this);
    }
  }

  private static final Specification LER_RS_VC = new Specification("lerrsvc.pid", "or", Version.of("4.5"), "HR-JSON 4.5");
}
