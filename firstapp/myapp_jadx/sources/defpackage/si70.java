package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {569, 414, 584, 599}, m = "getEventResult", v = 2)
public final class si70 extends x1b {
    public int A;
    public String a;
    public String b;
    public String c;
    public Object d;
    public tuw e;
    public int f;
    public int i;
    public boolean v;
    public boolean w;
    public /* synthetic */ Object y;
    public final /* synthetic */ pj70 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si70(pj70 pj70Var, x1b x1bVar) {
        super(x1bVar);
        this.z = pj70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, null, null, 0, 0, false, this);
    }
}
