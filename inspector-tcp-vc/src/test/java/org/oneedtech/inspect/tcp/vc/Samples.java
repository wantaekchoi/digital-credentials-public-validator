package org.oneedtech.inspect.tcp.vc;

import org.oneedtech.inspect.test.Sample;

public class Samples {
	public static final class TCP {
        public final static Sample PORTABILITY_JSON = new Sample("tcp/LER-RS_V2_UC008_portability.json", true);
        public final static Sample EXCHANGING_JSON = new Sample("tcp/LER-RS_V2_UC009_exchanging.json", true);
        public final static Sample APPLYING_JSON = new Sample("tcp/LER-RS_V2_UC010_applying.json", true);
        public final static Sample WRAPPER_JSON = new Sample("tcp/LER-RS_V2_VCwrapper.json", true);
    }
}