package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationbethistory.handler.SimulationBetHistoryHandlerImpl", f = "SimulationBetHistoryHandlerImpl.kt", l = {120}, m = "loadBetHistory", v = 2)
public final class ul90 extends x1b {
    public qm90.a a;
    public fl90 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vl90 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul90(vl90 vl90Var, x1b x1bVar) {
        super(x1bVar);
        this.e = vl90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
