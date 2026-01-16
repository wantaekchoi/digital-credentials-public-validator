package org.oneedtech.inspect.tcp.vc;

import static org.oneedtech.inspect.vc.VerifiableCredential.Type.TcpVc;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;
import org.oneedtech.inspect.schema.SchemaKey;
import org.oneedtech.inspect.tcp.vc.schema.TCPCatalog;
import org.oneedtech.inspect.util.resource.Resource;
import org.oneedtech.inspect.vc.VerifiableCredential;

public class TCPCredential extends VerifiableCredential {
  private static final Map<CredentialEnum, SchemaKey> schemas =
      Map.of(TcpVc, TCPCatalog.TCP_VC_JSON);

  protected TCPCredential(
      Resource resource,
      JsonNode data,
      String jwt,
      Map<CredentialEnum, SchemaKey> schemas,
      VCVersion version) {
    super(resource, data, jwt, schemas, version);
  }

  public static class Builder extends VerifiableCredential.Builder {
    @Override
    public TCPCredential build() {
      VCVersion version = VCVersion.of(getJsonData().get("@context"));

      return new TCPCredential(getResource(), getJsonData(), getJwt(), schemas, version);
    }
  }
}
