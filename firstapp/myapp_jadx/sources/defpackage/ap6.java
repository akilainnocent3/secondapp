package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutConfigManagerImpl", f = "CashoutConfigManagerImpl.kt", l = {82}, m = "awaitCashoutNecessaryConfig", v = 2)
public final class ap6<T> extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ep6 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap6(ep6 ep6Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ep6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(null, null, this);
    }
}
