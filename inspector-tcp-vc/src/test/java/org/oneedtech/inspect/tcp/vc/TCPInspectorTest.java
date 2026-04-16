package org.oneedtech.inspect.tcp.vc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.oneedtech.inspect.test.Assertions.assertValid;
import static org.oneedtech.inspect.test.Assertions.assertErrorCount;
import static org.oneedtech.inspect.test.Assertions.assertInvalid;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.oneedtech.inspect.core.Inspector.Behavior;
import org.oneedtech.inspect.core.report.Report;
import org.oneedtech.inspect.test.PrintHelper;
import org.oneedtech.inspect.util.resource.ResourceType;

public class TCPInspectorTest {
	private static TCPInspector validator;
	private static boolean verbose = true;

	@BeforeAll
	static void setup() {
		validator = new TCPInspector.Builder()
				.set(Behavior.TEST_INCLUDE_SUCCESS, true)
				.set(Behavior.VALIDATOR_FAIL_FAST, true)
				.build();
	}

	@Test
	void testPortabilityJsonValid() {
		assertDoesNotThrow(()->{
			Report report = validator.run(Samples.TCP.PORTABILITY_JSON.asFileResource(ResourceType.JSON));
			if(verbose) PrintHelper.print(report, true);
			// example has several errors:
			// - an invalid signature
			// - invalid JSON-LD in credentialSubject.educationAndLearnings[1].verifications[1]
			// - Key controller doesn't match issuer in credentialSubject.educationAndLearnings[1].verifications[1]
			assertInvalid(report);
			assertErrorCount(report, 3);
		});
	}

	@Test
	void testExchangingJsonValid() {
		assertDoesNotThrow(()->{
			Report report = validator.run(Samples.TCP.EXCHANGING_JSON.asFileResource(ResourceType.JSON));
			if(verbose) PrintHelper.print(report, true);
			// example has several errors:
			// - an invalid signature
			// - invalid JSON-LD in credentialSubject.educationAndLearnings[1].verifications[1]
			// - Key controller doesn't match issuer in credentialSubject.educationAndLearnings[1].verifications[1]
			assertInvalid(report);
			assertErrorCount(report, 3);
		});
	}

	@Test
	void testApplyingJsonValid() {
		assertDoesNotThrow(()->{
			Report report = validator.run(Samples.TCP.APPLYING_JSON.asFileResource(ResourceType.JSON));
			if(verbose) PrintHelper.print(report, true);
			// example has several errors:
			// - an invalid signature
			// - invalid JSON-LD in credentialSubject.educationAndLearnings[1].verifications[1]
			// - Key controller doesn't match issuer in credentialSubject.educationAndLearnings[1].verifications[1]
			assertInvalid(report);
			assertErrorCount(report, 3);
		});
	}

	@Test
	void testWrapperJsonValid() {
		assertDoesNotThrow(()->{
			Report report = validator.run(Samples.TCP.WRAPPER_JSON.asFileResource(ResourceType.JSON));
			if(verbose) PrintHelper.print(report, true);
			// example has several errors:
			// - an invalid signature
			assertInvalid(report);
			assertErrorCount(report, 1);
		});
	}

}
