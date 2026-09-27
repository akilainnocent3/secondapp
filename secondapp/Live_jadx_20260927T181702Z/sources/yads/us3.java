package yads;

import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class us3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zs3 f156571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us3(zs3 zs3Var) {
        super(0);
        this.f156571b = zs3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        InterstitialAdEventListener interstitialAdEventListener = this.f156571b.f159018a;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdClicked();
        }
        return dr.w2.f79517a;
    }
}
