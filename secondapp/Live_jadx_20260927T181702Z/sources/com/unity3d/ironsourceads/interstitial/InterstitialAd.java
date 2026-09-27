package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C4575w9;
import com.ironsource.InterfaceC4592x9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAd implements InterfaceC4592x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final C4575w9 f76243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    private InterstitialAdListener f76244b;

    public InterstitialAd(@l C4575w9 interstitialAdInternal) {
        m0.p(interstitialAdInternal, "interstitialAdInternal");
        this.f76243a = interstitialAdInternal;
        interstitialAdInternal.a(this);
    }

    @l
    public final InterstitialAdInfo getAdInfo() {
        return this.f76243a.b();
    }

    @m
    public final InterstitialAdListener getListener() {
        return this.f76244b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f76243a.d();
    }

    @Override // com.ironsource.InterfaceC4592x9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f76244b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC4592x9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f76244b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC4592x9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f76244b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC4592x9
    public void onAdInstanceDidFailedToShow(@l IronSourceError error) {
        m0.p(error, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + error + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f76244b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC4592x9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f76244b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(@m InterstitialAdListener interstitialAdListener) {
        this.f76244b = interstitialAdListener;
    }

    public final void show(@l Activity activity) {
        m0.p(activity, "activity");
        IronLog.API.info();
        this.f76243a.a(activity);
    }

    @Override // com.ironsource.InterfaceC4592x9
    public void onAdInstanceDidReward(@m String str, int i10) {
    }
}
