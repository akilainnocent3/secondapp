package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel", f = "QuickBetViewModel.kt", l = {371}, m = "getUniqueIdForOddsChangeAcceptDlg", v = 2)
public final class pf30 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ tf30 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf30(tf30 tf30Var, x1b x1bVar) {
        super(x1bVar);
        this.b = tf30Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.B1(this);
    }
}
