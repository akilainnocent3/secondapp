package com.applovin.shadow.okhttp3;

import cs.j;
import cs.o;
import dr.g1;
import dr.q;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final String javaName;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @l
        @o
        public final TlsVersion forJavaName(@l String javaName) {
            m0.p(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        private Companion() {
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    @l
    @o
    public static final TlsVersion forJavaName(@l String str) {
        return Companion.forJavaName(str);
    }

    @j(name = "-deprecated_javaName")
    @l
    @dr.o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "javaName", imports = {}))
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m135deprecated_javaName() {
        return this.javaName;
    }

    @j(name = "javaName")
    @l
    public final String javaName() {
        return this.javaName;
    }
}
