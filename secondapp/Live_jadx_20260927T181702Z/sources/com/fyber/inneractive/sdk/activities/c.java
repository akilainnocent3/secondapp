package com.fyber.inneractive.sdk.activities;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f44138a;

    public c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f44138a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f44138a.isFinishing()) {
            return;
        }
        this.f44138a.hideNavigationBar();
    }
}
