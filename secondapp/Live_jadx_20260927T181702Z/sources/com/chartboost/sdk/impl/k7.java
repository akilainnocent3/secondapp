package com.chartboost.sdk.impl;

import com.ironsource.C4497s;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f39713f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39718e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final k7 a(JSONObject jsonObject) throws JSONException {
            kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
            String string = jsonObject.getString("type");
            kotlin.jvm.internal.m0.o(string, "getString(...)");
            String string2 = jsonObject.getString("http_method");
            kotlin.jvm.internal.m0.o(string2, "getString(...)");
            String string3 = jsonObject.getString("url");
            kotlin.jvm.internal.m0.o(string3, "getString(...)");
            String strOptString = jsonObject.optString("body");
            kotlin.jvm.internal.m0.m(strOptString);
            if (strOptString.length() <= 0) {
                strOptString = null;
            }
            String strOptString2 = jsonObject.optString("content_type");
            kotlin.jvm.internal.m0.m(strOptString2);
            return new k7(string, string2, string3, strOptString, strOptString2.length() > 0 ? strOptString2 : null);
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        RENDER("render"),
        CLICK("click"),
        ENGAGEMENT("engagement"),
        CLOSE("close"),
        EXPIRATION("expiration"),
        IMPRESSION("impression"),
        LOAD("load"),
        REWARD(C4497s.f63499j),
        SHOW("show"),
        SKIP(com.google.android.material.timepicker.h.f51923u),
        INITIALIZATION(GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ sr.a f39731o = sr.c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39732b;

        b(String str) {
            this.f39732b = str;
        }

        public final String b() {
            return this.f39732b;
        }
    }

    public k7(String type, String httpMethod, String url, String str, String str2) {
        kotlin.jvm.internal.m0.p(type, "type");
        kotlin.jvm.internal.m0.p(httpMethod, "httpMethod");
        kotlin.jvm.internal.m0.p(url, "url");
        this.f39714a = type;
        this.f39715b = httpMethod;
        this.f39716c = url;
        this.f39717d = str;
        this.f39718e = str2;
    }

    public final String a() {
        return this.f39717d;
    }

    public final String b() {
        return this.f39718e;
    }

    public final String c() {
        return this.f39715b;
    }

    public final String d() {
        return this.f39714a;
    }

    public final String e() {
        return this.f39716c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return kotlin.jvm.internal.m0.g(this.f39714a, k7Var.f39714a) && kotlin.jvm.internal.m0.g(this.f39715b, k7Var.f39715b) && kotlin.jvm.internal.m0.g(this.f39716c, k7Var.f39716c) && kotlin.jvm.internal.m0.g(this.f39717d, k7Var.f39717d) && kotlin.jvm.internal.m0.g(this.f39718e, k7Var.f39718e);
    }

    public int hashCode() {
        int iHashCode = ((((this.f39714a.hashCode() * 31) + this.f39715b.hashCode()) * 31) + this.f39716c.hashCode()) * 31;
        String str = this.f39717d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39718e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EventTracker(type=" + this.f39714a + ", httpMethod=" + this.f39715b + ", url=" + this.f39716c + ", body=" + this.f39717d + ", contentType=" + this.f39718e + gi.j.f86771d;
    }
}
