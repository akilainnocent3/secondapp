package com.ironsource.mediationsdk.ads.nativead.interfaces;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface NativeAdInteractionListener {
    void onAdClicked(@m LevelPlayNativeAd levelPlayNativeAd, @m AdInfo adInfo);

    void onAdImpression(@m LevelPlayNativeAd levelPlayNativeAd, @m AdInfo adInfo);
}
