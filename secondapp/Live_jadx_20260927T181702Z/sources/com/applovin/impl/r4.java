package com.applovin.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28519c;

    public r4(String str, String str2, Context context) {
        this.f28517a = str.replace("android.permission.", "");
        this.f28518b = str2;
        this.f28519c = p0.a(str, context);
    }

    public String a() {
        return this.f28518b;
    }

    public String b() {
        return this.f28517a;
    }

    public boolean c() {
        return this.f28519c;
    }
}
