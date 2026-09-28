package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel", f = "DepositOtherBanksViewModel.kt", l = {452}, m = "requestDeposit", v = 2)
public final class z4e extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ f5e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4e(f5e f5eVar, x1b x1bVar) {
        super(x1bVar);
        this.b = f5eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.O1(this);
    }
}
