package yads;

import com.yandex.mobile.ads.feed.FeedAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zr0 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ as0 f159004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr0(as0 as0Var) {
        super(0);
        this.f159004b = as0Var;
    }

    @Override // ds.a
    public final Object invoke() {
        FeedAdLoadListener feedAdLoadListener = this.f159004b.f146911a;
        if (feedAdLoadListener != null) {
            feedAdLoadListener.onAdLoaded();
        }
        return dr.w2.f79517a;
    }
}
