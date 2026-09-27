package com.monetization.ads.mediation.nativeads;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedNativeAd {
    void bindNativeAd(@l MediatedNativeAdViewProvider mediatedNativeAdViewProvider);

    void destroy();

    @l
    MediatedNativeAdAssets getMediatedNativeAdAssets();

    void unbindNativeAd(@l MediatedNativeAdViewProvider mediatedNativeAdViewProvider);
}
