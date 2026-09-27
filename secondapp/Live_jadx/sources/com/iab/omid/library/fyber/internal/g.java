package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f53167b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f53168a;

    private g() {
    }

    public static g b() {
        return f53167b;
    }

    public Context a() {
        return this.f53168a;
    }

    public void a(Context context) {
        this.f53168a = context != null ? context.getApplicationContext() : null;
    }
}
