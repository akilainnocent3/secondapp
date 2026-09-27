package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class er3 implements h00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClosableBannerAdEventListener f148828a;

    public er3(ClosableBannerAdEventListener closableBannerAdEventListener) {
        this.f148828a = closableBannerAdEventListener;
    }

    @Override // yads.h00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new br3(this, j5Var != null ? new lr3(j5Var) : null));
    }

    @Override // yads.h00
    public final void closeBannerAd() {
        new CallbackStackTraceMarker(new xq3(this));
    }

    @Override // yads.h00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new yq3(this));
    }

    @Override // yads.h00
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new ar3(this));
    }

    @Override // yads.h00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new cr3(this));
    }

    @Override // yads.h00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new dr3(this));
    }

    @Override // yads.h00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new zq3(this, new AdRequestError(l4Var.f151857a, l4Var.f151859c, l4Var.f151860d)));
    }
}
