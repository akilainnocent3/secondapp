package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.handler.InstantFootballSettlementHandlerImpl", f = "InstantFootballSettlementHandlerImpl.kt", l = {872, 795, 887, 902}, m = "getLeagueEvents", v = 2)
public final class sqn extends x1b {
    public String a;
    public String b;
    public Object c;
    public tuw d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object i;
    public final /* synthetic */ rqn v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqn(rqn rqnVar, x1b x1bVar) {
        super(x1bVar);
        this.v = rqnVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.i(null, null, false, this);
    }
}
