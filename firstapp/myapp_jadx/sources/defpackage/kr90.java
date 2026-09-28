package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationticketdetail.handler.SimulationTicketDetailHandlerImpl", f = "SimulationTicketDetailHandlerImpl.kt", l = {116}, m = "getTicketDetail", v = 2)
public final class kr90 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ pr90 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr90(pr90 pr90Var, x1b x1bVar) {
        super(x1bVar);
        this.b = pr90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
