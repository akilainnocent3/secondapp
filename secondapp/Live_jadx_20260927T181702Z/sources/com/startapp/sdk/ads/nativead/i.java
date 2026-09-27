package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f74144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f74145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StartAppNativeAd f74146d;

    public i(StartAppNativeAd startAppNativeAd, int i10, AdEventListener adEventListener) {
        this.f74146d = startAppNativeAd;
        this.f74144b = i10;
        this.f74145c = adEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f74143a + 1;
        this.f74143a = i10;
        if (i10 == this.f74144b) {
            this.f74146d.onReceiveAd(this.f74145c);
        }
    }
}
