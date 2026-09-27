package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40417e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f40418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f40421d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final p5 a(JSONObject jSONObject) {
            String str = null;
            if (jSONObject == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("click");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (strOptString != null) {
                        kotlin.jvm.internal.m0.m(strOptString);
                        if (cv.p0.O3(strOptString)) {
                            strOptString = null;
                        }
                        if (strOptString != null) {
                            arrayList.add(strOptString);
                        }
                    }
                }
            }
            n1 n1VarA = n1.f40064d.a(jSONObject.optJSONObject("app_install_button"));
            String strOptString2 = jSONObject.optString("button_html");
            kotlin.jvm.internal.m0.m(strOptString2);
            if (!cv.p0.O3(strOptString2) && !kotlin.jvm.internal.m0.g(strOptString2, fw.b.f85379f)) {
                str = strOptString2;
            }
            return new p5(n1VarA, str, jSONObject.optBoolean("show_on_endcard", false), arrayList);
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public p5(n1 n1Var, String str, boolean z10, List clickTrackers) {
        kotlin.jvm.internal.m0.p(clickTrackers, "clickTrackers");
        this.f40418a = n1Var;
        this.f40419b = str;
        this.f40420c = z10;
        this.f40421d = clickTrackers;
    }

    public final n1 a() {
        return this.f40418a;
    }

    public final String b() {
        return this.f40419b;
    }

    public final List c() {
        return this.f40421d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return kotlin.jvm.internal.m0.g(this.f40418a, p5Var.f40418a) && kotlin.jvm.internal.m0.g(this.f40419b, p5Var.f40419b) && this.f40420c == p5Var.f40420c && kotlin.jvm.internal.m0.g(this.f40421d, p5Var.f40421d);
    }

    public int hashCode() {
        n1 n1Var = this.f40418a;
        int iHashCode = (n1Var == null ? 0 : n1Var.hashCode()) * 31;
        String str = this.f40419b;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + g8.a.a(this.f40420c)) * 31) + this.f40421d.hashCode();
    }

    public String toString() {
        return "CtaConfig(appInstallButton=" + this.f40418a + ", buttonHtml=" + this.f40419b + ", showOnEndcard=" + this.f40420c + ", clickTrackers=" + this.f40421d + gi.j.f86771d;
    }
}
