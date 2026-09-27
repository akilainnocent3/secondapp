package com.fyber.inneractive.sdk.dv.interstitial;

import com.google.android.gms.ads.AdListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f44539a;

    public f(g gVar) {
        this.f44539a = gVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        a aVar = this.f44539a.f44105j;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        a aVar = this.f44539a.f44105j;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        a aVar = this.f44539a.f44105j;
        if (aVar != null) {
            aVar.w();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        a aVar = this.f44539a.f44105j;
        if (aVar != null) {
            aVar.w();
        }
    }
}
