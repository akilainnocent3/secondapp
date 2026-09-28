package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.mappers.BalanceStateMapper", f = "BalanceStateMapper.kt", l = {38}, m = "formatBalance", v = 2)
public final class hv1 extends x1b {
    public long a;
    public boolean b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iv1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv1(iv1 iv1Var, x1b x1bVar) {
        super(x1bVar);
        this.e = iv1Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0L, false, false, this);
    }
}
