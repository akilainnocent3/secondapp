package com.monetization.ads.mediation.rewarded;

import com.monetization.ads.mediation.base.MediatedAdRequestError;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedRewardedAdapterListener {
    void onAdImpression();

    void onRewarded(@m MediatedReward mediatedReward);

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToLoad(@l MediatedAdRequestError mediatedAdRequestError);

    void onRewardedAdLeftApplication();

    void onRewardedAdLoaded();

    void onRewardedAdShown();
}
