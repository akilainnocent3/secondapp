package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mq3 implements f00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppOpenAdLoadListener f152607a;

    public mq3(AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f152607a = appOpenAdLoadListener;
    }

    @Override // yads.f00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new kq3(this, new AdRequestError(l4Var.f151857a, l4Var.f151859c, l4Var.f151860d)));
    }

    @Override // yads.f00
    public final void a(uh uhVar) {
        new CallbackStackTraceMarker(new lq3(this, new dq3(uhVar, new xp3(), new lk())));
    }
}
