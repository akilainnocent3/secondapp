package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pt3 implements c10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdLoadListener f154127a;

    public pt3(NativeAdLoadListener nativeAdLoadListener) {
        this.f154127a = nativeAdLoadListener;
    }

    public final void a(w02 w02Var) {
        new CallbackStackTraceMarker(new ot3(this, new com.yandex.mobile.ads.nativeads.d(w02Var)));
    }

    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new nt3(this, new AdRequestError(l4Var.f151857a, l4Var.f151859c, l4Var.f151860d)));
    }
}
