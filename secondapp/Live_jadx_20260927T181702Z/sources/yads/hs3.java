package yads;

import com.yandex.mobile.ads.instream.newapi.InstreamAdRequestError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hs3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f150271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ls3 f150272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs3(String str, ls3 ls3Var) {
        super(0);
        this.f150271b = str;
        this.f150272c = ls3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f150272c.f152110a.onInstreamAdFailedToLoad(new InstreamAdRequestError(this.f150271b));
        return dr.w2.f79517a;
    }
}
