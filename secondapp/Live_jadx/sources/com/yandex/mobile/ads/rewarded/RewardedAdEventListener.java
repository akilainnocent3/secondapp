package com.yandex.mobile.ads.rewarded;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import k.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface RewardedAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(@l AdError adError);

    void onAdImpression(@m ImpressionData impressionData);

    void onAdShown();

    void onRewarded(@l Reward reward);
}
