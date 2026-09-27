package yads;

import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nt3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt3 f153200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequestError f153201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt3(pt3 pt3Var, AdRequestError adRequestError) {
        super(0);
        this.f153200b = pt3Var;
        this.f153201c = adRequestError;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f153200b.f154127a.onAdFailedToLoad(this.f153201c);
        return dr.w2.f79517a;
    }
}
