package com.ironsource.mediationsdk.ads.nativead.interfaces;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface;
import java.util.Map;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface NativeAdAdapterInterface extends AdUnitAdapterInterface {
    void collectNativeAdBiddingData(@l JSONObject jSONObject, @m JSONObject jSONObject2, @l BiddingDataCallback biddingDataCallback);

    void destroyNativeAd(@l JSONObject jSONObject);

    @m
    Map<String, Object> getNativeAdBiddingData(@l JSONObject jSONObject, @m JSONObject jSONObject2);

    void initNativeAdForBidding(@m String str, @m String str2, @l JSONObject jSONObject, @l NativeAdSmashListener nativeAdSmashListener);

    void initNativeAds(@m String str, @m String str2, @l JSONObject jSONObject, @l NativeAdSmashListener nativeAdSmashListener);

    void loadNativeAd(@l JSONObject jSONObject, @m JSONObject jSONObject2, @l NativeAdSmashListener nativeAdSmashListener);

    void loadNativeAdForBidding(@l JSONObject jSONObject, @m JSONObject jSONObject2, @m String str, @l NativeAdSmashListener nativeAdSmashListener);
}
