package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdUnitController f44606a;

    public h(NativeAdUnitController nativeAdUnitController) {
        this.f44606a = nativeAdUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44606a.a();
    }
}
