package com.ironsource.adapters.admob.interstitial;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class zr extends FullScreenContentCallback {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private String f60643zr;
    private InterstitialSmashListener zz;

    public zr(String str, InterstitialSmashListener interstitialSmashListener) {
        this.zz = interstitialSmashListener;
        this.f60643zr = str;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60643zr);
        InterstitialSmashListener interstitialSmashListener = this.zz;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60643zr);
        InterstitialSmashListener interstitialSmashListener = this.zz;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.f60643zr);
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
        this.zz.onInterstitialAdShowFailed(new IronSourceError(code, "onInterstitialAdShowFailed " + this.f60643zr + " " + str));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60643zr);
        InterstitialSmashListener interstitialSmashListener = this.zz;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdOpened();
            this.zz.onInterstitialAdShowSucceeded();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.f60643zr);
    }
}
