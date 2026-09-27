package com.iab.omid.library.startio.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f53885b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f53886a;

    private g() {
    }

    public static g b() {
        return f53885b;
    }

    public Context a() {
        return this.f53886a;
    }

    public void a(Context context) {
        this.f53886a = context != null ? context.getApplicationContext() : null;
    }
}
