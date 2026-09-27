package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.Nd;
import com.ironsource.Od;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RewardedAd implements Od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final Nd f76256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    private RewardedAdListener f76257b;

    public RewardedAd(@l Nd rewardedAdInternal) {
        m0.p(rewardedAdInternal, "rewardedAdInternal");
        this.f76256a = rewardedAdInternal;
        rewardedAdInternal.a(this);
    }

    @l
    public final RewardedAdInfo getAdInfo() {
        return this.f76256a.b();
    }

    @m
    public final RewardedAdListener getListener() {
        return this.f76257b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f76256a.d();
    }

    @Override // com.ironsource.Od
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f76257b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f76257b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f76257b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdFailedToShow(@l IronSourceError error) {
        m0.p(error, "error");
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + error + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f76257b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.Od
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f76257b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Od
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.f76257b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(@m RewardedAdListener rewardedAdListener) {
        this.f76257b = rewardedAdListener;
    }

    public final void show(@l Activity activity) {
        m0.p(activity, "activity");
        IronLog.API.info();
        this.f76256a.a(activity);
    }
}
