package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.repository.CashoutRepositoryImpl", f = "CashoutRepositoryImpl.kt", l = {111, 114}, m = "fetchCashoutJsData", v = 2)
public final class xq6 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fr6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq6(fr6 fr6Var, x1b x1bVar) {
        super(x1bVar);
        this.b = fr6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
