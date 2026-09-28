package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel", f = "WithdrawMomoViewModel.kt", l = {366, 368}, m = "askUserToConfirmChannelSwitch", v = 2)
public final class vmj0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ dnj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmj0(dnj0 dnj0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = dnj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.L1(this);
    }
}
