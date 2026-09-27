package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hu3 implements q10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardedAdLoadListener f150310a;

    public hu3(RewardedAdLoadListener rewardedAdLoadListener) {
        this.f150310a = rewardedAdLoadListener;
    }

    @Override // yads.q10
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new fu3(this, new AdRequestError(l4Var.f151857a, l4Var.f151859c, l4Var.f151860d)));
    }

    @Override // yads.q10
    public final void a(dr2 dr2Var) {
        new CallbackStackTraceMarker(new gu3(this, new xt3(dr2Var, new xp3(), new lk())));
    }
}
