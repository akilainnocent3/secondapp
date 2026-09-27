package yads;

import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakRequestError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xr3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f157975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zr3 f157976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr3(String str, zr3 zr3Var) {
        super(0);
        this.f157975b = str;
        this.f157976c = zr3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f157976c.f159007a.onAdFailedToLoad(new InstreamAdBreakRequestError(this.f157975b));
        return dr.w2.f79517a;
    }
}
