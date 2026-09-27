package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g[] f69980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g[] f69981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f69982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f69983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f69984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f69985j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f69986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f69987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.h
    final String[] f69988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @zq.h
    final String[] f69989d;

    static {
        g gVar = g.f69581n1;
        g gVar2 = g.f69584o1;
        g gVar3 = g.f69587p1;
        g gVar4 = g.f69590q1;
        g gVar5 = g.f69593r1;
        g gVar6 = g.Z0;
        g gVar7 = g.f69551d1;
        g gVar8 = g.f69542a1;
        g gVar9 = g.f69554e1;
        g gVar10 = g.f69572k1;
        g gVar11 = g.f69569j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f69980e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.K0, g.L0, g.f69565i0, g.f69568j0, g.G, g.K, g.f69570k};
        f69981f = gVarArr2;
        a aVarA = new a(true).a(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f69982g = aVarA.a(d0Var, d0Var2).a(true).a();
        a aVarA2 = new a(true).a(gVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        f69983h = aVarA2.a(d0Var, d0Var2, d0.TLS_1_1, d0Var3).a(true).a();
        f69984i = new a(true).a(gVarArr2).a(d0Var3).a(true).a();
        f69985j = new a(false).a();
    }

    public j(a aVar) {
        this.f69986a = aVar.f69990a;
        this.f69988c = aVar.f69991b;
        this.f69989d = aVar.f69992c;
        this.f69987b = aVar.f69993d;
    }

    @zq.h
    public List<g> a() {
        String[] strArr = this.f69988c;
        if (strArr != null) {
            return g.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.f69986a;
    }

    public boolean c() {
        return this.f69987b;
    }

    @zq.h
    public List<d0> d() {
        String[] strArr = this.f69989d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(@zq.h Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f69986a;
        if (z10 != jVar.f69986a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f69988c, jVar.f69988c) && Arrays.equals(this.f69989d, jVar.f69989d) && this.f69987b == jVar.f69987b);
    }

    public int hashCode() {
        if (this.f69986a) {
            return ((((Arrays.hashCode(this.f69988c) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f69989d)) * 31) + (!this.f69987b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f69986a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f69988c != null ? a().toString() : "[all enabled]") + ", tlsVersions=" + (this.f69989d != null ? d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f69987b + gi.j.f86771d;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f69990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.h
        String[] f69991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @zq.h
        String[] f69992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f69993d;

        public a(boolean z10) {
            this.f69990a = z10;
        }

        public a a(g... gVarArr) {
            if (!this.f69990a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                strArr[i10] = gVarArr[i10].f69610a;
            }
            return a(strArr);
        }

        public a b(String... strArr) {
            if (!this.f69990a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f69992c = (String[]) strArr.clone();
            return this;
        }

        public a(j jVar) {
            this.f69990a = jVar.f69986a;
            this.f69991b = jVar.f69988c;
            this.f69992c = jVar.f69989d;
            this.f69993d = jVar.f69987b;
        }

        public a a(String... strArr) {
            if (this.f69990a) {
                if (strArr.length != 0) {
                    this.f69991b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.f69990a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i10 = 0; i10 < d0VarArr.length; i10++) {
                    strArr[i10] = d0VarArr[i10].f69532a;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z10) {
            if (this.f69990a) {
                this.f69993d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public j a() {
            return new j(this);
        }
    }

    private j b(SSLSocket sSLSocket, boolean z10) {
        String[] strArrA = this.f69988c != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f69543b, sSLSocket.getEnabledCipherSuites(), this.f69988c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrA2 = this.f69989d != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.f69638q, sSLSocket.getEnabledProtocols(), this.f69989d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(g.f69543b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && iA != -1) {
            strArrA = com.mbridge.msdk.thrid.okhttp.internal.c.a(strArrA, supportedCipherSuites[iA]);
        }
        return new a(this).a(strArrA).b(strArrA2).a();
    }

    public void a(SSLSocket sSLSocket, boolean z10) {
        j jVarB = b(sSLSocket, z10);
        String[] strArr = jVarB.f69989d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = jVarB.f69988c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f69986a) {
            return false;
        }
        String[] strArr = this.f69989d;
        if (strArr != null && !com.mbridge.msdk.thrid.okhttp.internal.c.b(com.mbridge.msdk.thrid.okhttp.internal.c.f69638q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f69988c;
        return strArr2 == null || com.mbridge.msdk.thrid.okhttp.internal.c.b(g.f69543b, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
