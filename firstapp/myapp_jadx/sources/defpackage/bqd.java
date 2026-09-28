package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {350}, m = "requestDeposit", v = 2)
public final class bqd extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fqd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqd(fqd fqdVar, x1b x1bVar) {
        super(x1bVar);
        this.b = fqdVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.O1(this);
    }
}
