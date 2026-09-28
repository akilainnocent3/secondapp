package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel", f = "QuickBetViewModel.kt", l = {276, 276}, m = "shouldHideOddsChangeAcceptDlg", v = 2)
public final class yf30 extends x1b {
    public m2l a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tf30 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf30(tf30 tf30Var, x1b x1bVar) {
        super(x1bVar);
        this.c = tf30Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.F1(this);
    }
}
