package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class at3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ct3 f146928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f146929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at3(ct3 ct3Var, AdRequestError adRequestError) {
        super(0);
        this.f146928b = ct3Var;
        this.f146929c = adRequestError;
    }

    @Override // ds.a
    public final Object invoke() {
        InterstitialAdLoadListener interstitialAdLoadListener = this.f146928b.f147895a;
        if (interstitialAdLoadListener != null) {
            interstitialAdLoadListener.onAdFailedToLoad(this.f146929c);
        }
        return dr.w2.f79517a;
    }
}
