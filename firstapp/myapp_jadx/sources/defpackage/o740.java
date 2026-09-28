package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel", f = "RealBetHistoryViewModel.kt", l = {388}, m = "performDeleteOrders", v = 2)
public final class o740 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ d740 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o740(d740 d740Var, x1b x1bVar) {
        super(x1bVar);
        this.b = d740Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.B1(null, this);
    }
}
