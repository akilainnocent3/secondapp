package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySessionDataHandlerImpl", f = "SportyPenaltySessionDataHandlerImpl.kt", l = {68, 84, 100}, m = "getSessionData", v = 2)
public final class k1d0 extends x1b {
    public String a;
    public k4d0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p1d0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1d0(p1d0 p1d0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = p1d0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
