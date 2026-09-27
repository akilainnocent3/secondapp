package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ye, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4614ye {

    /* JADX INFO: renamed from: com.ironsource.ye$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements InterfaceC4614ye {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final C4426ne f64525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        private final String f64526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        private final String f64527c;

        public a(@oy.l C4426ne error, @oy.m String str, @oy.m String str2) {
            kotlin.jvm.internal.m0.p(error, "error");
            this.f64525a = error;
            this.f64526b = str;
            this.f64527c = str2;
        }

        @oy.l
        public final C4426ne a() {
            return this.f64525a;
        }

        @oy.m
        public final String b() {
            return this.f64526b;
        }

        @oy.m
        public final String c() {
            return this.f64527c;
        }

        @oy.l
        public final C4426ne d() {
            return this.f64525a;
        }

        @oy.m
        public final String e() {
            return this.f64527c;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.m0.g(this.f64525a, aVar.f64525a) && kotlin.jvm.internal.m0.g(this.f64526b, aVar.f64526b) && kotlin.jvm.internal.m0.g(this.f64527c, aVar.f64527c);
        }

        @oy.m
        public final String f() {
            return this.f64526b;
        }

        public int hashCode() {
            int iHashCode = this.f64525a.hashCode() * 31;
            String str = this.f64526b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f64527c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @oy.l
        public String toString() {
            return "Failure(error=" + this.f64525a + ", url=" + this.f64526b + ", json=" + this.f64527c + gi.j.f86771d;
        }

        public /* synthetic */ a(C4426ne c4426ne, String str, String str2, int i10, kotlin.jvm.internal.x xVar) {
            this(c4426ne, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
        }

        @oy.l
        public final a a(@oy.l C4426ne error, @oy.m String str, @oy.m String str2) {
            kotlin.jvm.internal.m0.p(error, "error");
            return new a(error, str, str2);
        }

        public static /* synthetic */ a a(a aVar, C4426ne c4426ne, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c4426ne = aVar.f64525a;
            }
            if ((i10 & 2) != 0) {
                str = aVar.f64526b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f64527c;
            }
            return aVar.a(c4426ne, str, str2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ye$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements InterfaceC4614ye {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final C4546ue f64528a;

        public b(@oy.l C4546ue sdkInitResponse) {
            kotlin.jvm.internal.m0.p(sdkInitResponse, "sdkInitResponse");
            this.f64528a = sdkInitResponse;
        }

        @oy.l
        public final C4546ue a() {
            return this.f64528a;
        }

        @oy.l
        public final C4546ue b() {
            return this.f64528a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.m0.g(this.f64528a, ((b) obj).f64528a);
        }

        public int hashCode() {
            return this.f64528a.hashCode();
        }

        @oy.l
        public String toString() {
            return "Success(sdkInitResponse=" + this.f64528a + gi.j.f86771d;
        }

        @oy.l
        public final b a(@oy.l C4546ue sdkInitResponse) {
            kotlin.jvm.internal.m0.p(sdkInitResponse, "sdkInitResponse");
            return new b(sdkInitResponse);
        }

        public static /* synthetic */ b a(b bVar, C4546ue c4546ue, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c4546ue = bVar.f64528a;
            }
            return bVar.a(c4546ue);
        }
    }
}
