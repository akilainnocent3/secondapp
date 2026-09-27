package com.fyber.inneractive.sdk.dv.rewarded;

import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f44545a;

    public b(d dVar) {
        this.f44545a = dVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f44545a.f44105j;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        com.fyber.inneractive.sdk.dv.interstitial.a aVar = this.f44545a.f44105j;
        if (aVar != null) {
            aVar.w();
        }
    }
}
