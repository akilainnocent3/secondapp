package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final String f59062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final String f59063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final String f59064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private final String f59065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    private final Drawable f59066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private final WebView f59067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    private final View f59068g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nISNNativeAdData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ISNNativeAdData.kt\ncom/ironsource/sdk/nativeAd/ISNNativeAdData$Report\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final a f59071a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.m
            private final String f59072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oy.m
            private final String f59073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @oy.m
            private final String f59074c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @oy.m
            private final String f59075d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @oy.m
            private final dr.i1<Drawable> f59076e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @oy.m
            private final dr.i1<WebView> f59077f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @oy.l
            private final View f59078g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@oy.m String str, @oy.m String str2, @oy.m String str3, @oy.m String str4, @oy.m dr.i1<? extends Drawable> i1Var, @oy.m dr.i1<? extends WebView> i1Var2, @oy.l View privacyIcon) {
                kotlin.jvm.internal.m0.p(privacyIcon, "privacyIcon");
                this.f59072a = str;
                this.f59073b = str2;
                this.f59074c = str3;
                this.f59075d = str4;
                this.f59076e = i1Var;
                this.f59077f = i1Var2;
                this.f59078g = privacyIcon;
            }

            @oy.m
            public final String a() {
                return this.f59072a;
            }

            @oy.m
            public final String b() {
                return this.f59073b;
            }

            @oy.m
            public final String c() {
                return this.f59074c;
            }

            @oy.m
            public final String d() {
                return this.f59075d;
            }

            @oy.m
            public final dr.i1<Drawable> e() {
                return this.f59076e;
            }

            public boolean equals(@oy.m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.m0.g(this.f59072a, aVar.f59072a) && kotlin.jvm.internal.m0.g(this.f59073b, aVar.f59073b) && kotlin.jvm.internal.m0.g(this.f59074c, aVar.f59074c) && kotlin.jvm.internal.m0.g(this.f59075d, aVar.f59075d) && kotlin.jvm.internal.m0.g(this.f59076e, aVar.f59076e) && kotlin.jvm.internal.m0.g(this.f59077f, aVar.f59077f) && kotlin.jvm.internal.m0.g(this.f59078g, aVar.f59078g);
            }

            @oy.m
            public final dr.i1<WebView> f() {
                return this.f59077f;
            }

            @oy.l
            public final View g() {
                return this.f59078g;
            }

            @oy.l
            public final G8 h() {
                Drawable drawable;
                String str = this.f59072a;
                String str2 = this.f59073b;
                String str3 = this.f59074c;
                String str4 = this.f59075d;
                dr.i1<Drawable> i1Var = this.f59076e;
                WebView webView = null;
                if (i1Var != null) {
                    Object objL = i1Var.l();
                    if (dr.i1.i(objL)) {
                        objL = null;
                    }
                    drawable = (Drawable) objL;
                } else {
                    drawable = null;
                }
                dr.i1<WebView> i1Var2 = this.f59077f;
                if (i1Var2 != null) {
                    Object objL2 = i1Var2.l();
                    webView = (WebView) (dr.i1.i(objL2) ? null : objL2);
                }
                return new G8(str, str2, str3, str4, drawable, webView, this.f59078g);
            }

            public int hashCode() {
                String str = this.f59072a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f59073b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f59074c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f59075d;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                dr.i1<Drawable> i1Var = this.f59076e;
                int iH = (iHashCode4 + (i1Var == null ? 0 : dr.i1.h(i1Var.l()))) * 31;
                dr.i1<WebView> i1Var2 = this.f59077f;
                return ((iH + (i1Var2 != null ? dr.i1.h(i1Var2.l()) : 0)) * 31) + this.f59078g.hashCode();
            }

            @oy.m
            public final String i() {
                return this.f59073b;
            }

            @oy.m
            public final String j() {
                return this.f59074c;
            }

            @oy.m
            public final String k() {
                return this.f59075d;
            }

            @oy.m
            public final dr.i1<Drawable> l() {
                return this.f59076e;
            }

            @oy.m
            public final dr.i1<WebView> m() {
                return this.f59077f;
            }

            @oy.l
            public final View n() {
                return this.f59078g;
            }

            @oy.m
            public final String o() {
                return this.f59072a;
            }

            @oy.l
            public String toString() {
                return "Data(title=" + this.f59072a + ", advertiser=" + this.f59073b + ", body=" + this.f59074c + ", cta=" + this.f59075d + ", icon=" + this.f59076e + ", media=" + this.f59077f + ", privacyIcon=" + this.f59078g + gi.j.f86771d;
            }

            @oy.l
            public final a a(@oy.m String str, @oy.m String str2, @oy.m String str3, @oy.m String str4, @oy.m dr.i1<? extends Drawable> i1Var, @oy.m dr.i1<? extends WebView> i1Var2, @oy.l View privacyIcon) {
                kotlin.jvm.internal.m0.p(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, i1Var, i1Var2, privacyIcon);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, dr.i1 i1Var, dr.i1 i1Var2, View view, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f59072a;
                }
                if ((i10 & 2) != 0) {
                    str2 = aVar.f59073b;
                }
                if ((i10 & 4) != 0) {
                    str3 = aVar.f59074c;
                }
                if ((i10 & 8) != 0) {
                    str4 = aVar.f59075d;
                }
                if ((i10 & 16) != 0) {
                    i1Var = aVar.f59076e;
                }
                if ((i10 & 32) != 0) {
                    i1Var2 = aVar.f59077f;
                }
                if ((i10 & 64) != 0) {
                    view = aVar.f59078g;
                }
                dr.i1 i1Var3 = i1Var2;
                View view2 = view;
                dr.i1 i1Var4 = i1Var;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, i1Var4, i1Var3, view2);
            }
        }

        public b(@oy.l a data) {
            kotlin.jvm.internal.m0.p(data, "data");
            this.f59071a = data;
        }

        @oy.l
        public final a a() {
            return this.f59071a;
        }

        @oy.l
        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (this.f59071a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.f59071a.i() != null) {
                a(jSONObject, C4235d4.i.F0);
            }
            if (this.f59071a.j() != null) {
                a(jSONObject, "body");
            }
            if (this.f59071a.k() != null) {
                a(jSONObject, C4235d4.i.G0);
            }
            dr.i1<Drawable> i1VarL = this.f59071a.l();
            if (i1VarL != null) {
                a(jSONObject, "icon", i1VarL.l());
            }
            dr.i1<WebView> i1VarM = this.f59071a.m();
            if (i1VarM != null) {
                a(jSONObject, "media", i1VarM.l());
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", dr.i1.j(obj));
            Throwable thE = dr.i1.e(obj);
            if (thE != null) {
                String message = thE.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            dr.w2 w2Var = dr.w2.f79517a;
            jSONObject.put(str, jSONObject2);
        }
    }

    public G8(@oy.m String str, @oy.m String str2, @oy.m String str3, @oy.m String str4, @oy.m Drawable drawable, @oy.m WebView webView, @oy.l View privacyIcon) {
        kotlin.jvm.internal.m0.p(privacyIcon, "privacyIcon");
        this.f59062a = str;
        this.f59063b = str2;
        this.f59064c = str3;
        this.f59065d = str4;
        this.f59066e = drawable;
        this.f59067f = webView;
        this.f59068g = privacyIcon;
    }

    @oy.m
    public final String a() {
        return this.f59062a;
    }

    @oy.m
    public final String b() {
        return this.f59063b;
    }

    @oy.m
    public final String c() {
        return this.f59064c;
    }

    @oy.m
    public final String d() {
        return this.f59065d;
    }

    @oy.m
    public final Drawable e() {
        return this.f59066e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g10 = (G8) obj;
        return kotlin.jvm.internal.m0.g(this.f59062a, g10.f59062a) && kotlin.jvm.internal.m0.g(this.f59063b, g10.f59063b) && kotlin.jvm.internal.m0.g(this.f59064c, g10.f59064c) && kotlin.jvm.internal.m0.g(this.f59065d, g10.f59065d) && kotlin.jvm.internal.m0.g(this.f59066e, g10.f59066e) && kotlin.jvm.internal.m0.g(this.f59067f, g10.f59067f) && kotlin.jvm.internal.m0.g(this.f59068g, g10.f59068g);
    }

    @oy.m
    public final WebView f() {
        return this.f59067f;
    }

    @oy.l
    public final View g() {
        return this.f59068g;
    }

    @oy.m
    public final String h() {
        return this.f59063b;
    }

    public int hashCode() {
        String str = this.f59062a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59063b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59064c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59065d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f59066e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f59067f;
        return ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.f59068g.hashCode();
    }

    @oy.m
    public final String i() {
        return this.f59064c;
    }

    @oy.m
    public final String j() {
        return this.f59065d;
    }

    @oy.m
    public final Drawable k() {
        return this.f59066e;
    }

    @oy.m
    public final WebView l() {
        return this.f59067f;
    }

    @oy.l
    public final View m() {
        return this.f59068g;
    }

    @oy.m
    public final String n() {
        return this.f59062a;
    }

    @oy.l
    public String toString() {
        return "ISNNativeAdData(title=" + this.f59062a + ", advertiser=" + this.f59063b + ", body=" + this.f59064c + ", cta=" + this.f59065d + ", icon=" + this.f59066e + ", mediaView=" + this.f59067f + ", privacyIcon=" + this.f59068g + gi.j.f86771d;
    }

    @oy.l
    public final G8 a(@oy.m String str, @oy.m String str2, @oy.m String str3, @oy.m String str4, @oy.m Drawable drawable, @oy.m WebView webView, @oy.l View privacyIcon) {
        kotlin.jvm.internal.m0.p(privacyIcon, "privacyIcon");
        return new G8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public static /* synthetic */ G8 a(G8 g10, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = g10.f59062a;
        }
        if ((i10 & 2) != 0) {
            str2 = g10.f59063b;
        }
        if ((i10 & 4) != 0) {
            str3 = g10.f59064c;
        }
        if ((i10 & 8) != 0) {
            str4 = g10.f59065d;
        }
        if ((i10 & 16) != 0) {
            drawable = g10.f59066e;
        }
        if ((i10 & 32) != 0) {
            webView = g10.f59067f;
        }
        if ((i10 & 64) != 0) {
            view = g10.f59068g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return g10.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final X8 f59069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        private final InterfaceC4196b1 f59070b;

        public a(@oy.l X8 imageLoader, @oy.l InterfaceC4196b1 adViewManagement) {
            kotlin.jvm.internal.m0.p(imageLoader, "imageLoader");
            kotlin.jvm.internal.m0.p(adViewManagement, "adViewManagement");
            this.f59069a = imageLoader;
            this.f59070b = adViewManagement;
        }

        private final dr.i1<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return dr.i1.a(this.f59069a.a(str));
        }

        @oy.l
        public final b a(@oy.l Context activityContext, @oy.l JSONObject json) {
            kotlin.jvm.internal.m0.p(activityContext, "activityContext");
            kotlin.jvm.internal.m0.p(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("title");
            String strB = jSONObjectOptJSONObject != null ? H8.b(jSONObjectOptJSONObject, "text") : null;
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(C4235d4.i.F0);
            String strB2 = jSONObjectOptJSONObject2 != null ? H8.b(jSONObjectOptJSONObject2, "text") : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("body");
            String strB3 = jSONObjectOptJSONObject3 != null ? H8.b(jSONObjectOptJSONObject3, "text") : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(C4235d4.i.G0);
            String strB4 = jSONObjectOptJSONObject4 != null ? H8.b(jSONObjectOptJSONObject4, "text") : null;
            JSONObject jSONObjectOptJSONObject5 = json.optJSONObject("icon");
            String strB5 = jSONObjectOptJSONObject5 != null ? H8.b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = json.optJSONObject("media");
            String strB6 = jSONObjectOptJSONObject6 != null ? H8.b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(C4235d4.i.J0);
            return new b(new b.a(strB, strB2, strB3, strB4, b(strB5), a(strB6), C4478qd.f63407a.a(activityContext, jSONObjectOptJSONObject7 != null ? H8.b(jSONObjectOptJSONObject7, "url") : null, this.f59069a)));
        }

        private final dr.i1<WebView> a(String str) {
            if (str == null) {
                return null;
            }
            K8 k8A = this.f59070b.a(str);
            WebView presentingView = k8A != null ? k8A.getPresentingView() : null;
            if (presentingView == null) {
                dr.i1.a aVar = dr.i1.f79460c;
                return dr.i1.a(dr.i1.b(dr.j1.a(new Exception("missing adview for id: '" + str + "'"))));
            }
            dr.i1.a aVar2 = dr.i1.f79460c;
            return dr.i1.a(dr.i1.b(presentingView));
        }
    }
}
