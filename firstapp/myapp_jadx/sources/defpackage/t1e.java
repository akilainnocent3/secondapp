package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel", f = "DepositMomoViewModel.kt", l = {582, 584}, m = "askUserToConfirmChannelSwitch", v = 2)
public final class t1e extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ r2e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1e(r2e r2eVar, x1b x1bVar) {
        super(x1bVar);
        this.b = r2eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.N1(this);
    }
}
