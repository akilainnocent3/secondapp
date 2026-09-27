package com.unity3d.ironsourceads.interstitial;

import com.ironsource.mediationsdk.logger.IronSourceError;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface InterstitialAdListener {
    void onInterstitialAdClicked(@l InterstitialAd interstitialAd);

    void onInterstitialAdDismissed(@l InterstitialAd interstitialAd);

    void onInterstitialAdFailedToShow(@l InterstitialAd interstitialAd, @l IronSourceError ironSourceError);

    void onInterstitialAdShown(@l InterstitialAd interstitialAd);
}
