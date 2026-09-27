package com.startapp.sdk.internal;

/* JADX INFO: renamed from: com.startapp.sdk.internal.if, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Cif implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f74991a;

    public Cif(pf pfVar) {
        this.f74991a = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f74991a.c();
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
