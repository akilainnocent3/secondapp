package com.google.ads.mediation.ironsource;

import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zx implements ISDemandOnlyRewardedVideoListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackB;
        Log.d(zt.f48204a, String.format("IronSource rewarded ad clicked for instance ID: %s", str));
        zw zwVarC = zw.c(str);
        if (zwVarC == null || (mediationRewardedAdCallbackB = zwVarC.b()) == null) {
            return;
        }
        mediationRewardedAdCallbackB.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackB;
        Log.d(zt.f48204a, String.format("IronSource rewarded ad closed for instance ID: %s", str));
        zw zwVarC = zw.c(str);
        if (zwVarC != null && (mediationRewardedAdCallbackB = zwVarC.b()) != null) {
            mediationRewardedAdCallbackB.onAdClosed();
        }
        zw.a(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), "com.ironsource.mediationsdk");
        Log.e(zt.f48204a, adError.toString());
        zw zwVarC = zw.c(str);
        if (zwVarC != null && zwVarC.zr() != null) {
            zwVarC.zr().onFailure(adError);
        }
        zw.a(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        Log.d(zt.f48204a, String.format("IronSource rewarded ad loaded for instance ID: %s", str));
        zw zwVarC = zw.c(str);
        if (zwVarC == null || zwVarC.zr() == null) {
            return;
        }
        zwVarC.f((MediationRewardedAdCallback) zwVarC.zr().onSuccess(zwVarC));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackB;
        Log.d(zt.f48204a, String.format("IronSource rewarded ad opened for instance ID: %s", str));
        zw zwVarC = zw.c(str);
        if (zwVarC == null || (mediationRewardedAdCallbackB = zwVarC.b()) == null) {
            return;
        }
        mediationRewardedAdCallbackB.onAdOpened();
        mediationRewardedAdCallbackB.onVideoStart();
        mediationRewardedAdCallbackB.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackB;
        Log.d(zt.f48204a, String.format("IronSource rewarded ad received reward for instance ID: %s", str));
        zw zwVarC = zw.c(str);
        if (zwVarC == null || (mediationRewardedAdCallbackB = zwVarC.b()) == null) {
            return;
        }
        mediationRewardedAdCallbackB.onVideoComplete();
        mediationRewardedAdCallbackB.onUserEarnedReward();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationRewardedAdCallback mediationRewardedAdCallbackB;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), "com.ironsource.mediationsdk");
        Log.e(zt.f48204a, adError.toString());
        zw zwVarC = zw.c(str);
        if (zwVarC != null && (mediationRewardedAdCallbackB = zwVarC.b()) != null) {
            mediationRewardedAdCallbackB.onAdFailedToShow(adError);
        }
        zw.a(str);
    }
}
