package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4533u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f64203a = b.f64219a;

    /* JADX INFO: renamed from: com.ironsource.u1$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a extends InterfaceC4533u1 {

        /* JADX INFO: renamed from: com.ironsource.u1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0596a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oy.l
            private final String f64204b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @oy.l
            private final String f64205c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @oy.l
            private final C4523t8.e f64206d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @oy.l
            private final String f64207e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @oy.l
            private final String f64208f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @oy.l
            private final C0597a f64209g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final int f64210h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final int f64211i;

            /* JADX INFO: renamed from: com.ironsource.u1$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public static final class C0597a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f64212a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f64213b;

                public C0597a(int i10, int i11) {
                    this.f64212a = i10;
                    this.f64213b = i11;
                }

                public final int a() {
                    return this.f64212a;
                }

                public final int b() {
                    return this.f64213b;
                }

                public final int c() {
                    return this.f64212a;
                }

                public final int d() {
                    return this.f64213b;
                }

                public boolean equals(@oy.m Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0597a)) {
                        return false;
                    }
                    C0597a c0597a = (C0597a) obj;
                    return this.f64212a == c0597a.f64212a && this.f64213b == c0597a.f64213b;
                }

                public int hashCode() {
                    return (this.f64212a * 31) + this.f64213b;
                }

                @oy.l
                public String toString() {
                    return "Coordinates(x=" + this.f64212a + ", y=" + this.f64213b + gi.j.f86771d;
                }

                @oy.l
                public final C0597a a(int i10, int i11) {
                    return new C0597a(i10, i11);
                }

                public static /* synthetic */ C0597a a(C0597a c0597a, int i10, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i10 = c0597a.f64212a;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = c0597a.f64213b;
                    }
                    return c0597a.a(i10, i11);
                }
            }

            public C0596a(@oy.l String successCallback, @oy.l String failCallback, @oy.l C4523t8.e productType, @oy.l String demandSourceName, @oy.l String url, @oy.l C0597a coordinates, int i10, int i11) {
                kotlin.jvm.internal.m0.p(successCallback, "successCallback");
                kotlin.jvm.internal.m0.p(failCallback, "failCallback");
                kotlin.jvm.internal.m0.p(productType, "productType");
                kotlin.jvm.internal.m0.p(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.m0.p(url, "url");
                kotlin.jvm.internal.m0.p(coordinates, "coordinates");
                this.f64204b = successCallback;
                this.f64205c = failCallback;
                this.f64206d = productType;
                this.f64207e = demandSourceName;
                this.f64208f = url;
                this.f64209g = coordinates;
                this.f64210h = i10;
                this.f64211i = i11;
            }

            @oy.l
            public final C0596a a(@oy.l String successCallback, @oy.l String failCallback, @oy.l C4523t8.e productType, @oy.l String demandSourceName, @oy.l String url, @oy.l C0597a coordinates, int i10, int i11) {
                kotlin.jvm.internal.m0.p(successCallback, "successCallback");
                kotlin.jvm.internal.m0.p(failCallback, "failCallback");
                kotlin.jvm.internal.m0.p(productType, "productType");
                kotlin.jvm.internal.m0.p(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.m0.p(url, "url");
                kotlin.jvm.internal.m0.p(coordinates, "coordinates");
                return new C0596a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i10, i11);
            }

            @Override // com.ironsource.InterfaceC4533u1.a
            @oy.l
            public String b() {
                return this.f64208f;
            }

            @Override // com.ironsource.InterfaceC4533u1
            @oy.l
            public String c() {
                return this.f64205c;
            }

            @Override // com.ironsource.InterfaceC4533u1
            @oy.l
            public C4523t8.e d() {
                return this.f64206d;
            }

            @Override // com.ironsource.InterfaceC4533u1
            @oy.l
            public String e() {
                return this.f64207e;
            }

            public boolean equals(@oy.m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0596a)) {
                    return false;
                }
                C0596a c0596a = (C0596a) obj;
                return kotlin.jvm.internal.m0.g(this.f64204b, c0596a.f64204b) && kotlin.jvm.internal.m0.g(this.f64205c, c0596a.f64205c) && this.f64206d == c0596a.f64206d && kotlin.jvm.internal.m0.g(this.f64207e, c0596a.f64207e) && kotlin.jvm.internal.m0.g(this.f64208f, c0596a.f64208f) && kotlin.jvm.internal.m0.g(this.f64209g, c0596a.f64209g) && this.f64210h == c0596a.f64210h && this.f64211i == c0596a.f64211i;
            }

            @oy.l
            public final String f() {
                return this.f64204b;
            }

            @oy.l
            public final String g() {
                return this.f64205c;
            }

            @oy.l
            public final C4523t8.e h() {
                return this.f64206d;
            }

            public int hashCode() {
                return (((((((((((((this.f64204b.hashCode() * 31) + this.f64205c.hashCode()) * 31) + this.f64206d.hashCode()) * 31) + this.f64207e.hashCode()) * 31) + this.f64208f.hashCode()) * 31) + this.f64209g.hashCode()) * 31) + this.f64210h) * 31) + this.f64211i;
            }

            @oy.l
            public final String i() {
                return this.f64207e;
            }

            @oy.l
            public final String j() {
                return this.f64208f;
            }

            @oy.l
            public final C0597a k() {
                return this.f64209g;
            }

            public final int l() {
                return this.f64210h;
            }

            public final int m() {
                return this.f64211i;
            }

            public final int n() {
                return this.f64210h;
            }

            @oy.l
            public final C0597a o() {
                return this.f64209g;
            }

            public final int p() {
                return this.f64211i;
            }

            @oy.l
            public String toString() {
                return "Click(successCallback=" + this.f64204b + ", failCallback=" + this.f64205c + ", productType=" + this.f64206d + ", demandSourceName=" + this.f64207e + ", url=" + this.f64208f + ", coordinates=" + this.f64209g + ", action=" + this.f64210h + ", metaState=" + this.f64211i + gi.j.f86771d;
            }

            public static /* synthetic */ C0596a a(C0596a c0596a, String str, String str2, C4523t8.e eVar, String str3, String str4, C0597a c0597a, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = c0596a.f64204b;
                }
                if ((i12 & 2) != 0) {
                    str2 = c0596a.f64205c;
                }
                if ((i12 & 4) != 0) {
                    eVar = c0596a.f64206d;
                }
                if ((i12 & 8) != 0) {
                    str3 = c0596a.f64207e;
                }
                if ((i12 & 16) != 0) {
                    str4 = c0596a.f64208f;
                }
                if ((i12 & 32) != 0) {
                    c0597a = c0596a.f64209g;
                }
                if ((i12 & 64) != 0) {
                    i10 = c0596a.f64210h;
                }
                if ((i12 & 128) != 0) {
                    i11 = c0596a.f64211i;
                }
                int i13 = i10;
                int i14 = i11;
                String str5 = str4;
                C0597a c0597a2 = c0597a;
                return c0596a.a(str, str2, eVar, str3, str5, c0597a2, i13, i14);
            }

            @Override // com.ironsource.InterfaceC4533u1
            @oy.l
            public String a() {
                return this.f64204b;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.u1$a$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oy.l
            private final String f64214b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @oy.l
            private final String f64215c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @oy.l
            private final C4523t8.e f64216d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @oy.l
            private final String f64217e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @oy.l
            private final String f64218f;

            public b(@oy.l String successCallback, @oy.l String failCallback, @oy.l C4523t8.e productType, @oy.l String demandSourceName, @oy.l String url) {
                kotlin.jvm.internal.m0.p(successCallback, "successCallback");
                kotlin.jvm.internal.m0.p(failCallback, "failCallback");
                kotlin.jvm.internal.m0.p(productType, "productType");
                kotlin.jvm.internal.m0.p(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.m0.p(url, "url");
                this.f64214b = successCallback;
                this.f64215c = failCallback;
                this.f64216d = productType;
                this.f64217e = demandSourceName;
                this.f64218f = url;
            }

            @oy.l
            public final b a(@oy.l String successCallback, @oy.l String failCallback, @oy.l C4523t8.e productType, @oy.l String demandSourceName, @oy.l String url) {
                kotlin.jvm.internal.m0.p(successCallback, "successCallback");
                kotlin.jvm.internal.m0.p(failCallback, "failCallback");
                kotlin.jvm.internal.m0.p(productType, "productType");
                kotlin.jvm.internal.m0.p(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.m0.p(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC4533u1.a
            @oy.l
            public String b() {
                return this.f64218f;
            }

            @Override // com.ironsource.InterfaceC4533u1
            @oy.l
            public String c() {
                return this.f64215c;
            }

            @Override // com.ironsource.InterfaceC4533u1
            @oy.l
            public C4523t8.e d() {
                return this.f64216d;
            }

            @Override // com.ironsource.InterfaceC4533u1
            @oy.l
            public String e() {
                return this.f64217e;
            }

            public boolean equals(@oy.m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.m0.g(this.f64214b, bVar.f64214b) && kotlin.jvm.internal.m0.g(this.f64215c, bVar.f64215c) && this.f64216d == bVar.f64216d && kotlin.jvm.internal.m0.g(this.f64217e, bVar.f64217e) && kotlin.jvm.internal.m0.g(this.f64218f, bVar.f64218f);
            }

            @oy.l
            public final String f() {
                return this.f64214b;
            }

            @oy.l
            public final String g() {
                return this.f64215c;
            }

            @oy.l
            public final C4523t8.e h() {
                return this.f64216d;
            }

            public int hashCode() {
                return (((((((this.f64214b.hashCode() * 31) + this.f64215c.hashCode()) * 31) + this.f64216d.hashCode()) * 31) + this.f64217e.hashCode()) * 31) + this.f64218f.hashCode();
            }

            @oy.l
            public final String i() {
                return this.f64217e;
            }

            @oy.l
            public final String j() {
                return this.f64218f;
            }

            @oy.l
            public String toString() {
                return "Impression(successCallback=" + this.f64214b + ", failCallback=" + this.f64215c + ", productType=" + this.f64216d + ", demandSourceName=" + this.f64217e + ", url=" + this.f64218f + gi.j.f86771d;
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C4523t8.e eVar, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = bVar.f64214b;
                }
                if ((i10 & 2) != 0) {
                    str2 = bVar.f64215c;
                }
                if ((i10 & 4) != 0) {
                    eVar = bVar.f64216d;
                }
                if ((i10 & 8) != 0) {
                    str3 = bVar.f64217e;
                }
                if ((i10 & 16) != 0) {
                    str4 = bVar.f64218f;
                }
                String str5 = str4;
                C4523t8.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC4533u1
            @oy.l
            public String a() {
                return this.f64214b;
            }
        }

        @oy.l
        String b();
    }

    @oy.l
    String a();

    @oy.l
    String c();

    @oy.l
    C4523t8.e d();

    @oy.l
    String e();

    /* JADX INFO: renamed from: com.ironsource.u1$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f64219a = new b();

        private b() {
        }

        @oy.l
        @cs.o
        public final InterfaceC4533u1 a(@oy.l String jsonString) {
            kotlin.jvm.internal.m0.p(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (kotlin.jvm.internal.m0.g(strOptString, C4253e4.f61605c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + strOptString);
        }

        private final a a(JSONObject jSONObject) throws JSONException {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(C4235d4.g.f61370e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(C4235d4.i.f61426m);
            kotlin.jvm.internal.m0.o(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C4523t8.e eVarValueOf = C4523t8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (kotlin.jvm.internal.m0.g(strOptString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(C4253e4.f61608f);
                int i10 = jSONObject3.getInt(C4253e4.f61609g);
                int i11 = jSONObject3.getInt(C4253e4.f61610h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(C4253e4.f61612j, 0);
                kotlin.jvm.internal.m0.o(successCallback, "successCallback");
                kotlin.jvm.internal.m0.o(failCallback, "failCallback");
                kotlin.jvm.internal.m0.o(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.m0.o(url, "url");
                return new a.C0596a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C0596a.C0597a(i10, i11), iOptInt, iOptInt2);
            }
            if (kotlin.jvm.internal.m0.g(strOptString, "impression")) {
                kotlin.jvm.internal.m0.o(successCallback, "successCallback");
                kotlin.jvm.internal.m0.o(failCallback, "failCallback");
                kotlin.jvm.internal.m0.o(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.m0.o(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }
}
