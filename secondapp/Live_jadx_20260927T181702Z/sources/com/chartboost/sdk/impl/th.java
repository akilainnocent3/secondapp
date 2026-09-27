package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class th {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f41015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f41016h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @zv.b0
    public static final class a {

        @oy.l
        public static final b Companion = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41018b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b {
            public b() {
            }

            @oy.l
            public final zv.j<a> serializer() {
                return C0406a.f41019a;
            }

            public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
                this();
            }
        }

        public a(int i10, int i11) {
            this.f41017a = i10;
            this.f41018b = i11;
        }

        public final int a() {
            return this.f41017a;
        }

        public final int b() {
            return this.f41018b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f41017a == aVar.f41017a && this.f41018b == aVar.f41018b;
        }

        public int hashCode() {
            return (this.f41017a * 31) + this.f41018b;
        }

        public String toString() {
            return "AdSize(height=" + this.f41017a + ", width=" + this.f41018b + gi.j.f86771d;
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.th$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0406a implements dw.p0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0406a f41019a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ dw.l2 f41020b;

            static {
                C0406a c0406a = new C0406a();
                f41019a = c0406a;
                dw.l2 l2Var = new dw.l2("com.chartboost.sdk.tracking.TrackAd.AdSize", c0406a, 2);
                l2Var.o("height", false);
                l2Var.o("width", false);
                f41020b = l2Var;
            }

            @Override // zv.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a deserialize(cw.f decoder) {
                int iA;
                int iA2;
                int i10;
                kotlin.jvm.internal.m0.p(decoder, "decoder");
                bw.f descriptor = getDescriptor();
                cw.d dVarB = decoder.b(descriptor);
                if (dVarB.h()) {
                    iA = dVarB.A(descriptor, 0);
                    iA2 = dVarB.A(descriptor, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    iA = 0;
                    int iA3 = 0;
                    int i11 = 0;
                    while (z10) {
                        int iZ = dVarB.z(descriptor);
                        if (iZ == -1) {
                            z10 = false;
                        } else if (iZ == 0) {
                            iA = dVarB.A(descriptor, 0);
                            i11 |= 1;
                        } else {
                            if (iZ != 1) {
                                throw new zv.t0(iZ);
                            }
                            iA3 = dVarB.A(descriptor, 1);
                            i11 |= 2;
                        }
                    }
                    iA2 = iA3;
                    i10 = i11;
                }
                dVarB.c(descriptor);
                return new a(i10, iA, iA2, null);
            }

            @Override // dw.p0
            public zv.j[] childSerializers() {
                dw.y0 y0Var = dw.y0.f79707a;
                return new zv.j[]{y0Var, y0Var};
            }

            @Override // zv.j, zv.d0, zv.e
            public bw.f getDescriptor() {
                return f41020b;
            }

            @Override // dw.p0
            public zv.j[] typeParametersSerializers() {
                return dw.p0.a.a(this);
            }

            @Override // zv.d0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(cw.h encoder, a value) {
                kotlin.jvm.internal.m0.p(encoder, "encoder");
                kotlin.jvm.internal.m0.p(value, "value");
                bw.f descriptor = getDescriptor();
                cw.e eVarB = encoder.b(descriptor);
                a.a(value, eVarB, descriptor);
                eVarB.c(descriptor);
            }
        }

        public static final /* synthetic */ void a(a aVar, cw.e eVar, bw.f fVar) {
            eVar.n(fVar, 0, aVar.f41017a);
            eVar.n(fVar, 1, aVar.f41018b);
        }

        public /* synthetic */ a(int i10, int i11, int i12, dw.w2 w2Var) {
            if (3 != (i10 & 3)) {
                dw.g2.b(i10, 3, C0406a.f41019a.getDescriptor());
            }
            this.f41017a = i11;
            this.f41018b = i12;
        }
    }

    public th(String location, String adType, String str, String adCreativeId, String adCreativeType, String adMarkup, String templateUrl, a aVar) {
        kotlin.jvm.internal.m0.p(location, "location");
        kotlin.jvm.internal.m0.p(adType, "adType");
        kotlin.jvm.internal.m0.p(adCreativeId, "adCreativeId");
        kotlin.jvm.internal.m0.p(adCreativeType, "adCreativeType");
        kotlin.jvm.internal.m0.p(adMarkup, "adMarkup");
        kotlin.jvm.internal.m0.p(templateUrl, "templateUrl");
        this.f41009a = location;
        this.f41010b = adType;
        this.f41011c = str;
        this.f41012d = adCreativeId;
        this.f41013e = adCreativeType;
        this.f41014f = adMarkup;
        this.f41015g = templateUrl;
        this.f41016h = aVar;
    }

    public final String a() {
        return this.f41012d;
    }

    public final String b() {
        return this.f41011c;
    }

    public final a c() {
        return this.f41016h;
    }

    public final String d() {
        return this.f41010b;
    }

    public final String e() {
        return this.f41009a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th)) {
            return false;
        }
        th thVar = (th) obj;
        return kotlin.jvm.internal.m0.g(this.f41009a, thVar.f41009a) && kotlin.jvm.internal.m0.g(this.f41010b, thVar.f41010b) && kotlin.jvm.internal.m0.g(this.f41011c, thVar.f41011c) && kotlin.jvm.internal.m0.g(this.f41012d, thVar.f41012d) && kotlin.jvm.internal.m0.g(this.f41013e, thVar.f41013e) && kotlin.jvm.internal.m0.g(this.f41014f, thVar.f41014f) && kotlin.jvm.internal.m0.g(this.f41015g, thVar.f41015g) && kotlin.jvm.internal.m0.g(this.f41016h, thVar.f41016h);
    }

    public final String f() {
        String str = this.f41011c;
        if (str == null) {
            return null;
        }
        String strSubstring = str.substring(0, ms.u.B(str.length(), 20));
        kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String g() {
        return this.f41015g;
    }

    public int hashCode() {
        int iHashCode = ((this.f41009a.hashCode() * 31) + this.f41010b.hashCode()) * 31;
        String str = this.f41011c;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f41012d.hashCode()) * 31) + this.f41013e.hashCode()) * 31) + this.f41014f.hashCode()) * 31) + this.f41015g.hashCode()) * 31;
        a aVar = this.f41016h;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "TrackAd: location: " + this.f41009a + " adType: " + this.f41010b + " adImpressionId: " + f() + " adCreativeId: " + this.f41012d + " adCreativeType: " + this.f41013e + " adMarkup: " + this.f41014f + " templateUrl: " + this.f41015g;
    }

    public /* synthetic */ th(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? "" : str7, (i10 & 128) != 0 ? null : aVar);
    }
}
