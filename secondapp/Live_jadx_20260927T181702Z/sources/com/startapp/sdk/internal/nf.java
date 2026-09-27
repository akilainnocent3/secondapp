package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class nf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f75259a;

    public nf(pf pfVar) {
        this.f75259a = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f75259a.b();
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
