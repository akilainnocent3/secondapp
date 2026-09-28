package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballEventScoreHandlerImpl", f = "ScheduledFootballEventScoreHandlerImpl.kt", l = {208}, m = "updateEventScoreSelectionsFlow", v = 2)
public final class h570 extends x1b {
    public ni70 a;
    public tuw b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ j570 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h570(j570 j570Var, x1b x1bVar) {
        super(x1bVar);
        this.e = j570Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, 0L, this);
    }
}
