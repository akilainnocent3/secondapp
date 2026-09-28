package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SimulationRepoImpl", f = "SimulationRepoImpl.kt", l = {51}, m = "getBetHistory-gIAlu-s", v = 2)
public final class hn90 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ln90 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn90(ln90 ln90Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ln90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(0, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
