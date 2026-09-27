package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xs3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f157982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f157983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs3(zs3 zs3Var, lr3 lr3Var) {
        super(0);
        this.f157982b = zs3Var;
        this.f157983c = lr3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f157982b.f159018a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdImpression(this.f157983c);
        }
        return dr.w2.f79517a;
    }
}
