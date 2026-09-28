package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOpenBetsCountHandlerImpl", f = "ScheduledFootballOpenBetsCountHandlerImpl.kt", l = {48}, m = "getOpenBetsCountInfo", v = 2)
public final class fb70 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mb70 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb70(mb70 mb70Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mb70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
