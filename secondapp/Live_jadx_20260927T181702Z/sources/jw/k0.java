package jw;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum k0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f101269b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ sr.a f101268l = sr.c.c(d());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f101259c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @cs.o
        public final k0 a(@oy.l String protocol) throws IOException {
            kotlin.jvm.internal.m0.p(protocol, "protocol");
            k0 k0Var = k0.HTTP_1_0;
            if (kotlin.jvm.internal.m0.g(protocol, k0Var.f101269b)) {
                return k0Var;
            }
            k0 k0Var2 = k0.HTTP_1_1;
            if (kotlin.jvm.internal.m0.g(protocol, k0Var2.f101269b)) {
                return k0Var2;
            }
            k0 k0Var3 = k0.H2_PRIOR_KNOWLEDGE;
            if (kotlin.jvm.internal.m0.g(protocol, k0Var3.f101269b)) {
                return k0Var3;
            }
            k0 k0Var4 = k0.HTTP_2;
            if (kotlin.jvm.internal.m0.g(protocol, k0Var4.f101269b)) {
                return k0Var4;
            }
            k0 k0Var5 = k0.SPDY_3;
            if (kotlin.jvm.internal.m0.g(protocol, k0Var5.f101269b)) {
                return k0Var5;
            }
            k0 k0Var6 = k0.QUIC;
            if (kotlin.jvm.internal.m0.g(protocol, k0Var6.f101269b)) {
                return k0Var6;
            }
            k0 k0Var7 = k0.HTTP_3;
            if (cv.k0.J2(protocol, k0Var7.f101269b, false, 2, null)) {
                return k0Var7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public a() {
        }
    }

    k0(String str) {
        this.f101269b = str;
    }

    @oy.l
    @cs.o
    public static final k0 f(@oy.l String str) throws IOException {
        return f101259c.a(str);
    }

    @oy.l
    public static sr.a<k0> g() {
        return f101268l;
    }

    @Override // java.lang.Enum
    @oy.l
    public String toString() {
        return this.f101269b;
    }
}
