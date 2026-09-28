package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.handler.ScheduledFootballOpenBetsDataHandlerImpl", f = "ScheduledFootballOpenBetsDataHandlerImpl.kt", l = {146}, m = "handleSelectionStatus", v = 2)
public final class ub70 extends x1b {
    public mi70 a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cc70 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub70(cc70 cc70Var, x1b x1bVar) {
        super(x1bVar);
        this.d = cc70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
