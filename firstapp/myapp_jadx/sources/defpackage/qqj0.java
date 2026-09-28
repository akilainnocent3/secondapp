package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.uiprocess.WithdrawUiProcess", f = "WithdrawUiProcess.kt", l = {271, 285}, m = "processManuallyWithdrawal", v = 2)
public final class qqj0 extends x1b {
    public v1i0.c a;
    public g0i0.d b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xqj0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqj0(xqj0 xqj0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = xqj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, this);
    }
}
