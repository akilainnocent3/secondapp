package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.data.repository.SportyTvAuthTokenRepositoryImpl", f = "SportyTvAuthTokenRepositoryImpl.kt", l = {19}, m = "issueShortAuthToken", v = 2)
public final class xdd0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ydd0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdd0(ydd0 ydd0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ydd0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
