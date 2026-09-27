package com.chartboost.sdk.impl;

import android.os.Build;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f38442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f38443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f38444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f38445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f38446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f38447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JSONObject f38448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f38449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f38450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f38451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v3 f38452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final we f38453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sg f38454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o9 f38455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final jf f38456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final nh f38457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e5 f38458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h6 f38459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fc f38460y;

    public cg(String str, String str2, o9 o9Var, jf jfVar, v3 v3Var, sg sgVar, nh nhVar, we weVar, e5 e5Var, h6 h6Var, fc fcVar) {
        String str3;
        this.f38455t = o9Var;
        this.f38456u = jfVar;
        this.f38452q = v3Var;
        this.f38454s = sgVar;
        this.f38457v = nhVar;
        this.f38453r = weVar;
        this.f38443h = str;
        this.f38444i = str2;
        this.f38458w = e5Var;
        this.f38459x = h6Var;
        this.f38460y = fcVar;
        String str4 = Build.PRODUCT;
        if ("sdk".equals(str4) || "google_sdk".equals(str4) || ((str3 = Build.MANUFACTURER) != null && str3.contains("Genymotion"))) {
            this.f38436a = "Android Simulator";
        } else {
            this.f38436a = Build.MODEL;
        }
        String str5 = Build.MANUFACTURER;
        this.f38446k = str5 == null ? "unknown" : str5;
        this.f38445j = str5 + " " + Build.MODEL;
        this.f38447l = h6Var.b();
        this.f38437b = "Android " + Build.VERSION.RELEASE;
        this.f38438c = Locale.getDefault().getCountry();
        this.f38439d = Locale.getDefault().getLanguage();
        this.f38442g = "9.11.0";
        this.f38440e = h6Var.i();
        this.f38441f = h6Var.g();
        this.f38449n = b(v3Var);
        this.f38448m = a(v3Var);
        this.f38450o = m3.a();
        this.f38451p = jfVar.a();
    }

    public final JSONObject a(v3 v3Var) {
        return v3Var != null ? a(v3Var, new x3()) : new JSONObject();
    }

    public final String b(v3 v3Var) {
        return v3Var != null ? v3Var.d() : "";
    }

    public o9 c() {
        return this.f38455t;
    }

    public fc d() {
        return this.f38460y;
    }

    public Integer e() {
        return Integer.valueOf(this.f38459x.f());
    }

    public we f() {
        return this.f38453r;
    }

    public jf g() {
        return this.f38456u;
    }

    public sg h() {
        return this.f38454s;
    }

    public int i() {
        sg sgVar = this.f38454s;
        if (sgVar != null) {
            return sgVar.f();
        }
        return -1;
    }

    public nh j() {
        return this.f38457v;
    }

    public e5 a() {
        return this.f38458w;
    }

    public h6 b() {
        return this.f38459x;
    }

    public JSONObject a(v3 v3Var, x3 x3Var) {
        if (x3Var != null) {
            return x3Var.a(v3Var);
        }
        return new JSONObject();
    }
}
