package com.startapp.sdk.internal;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class l8 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f75116a;

    public l8(String str) {
        super(str);
        this.f75116a = new Object();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this.f75116a) {
            this.f75116a.notifyAll();
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        synchronized (this.f75116a) {
            try {
                super.start();
                try {
                    this.f75116a.wait();
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
