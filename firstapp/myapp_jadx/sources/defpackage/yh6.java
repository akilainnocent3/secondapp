package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutAdapter", f = "CashOutAdapter.kt", l = {929}, m = "coRefreshCashoutAmountWithApis", v = 2)
public final class yh6 extends x1b {
    public pl6 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xh6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh6(xh6 xh6Var, x1b x1bVar) {
        super(x1bVar);
        this.c = xh6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        zsb zsbVar = xh6.Q;
        return this.c.k(null, this);
    }
}
