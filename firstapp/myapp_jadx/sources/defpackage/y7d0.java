package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportypicks.presentation.SportyPicksViewModel", f = "SportyPicksViewModel.kt", l = {136, 138}, m = "fetchMarkets-gIAlu-s", v = 2)
public final class y7d0 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c8d0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7d0(c8d0 c8d0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = c8d0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objY1 = this.c.y1(0, this);
        return objY1 == y5b.a ? objY1 : new zi50(objY1);
    }
}
