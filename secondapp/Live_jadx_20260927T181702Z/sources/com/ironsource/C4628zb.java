package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4628zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f64579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f64580b;

    /* JADX INFO: renamed from: com.ironsource.zb$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f64581a;

        public Handler a() {
            return this.f64581a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f64581a = new Handler();
            Looper.loop();
        }

        private a() {
        }
    }

    public C4628zb() {
        a aVar = new a();
        this.f64579a = aVar;
        aVar.start();
        this.f64580b = new Date().getTime();
    }

    public boolean a(Object obj) {
        return (obj == null || this.f64579a == null) ? false : true;
    }

    public void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.f64579a;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }
}
