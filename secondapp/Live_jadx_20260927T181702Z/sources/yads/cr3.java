package yads;

import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cr3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er3 f147880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr3(er3 er3Var) {
        super(0);
        this.f147880b = er3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        ClosableBannerAdEventListener closableBannerAdEventListener = this.f147880b.f148828a;
        if (closableBannerAdEventListener != null) {
            closableBannerAdEventListener.onLeftApplication();
        }
        return dr.w2.f79517a;
    }
}
