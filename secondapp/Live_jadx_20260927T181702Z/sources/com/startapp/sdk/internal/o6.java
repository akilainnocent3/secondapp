package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class o6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f75284b;

    public o6(Context context, j jVar) {
        this.f75283a = context;
        this.f75284b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new com.startapp.sdk.adsbase.cache.a(this, e7.c(this.f75283a, "startapp_ads".concat(File.separator).concat("keys"))));
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
