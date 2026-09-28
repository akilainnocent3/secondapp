package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.datastore.BetSlipInsurePreferenceStore", f = "BetSlipInsurePreferenceStore.kt", l = {28}, m = "getFlexiBetConfig", v = 2)
public final class v43 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ w43 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v43(w43 w43Var, x1b x1bVar) {
        super(x1bVar);
        this.b = w43Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
