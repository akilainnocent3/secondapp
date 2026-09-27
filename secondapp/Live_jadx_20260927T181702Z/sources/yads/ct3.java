package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ct3 implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdLoadListener f147895a;

    public ct3(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f147895a = interstitialAdLoadListener;
    }

    @Override // yads.w00
    public final void a(l4 l4Var) {
        new CallbackStackTraceMarker(new at3(this, new AdRequestError(l4Var.f151857a, l4Var.f151859c, l4Var.f151860d)));
    }

    @Override // yads.w00
    public final void a(jd1 jd1Var) {
        new CallbackStackTraceMarker(new bt3(this, new ts3(jd1Var, new xp3(), new lk())));
    }
}
