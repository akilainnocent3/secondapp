package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class n6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f75237b;

    public n6(Context context, k kVar) {
        this.f75236a = context;
        this.f75237b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e7.a(this.f75236a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new m6(this));
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
