package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class A9 implements U<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Tf f58375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final InterstitialAdLoaderListener f58376b;

    public A9(@oy.l Tf threadManager, @oy.l InterstitialAdLoaderListener publisherListener) {
        kotlin.jvm.internal.m0.p(threadManager, "threadManager");
        kotlin.jvm.internal.m0.p(publisherListener, "publisherListener");
        this.f58375a = threadManager;
        this.f58376b = publisherListener;
    }

    @Override // com.ironsource.U
    public void a(@oy.l final InterstitialAd adObject) {
        kotlin.jvm.internal.m0.p(adObject, "adObject");
        this.f58375a.a(new Runnable() { // from class: com.ironsource.ih
            @Override // java.lang.Runnable
            public final void run() {
                A9.a(adObject, this);
            }
        });
    }

    @Override // com.ironsource.U
    public void b(@oy.l final IronSourceError error) {
        kotlin.jvm.internal.m0.p(error, "error");
        this.f58375a.a(new Runnable() { // from class: com.ironsource.hh
            @Override // java.lang.Runnable
            public final void run() {
                A9.a(error, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd adObject, A9 this$0) {
        kotlin.jvm.internal.m0.p(adObject, "$adObject");
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f58376b.onInterstitialAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, A9 this$0) {
        kotlin.jvm.internal.m0.p(error, "$error");
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.f58376b.onInterstitialAdLoadFailed(error);
    }
}
