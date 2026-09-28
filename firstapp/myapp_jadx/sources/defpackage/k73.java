package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel", f = "BetSlipViewModel.kt", l = {1873}, m = "getUniqueIdForOddsChangeAcceptDlg", v = 2)
public final class k73 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k73(q73 q73Var, x1b x1bVar) {
        super(x1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.I1(this);
    }
}
