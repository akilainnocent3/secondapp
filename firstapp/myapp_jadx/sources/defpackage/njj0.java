package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel", f = "WithdrawBankV2ViewModel.kt", l = {276}, m = "handleSetDefaultOrderResult", v = 2)
public final class njj0 extends x1b {
    public v600.c a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mjj0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njj0(mjj0 mjj0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mjj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.O1(null, this);
    }
}
