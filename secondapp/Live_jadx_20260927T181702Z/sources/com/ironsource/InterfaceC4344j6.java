package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: renamed from: com.ironsource.j6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4344j6 {
    void a();

    void a(@oy.l LevelPlayAdError levelPlayAdError);

    void a(@oy.l LevelPlayReward levelPlayReward);

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@oy.l LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@oy.l LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@oy.l LevelPlayAdInfo levelPlayAdInfo);
}
