package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ms3 implements r00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstreamAdLoadListener f152662a;

    public ms3(InstreamAdLoadListener instreamAdLoadListener) {
        this.f152662a = instreamAdLoadListener;
    }

    @Override // yads.r00
    public final void a(m00 m00Var) {
        new CallbackStackTraceMarker(new ks3(this, new qr3(m00Var)));
    }

    @Override // yads.r00
    public final void onInstreamAdFailedToLoad(String str) {
        new CallbackStackTraceMarker(new is3(this, str));
    }
}
