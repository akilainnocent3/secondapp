package com.monetization.ads.mediation.nativeads;

import com.monetization.ads.mediation.base.MediatedAdRequestError;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedNativeAdapterListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(@l MediatedAdRequestError mediatedAdRequestError);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdOpened();

    void onAppInstallAdLoaded(@l MediatedNativeAd mediatedNativeAd);

    void onContentAdLoaded(@l MediatedNativeAd mediatedNativeAd);
}
