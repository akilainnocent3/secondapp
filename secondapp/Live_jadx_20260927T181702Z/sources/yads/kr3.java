package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kr3 implements z00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClosableNativeAdEventListener f151663a;

    public kr3(ClosableNativeAdEventListener closableNativeAdEventListener) {
        this.f151663a = closableNativeAdEventListener;
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        new CallbackStackTraceMarker(new hr3(this, j5Var != null ? new lr3(j5Var) : null));
    }

    @Override // yads.z00
    public final void closeNativeAd() {
        new CallbackStackTraceMarker(new fr3(this));
    }

    @Override // yads.z00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new gr3(this));
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new ir3(this));
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new jr3(this));
    }
}
