package com.startapp.sdk.ads.banner.bannerstandard;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CloseableLayout f74043a;

    public f(CloseableLayout closeableLayout) {
        this.f74043a = closeableLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74043a.a(false);
    }
}
