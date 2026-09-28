package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOverviewStatsHandlerImpl", f = "ScheduledFootballOverviewStatsHandlerImpl.kt", l = {324}, m = "getOverviewStatsMatchResultsData", v = 2)
public final class vd70 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ td70 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd70(td70 td70Var, x1b x1bVar) {
        super(x1bVar);
        this.b = td70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
