package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@zv.b0
public final class z6 {

    @oy.l
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41713c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public b() {
        }

        public final z6 a() {
            return new z6("https://da.chartboost.com/unified/v1/sdk/banner", "https://da.chartboost.com/unified/v1/sdk/interstitial", "https://da.chartboost.com/unified/v1/sdk/rewarded");
        }

        @oy.l
        public final zv.j<z6> serializer() {
            return a.f41714a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public /* synthetic */ z6(int i10, String str, String str2, String str3, dw.w2 w2Var) {
        if ((i10 & 1) == 0) {
            this.f41711a = "";
        } else {
            this.f41711a = str;
        }
        if ((i10 & 2) == 0) {
            this.f41712b = "";
        } else {
            this.f41712b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f41713c = "";
        } else {
            this.f41713c = str3;
        }
    }

    public final String a() {
        return this.f41711a;
    }

    public final String b() {
        return this.f41712b;
    }

    public final String c() {
        return this.f41713c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return kotlin.jvm.internal.m0.g(this.f41711a, z6Var.f41711a) && kotlin.jvm.internal.m0.g(this.f41712b, z6Var.f41712b) && kotlin.jvm.internal.m0.g(this.f41713c, z6Var.f41713c);
    }

    public int hashCode() {
        return (((this.f41711a.hashCode() * 31) + this.f41712b.hashCode()) * 31) + this.f41713c.hashCode();
    }

    public String toString() {
        return "EndpointConfig(banner=" + this.f41711a + ", interstitial=" + this.f41712b + ", rewarded=" + this.f41713c + gi.j.f86771d;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements dw.p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ dw.l2 f41715b;

        static {
            a aVar = new a();
            f41714a = aVar;
            dw.l2 l2Var = new dw.l2("com.chartboost.sdk.internal.Model.EndpointConfig", aVar, 3);
            l2Var.o("banner", true);
            l2Var.o("interstitial", true);
            l2Var.o("rewarded", true);
            f41715b = l2Var;
        }

        @Override // zv.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z6 deserialize(cw.f decoder) {
            String strJ;
            String strJ2;
            String str;
            int i10;
            kotlin.jvm.internal.m0.p(decoder, "decoder");
            bw.f descriptor = getDescriptor();
            cw.d dVarB = decoder.b(descriptor);
            if (dVarB.h()) {
                strJ = dVarB.J(descriptor, 0);
                String strJ3 = dVarB.J(descriptor, 1);
                strJ2 = dVarB.J(descriptor, 2);
                str = strJ3;
                i10 = 7;
            } else {
                strJ = null;
                String strJ4 = null;
                String strJ5 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iZ = dVarB.z(descriptor);
                    if (iZ == -1) {
                        z10 = false;
                    } else if (iZ == 0) {
                        strJ = dVarB.J(descriptor, 0);
                        i11 |= 1;
                    } else if (iZ == 1) {
                        strJ5 = dVarB.J(descriptor, 1);
                        i11 |= 2;
                    } else {
                        if (iZ != 2) {
                            throw new zv.t0(iZ);
                        }
                        strJ4 = dVarB.J(descriptor, 2);
                        i11 |= 4;
                    }
                }
                strJ2 = strJ4;
                str = strJ5;
                i10 = i11;
            }
            String str2 = strJ;
            dVarB.c(descriptor);
            return new z6(i10, str2, str, strJ2, null);
        }

        @Override // dw.p0
        public zv.j[] childSerializers() {
            dw.c3 c3Var = dw.c3.f79541a;
            return new zv.j[]{c3Var, c3Var, c3Var};
        }

        @Override // zv.j, zv.d0, zv.e
        public bw.f getDescriptor() {
            return f41715b;
        }

        @Override // dw.p0
        public zv.j[] typeParametersSerializers() {
            return dw.p0.a.a(this);
        }

        @Override // zv.d0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(cw.h encoder, z6 value) {
            kotlin.jvm.internal.m0.p(encoder, "encoder");
            kotlin.jvm.internal.m0.p(value, "value");
            bw.f descriptor = getDescriptor();
            cw.e eVarB = encoder.b(descriptor);
            z6.a(value, eVarB, descriptor);
            eVarB.c(descriptor);
        }
    }

    public static final /* synthetic */ void a(z6 z6Var, cw.e eVar, bw.f fVar) {
        if (eVar.q(fVar, 0) || !kotlin.jvm.internal.m0.g(z6Var.f41711a, "")) {
            eVar.v(fVar, 0, z6Var.f41711a);
        }
        if (eVar.q(fVar, 1) || !kotlin.jvm.internal.m0.g(z6Var.f41712b, "")) {
            eVar.v(fVar, 1, z6Var.f41712b);
        }
        if (!eVar.q(fVar, 2) && kotlin.jvm.internal.m0.g(z6Var.f41713c, "")) {
            return;
        }
        eVar.v(fVar, 2, z6Var.f41713c);
    }

    public z6(String banner, String interstitial, String rewarded) {
        kotlin.jvm.internal.m0.p(banner, "banner");
        kotlin.jvm.internal.m0.p(interstitial, "interstitial");
        kotlin.jvm.internal.m0.p(rewarded, "rewarded");
        this.f41711a = banner;
        this.f41712b = interstitial;
        this.f41713c = rewarded;
    }
}
