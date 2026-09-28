package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.delegates.PixPendingDepositsDelegate", f = "PixPendingDepositsDelegate.kt", l = {58}, m = "initAndReturnPendingDepositsResult-gIAlu-s", v = 2)
public final class se10 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ qe10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se10(qe10 qe10Var, x1b x1bVar) {
        super(x1bVar);
        this.b = qe10Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(0, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
