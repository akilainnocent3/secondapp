package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel", f = "TxListViewModel.kt", l = {406, 457}, m = "updateTxUiState", v = 2)
public final class d8h0 extends x1b {
    public Object a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ o7h0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8h0(o7h0 o7h0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = o7h0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.C1(null, null, null, this);
    }
}
