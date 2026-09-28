package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.uiprocess.WithdrawUiProcess", f = "WithdrawUiProcess.kt", l = {626}, m = "verifyBankOtpIfRequired", v = 2)
public final class wqj0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ xqj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqj0(xqj0 xqj0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = xqj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, false, null, this);
    }
}
