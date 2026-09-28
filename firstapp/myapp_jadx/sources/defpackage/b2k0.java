package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.data.repository.WorldCupPassBannerStateProviderImpl", f = "WorldCupPassBannerStateProviderImpl.kt", l = {169}, m = "resolveState", v = 2)
public final class b2k0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ z1k0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2k0(z1k0 z1k0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = z1k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
