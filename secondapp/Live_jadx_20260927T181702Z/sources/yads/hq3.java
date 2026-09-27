package yads;

import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hq3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jq3 f150224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f150225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq3(jq3 jq3Var, lr3 lr3Var) {
        super(0);
        this.f150224b = jq3Var;
        this.f150225c = lr3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        AppOpenAdEventListener appOpenAdEventListener = this.f150224b.f151215a;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdImpression(this.f150225c);
        }
        return dr.w2.f79517a;
    }
}
