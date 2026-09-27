package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class lc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f75120a;

    public lc(mc mcVar) {
        this.f75120a = mcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f75120a.c();
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
