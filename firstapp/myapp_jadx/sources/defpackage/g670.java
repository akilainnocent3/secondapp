package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballHeadToHeadStatsHandlerImpl", f = "ScheduledFootballHeadToHeadStatsHandlerImpl.kt", l = {363}, m = "getHeadToHeadStats", v = 2)
public final class g670 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f670 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g670(f670 f670Var, x1b x1bVar) {
        super(x1bVar);
        this.c = f670Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
