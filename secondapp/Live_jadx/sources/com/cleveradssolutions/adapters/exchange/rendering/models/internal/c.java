package com.cleveradssolutions.adapters.exchange.rendering.models.internal;

import android.text.TextUtils;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.h;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f42221g = "zt";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f42222h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f42228f = null;

    public static void d(String str) {
        f42222h = str;
    }

    public static String e() {
        return f42222h;
    }

    public static void m(int i10) {
        String[] strArr = {"sms", "tel", "calendar", "storePicture", "inlineVideo", FirebaseAnalytics.d.f52112s, "vpaid"};
        int[] iArr = {1, 2, 4, 8, 16, 32, 64};
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mraid.allSupports = {");
        for (int i11 = 0; i11 < 7; i11++) {
            sb2.append(strArr[i11]);
            sb2.append(":");
            int i12 = iArr[i11];
            sb2.append((i10 & i12) == i12 ? "false" : Boolean.valueOf(h.a(strArr[i11])));
            if (i11 < 6) {
                sb2.append(",");
            }
        }
        sb2.append("};");
        com.cleveradssolutions.adapters.exchange.b.h(f42221g, "Supported features: " + sb2.toString());
        d(sb2.toString());
    }

    public String a() {
        return this.f42226d;
    }

    public void b(String str) {
        this.f42226d = str;
    }

    public Boolean c() {
        return this.f42228f;
    }

    public void f(String str) {
        this.f42224b = str;
    }

    public String g() {
        return this.f42225c;
    }

    public void h(String str) {
        this.f42225c = str;
    }

    public String i() {
        String str = this.f42223a;
        return str == null ? "" : str;
    }

    public void j(String str) {
        this.f42223a = str;
    }

    public boolean k() {
        return !TextUtils.isEmpty(this.f42223a);
    }

    public String l() {
        return this.f42227e;
    }

    public void n(Boolean bool) {
        this.f42228f = bool;
    }

    public void o(String str) {
        this.f42227e = str;
    }
}
