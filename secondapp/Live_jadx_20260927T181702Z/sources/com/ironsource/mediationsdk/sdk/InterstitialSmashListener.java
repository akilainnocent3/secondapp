package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterstitialSmashListener {
    void onInterstitialAdClicked();

    void onInterstitialAdClicked(Map<String, Object> map);

    void onInterstitialAdClosed();

    void onInterstitialAdClosed(Map<String, Object> map);

    void onInterstitialAdLoadFailed(IronSourceError ironSourceError);

    void onInterstitialAdLoadFailed(IronSourceError ironSourceError, Map<String, Object> map);

    void onInterstitialAdOpened();

    void onInterstitialAdOpened(Map<String, Object> map);

    void onInterstitialAdReady();

    void onInterstitialAdReady(Map<String, Object> map);

    void onInterstitialAdShowFailed(IronSourceError ironSourceError);

    void onInterstitialAdShowFailed(IronSourceError ironSourceError, Map<String, Object> map);

    void onInterstitialAdShowSucceeded();

    void onInterstitialAdShowSucceeded(Map<String, Object> map);

    void onInterstitialAdVisible();

    void onInterstitialAdVisible(Map<String, Object> map);

    void onInterstitialInitFailed(IronSourceError ironSourceError);

    void onInterstitialInitFailed(IronSourceError ironSourceError, Map<String, Object> map);

    void onInterstitialInitSuccess();

    void onInterstitialInitSuccess(Map<String, Object> map);
}
