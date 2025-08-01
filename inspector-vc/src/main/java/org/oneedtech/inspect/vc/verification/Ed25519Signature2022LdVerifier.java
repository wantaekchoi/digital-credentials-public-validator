package org.oneedtech.inspect.vc.verification;

import com.danubetech.dataintegrity.DataIntegrityProof;
import com.danubetech.dataintegrity.canonicalizer.Canonicalizer;
import com.danubetech.dataintegrity.verifier.LdVerifier;
import com.danubetech.keyformats.crypto.ByteVerifier;
import com.danubetech.keyformats.crypto.impl.Ed25519_EdDSA_PublicKeyVerifier;
import com.danubetech.keyformats.jose.JWSAlgorithm;
import io.ipfs.multibase.Multibase;
import java.security.GeneralSecurityException;
import java.util.HexFormat;
import org.oneedtech.inspect.vc.probe.EmbeddedProofModel;
import org.oneedtech.inspect.vc.probe.EmbeddedProofModelGenerator;

public class Ed25519Signature2022LdVerifier extends LdVerifier<Ed25519Signature2022SignatureSuite>
    implements EmbeddedProofModelGenerator {

  private URDNA2015Canonicalizer canonicalizer;

  public Ed25519Signature2022LdVerifier(ByteVerifier verifier) {

    super(SignatureSuites.SIGNATURE_SUITE_ED25519SIGNATURE2022, verifier);
  }

  public Ed25519Signature2022LdVerifier(byte[] publicKey) {

    this(new Ed25519_EdDSA_PublicKeyVerifier(publicKey));
  }

  public Ed25519Signature2022LdVerifier() {

    this((ByteVerifier) null);
  }

  @Override
  public Canonicalizer getCanonicalizer(DataIntegrityProof dataIntegrityProof) {
    if (canonicalizer == null) {
      canonicalizer = new URDNA2015Canonicalizer(Eddsa2022DataIntegrity.builder());
    }
    return canonicalizer;
  }

  public static boolean verify(
      byte[] signingInput, DataIntegrityProof dataIntegrityProof, ByteVerifier verifier)
      throws GeneralSecurityException {

    // verify

    String proofValue = dataIntegrityProof.getProofValue();
    if (proofValue == null) throw new GeneralSecurityException("No 'proofValue' in proof.");

    boolean verify;

    byte[] bytes = Multibase.decode(proofValue);
    verify = verifier.verify(signingInput, bytes, JWSAlgorithm.EdDSA);

    // done

    return verify;
  }

  @Override
  public boolean verify(byte[] signingInput, DataIntegrityProof dataIntegrityProof)
      throws GeneralSecurityException {

    return verify(signingInput, dataIntegrityProof, this.getVerifier());
  }

  @Override
  public EmbeddedProofModel getGeneratedObject() {
    EmbeddedProofModel model = new EmbeddedProofModel();

    model.addIntermediateValue(
        "ldProofWithoutProofValues", canonicalizer.getLdProofWithoutProofValues().toJson(true));
    model.addIntermediateValue(
        "jsonLdObjectWithoutProof", canonicalizer.getJsonLdObjectWithoutProof().toJson(true));
    model.addIntermediateValue(
        "canonicalizedLdProofWithoutProofValues",
        canonicalizer.getCanonicalizedLdProofWithoutProofValues());
    model.addIntermediateValue(
        "canonicalizedJsonLdObjectWithoutProof",
        canonicalizer.getCanonicalizedJsonLdObjectWithoutProof());
    model.addIntermediateValue(
        "canonicalizationResult",
        HexFormat.of().formatHex(canonicalizer.getCanonicalizationResult()));

    return model;
  }
}
