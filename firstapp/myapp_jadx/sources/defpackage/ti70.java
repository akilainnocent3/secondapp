package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {569}, m = "getMatchdaysWithPassedKickoffTime", v = 2)
public final class ti70 extends x1b {
    public long a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pj70 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti70(pj70 pj70Var, x1b x1bVar) {
        super(x1bVar);
        this.d = pj70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(0L, this);
    }
}
