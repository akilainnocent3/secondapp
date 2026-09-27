package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class cc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f74644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dc f74645b;

    public cc(dc dcVar, Runnable runnable) {
        this.f74645b = dcVar;
        this.f74644a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74645b.a(this.f74644a);
        synchronized (this.f74645b) {
            this.f74645b.f74687c = null;
        }
    }
}
