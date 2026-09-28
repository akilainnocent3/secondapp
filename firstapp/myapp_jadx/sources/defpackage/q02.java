package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.BaseDepositViewModel", f = "BaseDepositViewModel.kt", l = {184}, m = "resolveInsufficientFundsAlert", v = 2)
public final class q02 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ m02 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q02(m02 m02Var, x1b x1bVar) {
        super(x1bVar);
        this.b = m02Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.L1(null, this);
    }
}
