package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface RewardedAdListener {
    void onRewardedAdClicked(@l RewardedAd rewardedAd);

    void onRewardedAdDismissed(@l RewardedAd rewardedAd);

    void onRewardedAdFailedToShow(@l RewardedAd rewardedAd, @l IronSourceError ironSourceError);

    void onRewardedAdShown(@l RewardedAd rewardedAd);

    void onUserEarnedReward(@l RewardedAd rewardedAd);
}
