package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.feed.FeedAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yr0 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ as0 f158461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f158462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr0(as0 as0Var, AdRequestError adRequestError) {
        super(0);
        this.f158461b = as0Var;
        this.f158462c = adRequestError;
    }

    @Override // ds.a
    public final Object invoke() {
        FeedAdLoadListener feedAdLoadListener = this.f158461b.f146911a;
        if (feedAdLoadListener != null) {
            feedAdLoadListener.onAdFailedToLoad(this.f158462c);
        }
        return dr.w2.f79517a;
    }
}
