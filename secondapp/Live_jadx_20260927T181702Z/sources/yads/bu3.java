package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bu3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f147353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f147354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu3(eu3 eu3Var, lr3 lr3Var) {
        super(0);
        this.f147353b = eu3Var;
        this.f147354c = lr3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f147353b.f148856a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdImpression(this.f147354c);
        }
        return dr.w2.f79517a;
    }
}
