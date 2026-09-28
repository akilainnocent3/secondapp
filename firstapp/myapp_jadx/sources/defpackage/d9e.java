package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {357, 361}, m = "showDepositSubmittedSnackBarThenGoTxList", v = 2)
public final class d9e extends x1b {
    public yp40 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f9e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.c = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(this);
    }
}
