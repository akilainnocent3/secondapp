package yads;

import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kq3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq3 f151658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f151659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq3(mq3 mq3Var, AdRequestError adRequestError) {
        super(0);
        this.f151658b = mq3Var;
        this.f151659c = adRequestError;
    }

    @Override // ds.a
    public final Object invoke() {
        AppOpenAdLoadListener appOpenAdLoadListener = this.f151658b.f152607a;
        if (appOpenAdLoadListener != null) {
            appOpenAdLoadListener.onAdFailedToLoad(this.f151659c);
        }
        return dr.w2.f79517a;
    }
}
