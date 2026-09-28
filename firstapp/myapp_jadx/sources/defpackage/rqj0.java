package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.uiprocess.WithdrawUiProcess", f = "WithdrawUiProcess.kt", l = {239, 253, 263}, m = "processNameConfirm", v = 2)
public final class rqj0 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xqj0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqj0(xqj0 xqj0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = xqj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
