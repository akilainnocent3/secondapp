package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nAbstractInterstitialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractInterstitialAdapter.kt\ncom/ironsource/mediationsdk/adapter/AbstractInterstitialAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public abstract class AbstractInterstitialAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements InterstitialAdapterInterface {
    public AbstractInterstitialAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectInterstitialBiddingData(@l JSONObject config, @m JSONObject jSONObject, @l BiddingDataCallback biddingDataCallback) {
        m0.p(config, "config");
        m0.p(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(config, jSONObject);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @m
    public Map<String, Object> getInterstitialBiddingData(@l JSONObject config, @m JSONObject jSONObject) {
        m0.p(config, "config");
        return null;
    }

    public void initInterstitial(@m String str, @m String str2, @l JSONObject config, @l InterstitialSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    public void initInterstitialForBidding(@m String str, @m String str2, @l JSONObject config, @l InterstitialSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    public boolean isInterstitialReady(@l JSONObject config) {
        m0.p(config, "config");
        return false;
    }

    public void loadInterstitial(@l JSONObject config, @m JSONObject jSONObject, @l InterstitialSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    public void loadInterstitialForBidding(@l JSONObject config, @m JSONObject jSONObject, @m String str, @l InterstitialSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    public void showInterstitial(@l JSONObject config, @l InterstitialSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(@m JSONObject jSONObject) {
    }
}
