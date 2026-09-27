package com.unity3d.mediation.banner;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface LevelPlayBannerAdViewListener {
    void onAdClicked(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdCollapsed(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(@l LevelPlayAdInfo levelPlayAdInfo, @l LevelPlayAdError levelPlayAdError);

    void onAdDisplayed(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdExpanded(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication(@l LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@l LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@l LevelPlayAdInfo levelPlayAdInfo);
}
