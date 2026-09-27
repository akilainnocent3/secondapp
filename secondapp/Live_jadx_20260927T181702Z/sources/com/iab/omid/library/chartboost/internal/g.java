package com.iab.omid.library.chartboost.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f53032b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f53033a;

    private g() {
    }

    public static g b() {
        return f53032b;
    }

    public Context a() {
        return this.f53033a;
    }

    public void a(Context context) {
        this.f53033a = context != null ? context.getApplicationContext() : null;
    }
}
