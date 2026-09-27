package com.iab.omid.library.inmobi.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f53308b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f53309a;

    private g() {
    }

    public static g b() {
        return f53308b;
    }

    public Context a() {
        return this.f53309a;
    }

    public void a(Context context) {
        this.f53309a = context != null ? context.getApplicationContext() : null;
    }
}
