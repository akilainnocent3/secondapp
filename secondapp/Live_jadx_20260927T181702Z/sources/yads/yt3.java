package yads;

import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yt3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu3 f158487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt3(eu3 eu3Var) {
        super(0);
        this.f158487b = eu3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        RewardedAdEventListener rewardedAdEventListener = this.f158487b.f148856a;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdClicked();
        }
        return dr.w2.f79517a;
    }
}
