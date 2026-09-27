package com.google.ads.mediation.ironsource;

import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zv implements ISDemandOnlyInterstitialListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackD;
        Log.d(zt.f48204a, String.format("IronSource interstitial ad clicked for instance ID: %s", str));
        zu zuVarC = zu.c(str);
        if (zuVarC == null || (mediationInterstitialAdCallbackD = zuVarC.d()) == null) {
            return;
        }
        mediationInterstitialAdCallbackD.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackD;
        Log.d(zt.f48204a, String.format("IronSource interstitial ad closed for instance ID: %s", str));
        zu zuVarC = zu.c(str);
        if (zuVarC != null && (mediationInterstitialAdCallbackD = zuVarC.d()) != null) {
            mediationInterstitialAdCallbackD.onAdClosed();
        }
        zu.b(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), "com.ironsource.mediationsdk");
        Log.w(zt.f48204a, adError.toString());
        zu zuVarC = zu.c(str);
        if (zuVarC != null && zuVarC.zs() != null) {
            zuVarC.zs().onFailure(adError);
        }
        zu.b(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackD;
        Log.d(zt.f48204a, String.format("IronSource interstitial ad opened for instance ID: %s", str));
        zu zuVarC = zu.c(str);
        if (zuVarC == null || (mediationInterstitialAdCallbackD = zuVarC.d()) == null) {
            return;
        }
        mediationInterstitialAdCallbackD.onAdOpened();
        mediationInterstitialAdCallbackD.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        Log.d(zt.f48204a, String.format("IronSource interstitial ad is ready for instance ID: %s", str));
        zu zuVarC = zu.c(str);
        if (zuVarC == null || zuVarC.zs() == null) {
            return;
        }
        zuVarC.f((MediationInterstitialAdCallback) zuVarC.zs().onSuccess(zuVarC));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackD;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), "com.ironsource.mediationsdk");
        Log.w(zt.f48204a, adError.toString());
        zu zuVarC = zu.c(str);
        if (zuVarC != null && (mediationInterstitialAdCallbackD = zuVarC.d()) != null) {
            mediationInterstitialAdCallbackD.onAdFailedToShow(adError);
        }
        zu.b(str);
    }
}
