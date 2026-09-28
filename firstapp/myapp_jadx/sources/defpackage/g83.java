package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel", f = "BetSlipViewModel.kt", l = {1381}, m = "updateUiWithLiabilityCheckResult", v = 2)
public final class g83 extends x1b {
    public j8s.c a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q73 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g83(q73 q73Var, x1b x1bVar) {
        super(x1bVar);
        this.c = q73Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a2(null, false, this);
    }
}
