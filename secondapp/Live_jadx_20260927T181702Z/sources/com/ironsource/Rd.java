package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Rd implements U<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Tf f59993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final RewardedAdLoaderListener f59994b;

    public Rd(@oy.l Tf threadManager, @oy.l RewardedAdLoaderListener publisherListener) {
        kotlin.jvm.internal.m0.p(threadManager, "threadManager");
        kotlin.jvm.internal.m0.p(publisherListener, "publisherListener");
        this.f59993a = threadManager;
        this.f59994b = publisherListener;
    }

    @Override // com.ironsource.U
    public void a(@oy.l final RewardedAd adObject) {
        kotlin.jvm.internal.m0.p(adObject, "adObject");
        this.f59993a.a(new Runnable() { // from class: com.ironsource.pj
            @Override // java.lang.Runnable
            public final void run() {
                Rd.a(adObject, this);
            }
        });
    }

    @Override // com.ironsource.U
    public void b(@oy.l final IronSourceError error) {
        kotlin.jvm.internal.m0.p(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f59993a.a(new Runnable() { // from class: com.ironsource.oj
            @Override // java.lang.Runnable
            public final void run() {
                Rd.a(this.f63235b, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, Rd this$0) {
        kotlin.jvm.internal.m0.p(adObject, "$adObject");
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f59994b.onRewardedAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Rd this$0, IronSourceError error) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        kotlin.jvm.internal.m0.p(error, "$error");
        this$0.f59994b.onRewardedAdLoadFailed(error);
    }
}
