package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.repository.CashoutRepositoryImpl", f = "CashoutRepositoryImpl.kt", l = {124}, m = "fetchOpenBetsCount", v = 2)
public final class br6 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fr6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br6(fr6 fr6Var, x1b x1bVar) {
        super(x1bVar);
        this.b = fr6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, this);
    }
}
