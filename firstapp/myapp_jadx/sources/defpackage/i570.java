package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballEventScoreHandlerImpl", f = "ScheduledFootballEventScoreHandlerImpl.kt", l = {208}, m = "updateEventScoreSelectionsFlow", v = 2)
public final class i570 extends x1b {
    public q570 a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j570 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i570(j570 j570Var, x1b x1bVar) {
        super(x1bVar);
        this.d = j570Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
