package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.handler.SportyLegendsBetHistoryHandlerImpl", f = "SportyLegendsBetHistoryHandlerImpl.kt", l = {156}, m = "getTickets", v = 2)
public final class rac0 extends x1b {
    public vbo.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uac0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rac0(uac0 uac0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = uac0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, null, null, this);
    }
}
