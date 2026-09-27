package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h5 f39076a = new h5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f39077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Application f39078c;

    public final void a(Context context) {
        if (context instanceof Application) {
            f39078c = (Application) context;
            return;
        }
        f39077b = new WeakReference(context);
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        f39078c = applicationContext instanceof Application ? (Application) applicationContext : null;
    }

    public final Context a() {
        Context context;
        WeakReference weakReference = f39077b;
        return (weakReference == null || (context = (Context) weakReference.get()) == null) ? f39078c : context;
    }
}
