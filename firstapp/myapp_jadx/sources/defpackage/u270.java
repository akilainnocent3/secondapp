package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCellHandlerImpl", f = "ScheduledFootballCellHandlerImpl.kt", l = {320}, m = "updateUpcomingMatchdayExpansionsById", v = 2)
public final class u270 extends x1b {
    public String a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a270 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u270(a270 a270Var, x1b x1bVar) {
        super(x1bVar);
        this.d = a270Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, this);
    }
}
