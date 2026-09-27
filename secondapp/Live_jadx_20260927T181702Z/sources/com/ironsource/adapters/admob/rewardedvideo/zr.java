package com.ironsource.adapters.admob.rewardedvideo;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class zr extends FullScreenContentCallback implements OnUserEarnedRewardListener {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private String f60667zr;
    private RewardedVideoSmashListener zz;

    public zr(String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.zz = rewardedVideoSmashListener;
        this.f60667zr = str;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60667zr);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.zz;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60667zr);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.zz;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.f60667zr);
        int code = adError.getCode();
        String str = adError.getMessage() + "( " + code + " )";
        if (this.zz == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (adError.getCause() != null) {
            str = str + " Caused by - " + adError.getCause();
        }
        ironLog.error("adapterError = " + str);
        this.zz.onRewardedVideoAdShowFailed(new IronSourceError(code, "onRewardedAdFailedToShow " + this.f60667zr + " " + str));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60667zr);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.zz;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60667zr);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60667zr);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.zz;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }
}
