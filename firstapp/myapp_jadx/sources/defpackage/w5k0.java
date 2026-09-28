package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.WorldCupTicketDetailHandlerImpl", f = "WorldCupTicketDetailHandlerImpl.kt", l = {94}, m = "getTicketDetail", v = 2)
public final class w5k0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ v5k0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5k0(v5k0 v5k0Var, v1b<? super w5k0> v1bVar) {
        super(v1bVar);
        this.b = v5k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
