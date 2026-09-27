package com.applovin.shadow.okhttp3;

import cs.o;
import java.io.IOException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final String protocol;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        @o
        public final Protocol get(@l String protocol) throws IOException {
            m0.p(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (m0.g(protocol, protocol2.protocol)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.HTTP_1_1;
            if (m0.g(protocol, protocol3.protocol)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (m0.g(protocol, protocol4.protocol)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.HTTP_2;
            if (m0.g(protocol, protocol5.protocol)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.SPDY_3;
            if (m0.g(protocol, protocol6.protocol)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.QUIC;
            if (m0.g(protocol, protocol7.protocol)) {
                return protocol7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @l
    @o
    public static final Protocol get(@l String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    @l
    public String toString() {
        return this.protocol;
    }
}
