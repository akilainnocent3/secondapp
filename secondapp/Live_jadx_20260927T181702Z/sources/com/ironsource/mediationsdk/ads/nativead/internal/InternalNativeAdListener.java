package com.ironsource.mediationsdk.ads.nativead.internal;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InternalNativeAdListener {
    void onNativeAdClicked(@m AdInfo adInfo);

    void onNativeAdImpression(@m AdInfo adInfo);

    void onNativeAdLoadFailed(@m IronSourceError ironSourceError);

    void onNativeAdLoaded(@m AdInfo adInfo, @l AdapterNativeAdData adapterNativeAdData, @l AdapterNativeAdViewBinder adapterNativeAdViewBinder);
}
