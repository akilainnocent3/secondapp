package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositEWalletViewModel", f = "DepositEWalletViewModel.kt", l = {234}, m = "requestDeposit", v = 2)
public final class rzd extends x1b {
    public c330 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vzd c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzd(vzd vzdVar, x1b x1bVar) {
        super(x1bVar);
        this.c = vzdVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.P1(this);
    }
}
