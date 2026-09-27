package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;

/* JADX INFO: renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4252e3 implements U<BannerAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Tf f61601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final BannerAdLoaderListener f61602b;

    public C4252e3(@oy.l Tf threadManager, @oy.l BannerAdLoaderListener publisherListener) {
        kotlin.jvm.internal.m0.p(threadManager, "threadManager");
        kotlin.jvm.internal.m0.p(publisherListener, "publisherListener");
        this.f61601a = threadManager;
        this.f61602b = publisherListener;
    }

    @Override // com.ironsource.U
    public void a(@oy.l final BannerAdView adObject) {
        kotlin.jvm.internal.m0.p(adObject, "adObject");
        this.f61601a.a(new Runnable() { // from class: com.ironsource.fl
            @Override // java.lang.Runnable
            public final void run() {
                C4252e3.a(adObject, this);
            }
        });
    }

    @Override // com.ironsource.U
    public void b(@oy.l final IronSourceError error) {
        kotlin.jvm.internal.m0.p(error, "error");
        this.f61601a.a(new Runnable() { // from class: com.ironsource.gl
            @Override // java.lang.Runnable
            public final void run() {
                C4252e3.a(error, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, C4252e3 this$0) {
        kotlin.jvm.internal.m0.p(adObject, "$adObject");
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f61602b.onBannerAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C4252e3 this$0) {
        kotlin.jvm.internal.m0.p(error, "$error");
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.f61602b.onBannerAdLoadFailed(error);
    }
}
