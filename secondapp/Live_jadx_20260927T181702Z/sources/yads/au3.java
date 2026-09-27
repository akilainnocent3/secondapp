package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class au3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f146936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp3 f146937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au3(eu3 eu3Var, wp3 wp3Var) {
        super(0);
        this.f146936b = eu3Var;
        this.f146937c = wp3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f146936b.f148856a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToShow(this.f146937c);
        }
        return dr.w2.f79517a;
    }
}
