package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface ISDemandOnlyBannerListener {
    void onBannerAdClicked(String str);

    void onBannerAdLeftApplication(String str);

    void onBannerAdLoadFailed(String str, IronSourceError ironSourceError);

    void onBannerAdLoaded(String str);

    void onBannerAdShown(String str);
}
