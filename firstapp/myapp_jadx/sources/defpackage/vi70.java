package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {569, 591}, m = "handleMatchdayUpdateData", v = 2)
public final class vi70 extends x1b {
    public String a;
    public Object b;
    public tuw c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pj70 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi70(pj70 pj70Var, x1b x1bVar) {
        super(x1bVar);
        this.e = pj70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(null, this);
    }
}
