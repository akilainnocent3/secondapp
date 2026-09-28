package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.manager.DepositAlertCheckUiManagerImpl", f = "DepositAlertCheckUiManagerImpl.kt", l = {53, 68}, m = "resolveDropAlert", v = 2)
public final class cod extends x1b {
    public aod a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dod c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cod(dod dodVar, x1b x1bVar) {
        super(x1bVar);
        this.c = dodVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
