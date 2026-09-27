package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45155d;

    public a(String str, String str2, String str3) {
        String strTrim = str != null ? str.trim() : null;
        this.f45152a = strTrim;
        String strTrim2 = str2 != null ? str2.trim() : null;
        this.f45153b = strTrim2;
        String strTrim3 = str3 != null ? str3.trim() : null;
        this.f45154c = strTrim3;
        this.f45155d = (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3) || !strTrim3.contains("[TIME]")) ? false : true;
    }
}
