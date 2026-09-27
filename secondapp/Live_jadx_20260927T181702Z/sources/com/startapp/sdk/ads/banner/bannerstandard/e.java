package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.jk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard.a f74042a;

    public e(BannerStandard.a aVar) {
        this.f74042a = aVar;
    }

    public final void a(boolean z10, jk jkVar) {
        this.f74042a.fireViewableChangeEvent(z10);
        this.f74042a.fireExposureChangeEvent(jkVar);
        if (z10) {
            BannerStandard.this.proceedWithImpression();
        }
    }
}
