package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tq3 implements h00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f156016a;

    public tq3(BannerAdEventListener bannerAdEventListener) {
        this.f156016a = bannerAdEventListener;
    }

    @Override // yads.h00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new qq3(this, j5Var != null ? new lr3(j5Var) : null));
    }

    @Override // yads.h00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new nq3(this));
    }

    @Override // yads.h00
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new pq3(this));
    }

    @Override // yads.h00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new rq3(this));
    }

    @Override // yads.h00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new sq3(this));
    }

    @Override // yads.h00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new oq3(this, new AdRequestError(l4Var.f151857a, l4Var.f151859c, l4Var.f151860d)));
    }

    @Override // yads.h00
    public final void closeBannerAd() {
    }
}
