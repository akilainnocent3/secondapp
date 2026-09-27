package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f29376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29377b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    public v3(a aVar, String str) {
        this.f29376a = aVar;
        this.f29377b = str;
    }

    public a a() {
        return this.f29376a;
    }

    public String b() {
        return this.f29377b;
    }

    public static v3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new v3(a.AD_UNIT_ID, str);
    }

    public static v3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new v3(a.AD_FORMAT, label);
    }

    public static v3 a(a3 a3Var) {
        String strT = a3Var.T();
        MaxAdFormat format = a3Var.getFormat();
        if (TextUtils.isEmpty(strT) || format == null) {
            return null;
        }
        return new s3(new l3(strT, format));
    }
}
