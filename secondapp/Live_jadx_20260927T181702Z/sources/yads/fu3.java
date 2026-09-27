package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fu3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu3 f149250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f149251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu3(hu3 hu3Var, AdRequestError adRequestError) {
        super(0);
        this.f149250b = hu3Var;
        this.f149251c = adRequestError;
    }

    @Override // ds.a
    public final Object invoke() {
        RewardedAdLoadListener rewardedAdLoadListener = this.f149250b.f150310a;
        if (rewardedAdLoadListener != null) {
            rewardedAdLoadListener.onAdFailedToLoad(this.f149251c);
        }
        return dr.w2.f79517a;
    }
}
