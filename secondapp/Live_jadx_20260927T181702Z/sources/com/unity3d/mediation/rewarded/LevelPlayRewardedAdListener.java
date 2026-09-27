package com.unity3d.mediation.rewarded;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface LevelPlayRewardedAdListener {
    void onAdClicked(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdClosed(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(@l LevelPlayAdError levelPlayAdError, @l LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayed(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@l LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(@l LevelPlayReward levelPlayReward, @l LevelPlayAdInfo levelPlayAdInfo);
}
