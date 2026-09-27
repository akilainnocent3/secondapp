package com.fyber.inneractive.sdk.web;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f47925a;

    public a1(b1 b1Var) {
        this.f47925a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f47925a.f47928a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
