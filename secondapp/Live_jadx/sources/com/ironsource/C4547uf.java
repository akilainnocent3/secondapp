package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4547uf extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C4547uf f64276b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f64277a;

    /* JADX INFO: renamed from: com.ironsource.uf$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f64278a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        public Handler a() {
            return this.f64278a;
        }

        public void b() {
            this.f64278a = new Handler(getLooper());
        }
    }

    private C4547uf() {
        a aVar = new a(getClass().getSimpleName());
        this.f64277a = aVar;
        aVar.start();
        this.f64277a.b();
    }

    public static synchronized C4547uf a() {
        try {
            if (f64276b == null) {
                f64276b = new C4547uf();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f64276b;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f64277a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
