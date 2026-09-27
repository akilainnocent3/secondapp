package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f54160b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f54161a;

    private g() {
    }

    public static g b() {
        return f54160b;
    }

    public Context a() {
        return this.f54161a;
    }

    public void a(Context context) {
        this.f54161a = context != null ? context.getApplicationContext() : null;
    }
}
