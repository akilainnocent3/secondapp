package yads;

import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tt3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vt3 f156051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f156052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt3(vt3 vt3Var, AdRequestError adRequestError) {
        super(0);
        this.f156051b = vt3Var;
        this.f156052c = adRequestError;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f156051b.f157088a.onAdsFailedToLoad(this.f156052c);
        return dr.w2.f79517a;
    }
}
