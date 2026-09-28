package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.handler.BasketballBetHistoryHandlerImpl", f = "BasketballBetHistoryHandlerImpl.kt", l = {184}, m = "getTickets", v = 2)
public final class wc2 extends x1b {
    public vbo.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bd2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc2(bd2 bd2Var, x1b x1bVar) {
        super(x1bVar);
        this.c = bd2Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, null, null, this);
    }
}
