package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel", f = "DepositCardViewModel.kt", l = {631}, m = "checkNameConfirmStatusAndAlert", v = 2)
public final class ftd extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ tud b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftd(tud tudVar, x1b x1bVar) {
        super(x1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.T1(this);
    }
}
