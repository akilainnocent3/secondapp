package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOverviewStatsHandlerImpl", f = "ScheduledFootballOverviewStatsHandlerImpl.kt", l = {304}, m = "getOverviewStatsLeagueStandingsData", v = 2)
public final class ud70 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ td70 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud70(td70 td70Var, x1b x1bVar) {
        super(x1bVar);
        this.c = td70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
