package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface RewardedVideoSmashListener {
    void onRewardedVideoAdClicked();

    void onRewardedVideoAdClicked(Map<String, Object> map);

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdClosed(Map<String, Object> map);

    void onRewardedVideoAdEnded();

    void onRewardedVideoAdEnded(Map<String, Object> map);

    void onRewardedVideoAdOpened();

    void onRewardedVideoAdOpened(Map<String, Object> map);

    void onRewardedVideoAdRewarded();

    void onRewardedVideoAdRewarded(Map<String, Object> map);

    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, Map<String, Object> map);

    void onRewardedVideoAdStarted();

    void onRewardedVideoAdStarted(Map<String, Object> map);

    void onRewardedVideoAdVisible();

    void onRewardedVideoAdVisible(Map<String, Object> map);

    void onRewardedVideoAvailabilityChanged(boolean z10);

    void onRewardedVideoAvailabilityChanged(boolean z10, Map<String, Object> map);

    void onRewardedVideoInitFailed(IronSourceError ironSourceError);

    void onRewardedVideoInitFailed(IronSourceError ironSourceError, Map<String, Object> map);

    void onRewardedVideoInitSuccess();

    void onRewardedVideoInitSuccess(Map<String, Object> map);

    void onRewardedVideoLoadFailed(IronSourceError ironSourceError);

    void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map<String, Object> map);

    void onRewardedVideoLoadSuccess();

    void onRewardedVideoLoadSuccess(Map<String, Object> map);
}
