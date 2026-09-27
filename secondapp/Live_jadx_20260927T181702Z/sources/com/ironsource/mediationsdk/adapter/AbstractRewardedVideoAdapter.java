package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import dr.w2;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nAbstractRewardedVideoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractRewardedVideoAdapter.kt\ncom/ironsource/mediationsdk/adapter/AbstractRewardedVideoAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public abstract class AbstractRewardedVideoAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements RewardedVideoAdapterInterface {
    public AbstractRewardedVideoAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectRewardedVideoBiddingData(@l JSONObject config, @m JSONObject jSONObject, @l BiddingDataCallback biddingDataCallback) {
        w2 w2Var;
        m0.p(config, "config");
        m0.p(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(config, jSONObject);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
            w2Var = w2.f79517a;
        } else {
            w2Var = null;
        }
        if (w2Var == null) {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @m
    public Map<String, Object> getRewardedVideoBiddingData(@l JSONObject config, @m JSONObject jSONObject) {
        m0.p(config, "config");
        return null;
    }

    public void initAndLoadRewardedVideo(@m String str, @m String str2, @l JSONObject config, @m JSONObject jSONObject, @l RewardedVideoSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(@m String str, @m String str2, @l JSONObject config, @l RewardedVideoSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    public void initRewardedVideoWithCallback(@m String str, @m String str2, @l JSONObject config, @l RewardedVideoSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    public boolean isRewardedVideoAvailable(@l JSONObject config) {
        m0.p(config, "config");
        return false;
    }

    public void loadRewardedVideo(@l JSONObject config, @m JSONObject jSONObject, @l RewardedVideoSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    public void loadRewardedVideoForBidding(@l JSONObject config, @m JSONObject jSONObject, @m String str, @l RewardedVideoSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    public void showRewardedVideo(@l JSONObject config, @l RewardedVideoSmashListener listener) {
        m0.p(config, "config");
        m0.p(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(@m JSONObject jSONObject) {
    }
}
