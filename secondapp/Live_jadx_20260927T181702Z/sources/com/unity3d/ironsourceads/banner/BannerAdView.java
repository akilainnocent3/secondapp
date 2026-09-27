package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.P2;
import com.ironsource.Q2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class BannerAdView extends FrameLayout implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private P2 f76226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    private BannerAdViewListener f76227b;

    private BannerAdView(Context context) {
        super(context);
    }

    @l
    public final BannerAdInfo getAdInfo() {
        P2 p10 = this.f76226a;
        if (p10 == null) {
            m0.S("bannerAdViewInternal");
            p10 = null;
        }
        return p10.c();
    }

    @m
    public final BannerAdViewListener getListener() {
        return this.f76227b;
    }

    @Override // com.ironsource.Q2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f76227b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.Q2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f76227b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(@m BannerAdViewListener bannerAdViewListener) {
        this.f76227b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(@l P2 bannerAdViewInternal) {
        m0.p(bannerAdViewInternal, "bannerAdViewInternal");
        Context context = bannerAdViewInternal.d().getContext();
        m0.o(context, "bannerAdViewInternal.container.context");
        this(context);
        this.f76226a = bannerAdViewInternal;
        bannerAdViewInternal.a(new WeakReference<>(this));
        bannerAdViewInternal.b(new WeakReference<>(this));
    }
}
