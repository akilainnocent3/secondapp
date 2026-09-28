package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel", f = "DepositDedicatedAccountViewModel.kt", l = {134}, m = "refreshBankListAndAccountList", v = 2)
public final class fyd extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ yxd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyd(yxd yxdVar, x1b x1bVar) {
        super(x1bVar);
        this.b = yxdVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.S1(this);
    }
}
