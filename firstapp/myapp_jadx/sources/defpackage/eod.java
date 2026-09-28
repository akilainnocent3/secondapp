package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositAlertCheckUiProcess", f = "DepositAlertCheckUiProcess.kt", l = {40}, m = "invoke", v = 2)
public final class eod extends x1b {
    public z000 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fod c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eod(fod fodVar, x1b x1bVar) {
        super(x1bVar);
        this.c = fodVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
