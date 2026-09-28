package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.handler.ScheduledFootballBetHistoryHandlerImpl", f = "ScheduledFootballBetHistoryHandlerImpl.kt", l = {158}, m = "getTickets", v = 2)
public final class d070 extends x1b {
    public vbo.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b070 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d070(b070 b070Var, x1b x1bVar) {
        super(x1bVar);
        this.c = b070Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, null, null, this);
    }
}
