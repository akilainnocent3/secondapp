package com.iab.omid.library.bigosg.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static d f52769a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f52770b;

    private d() {
    }

    public static d a() {
        return f52769a;
    }

    public Context b() {
        return this.f52770b;
    }

    public void a(Context context) {
        this.f52770b = context != null ? context.getApplicationContext() : null;
    }
}
