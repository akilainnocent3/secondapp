package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f53578b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f53579a;

    private g() {
    }

    public static g b() {
        return f53578b;
    }

    public Context a() {
        return this.f53579a;
    }

    public void a(Context context) {
        this.f53579a = context != null ? context.getApplicationContext() : null;
    }
}
