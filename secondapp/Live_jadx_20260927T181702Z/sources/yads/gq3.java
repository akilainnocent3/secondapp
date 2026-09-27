package yads;

import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gq3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jq3 f149743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp3 f149744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq3(jq3 jq3Var, wp3 wp3Var) {
        super(0);
        this.f149743b = jq3Var;
        this.f149744c = wp3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        AppOpenAdEventListener appOpenAdEventListener = this.f149743b.f151215a;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdFailedToShow(this.f149744c);
        }
        return dr.w2.f79517a;
    }
}
