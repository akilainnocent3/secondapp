package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4242db {
    void onAdClicked(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdClosed(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(@oy.l LevelPlayAdError levelPlayAdError, @oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayed(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@oy.l LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdRewarded(@oy.l LevelPlayReward levelPlayReward, @oy.l LevelPlayAdInfo levelPlayAdInfo);
}
