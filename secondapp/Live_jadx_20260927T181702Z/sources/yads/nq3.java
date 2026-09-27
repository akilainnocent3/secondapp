package yads;

import com.yandex.mobile.ads.banner.BannerAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nq3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tq3 f153118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq3(tq3 tq3Var) {
        super(0);
        this.f153118b = tq3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        BannerAdEventListener bannerAdEventListener = this.f153118b.f156016a;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdClicked();
        }
        return dr.w2.f79517a;
    }
}
