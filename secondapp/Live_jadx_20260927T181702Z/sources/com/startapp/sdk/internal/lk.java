package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class lk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f75154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk f75155b;

    public lk(mk mkVar, String str) {
        this.f75155b = mkVar;
        this.f75154a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f75155b.f75210b.compareAndSet(false, true)) {
            mk mkVar = this.f75155b;
            mkVar.f75215g.a(mkVar.f75211c);
            this.f75155b.f75212d.a(String.valueOf(this.f75154a));
        }
    }
}
