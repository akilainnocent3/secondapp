package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.SportyPenaltyTicketDetailHandlerImpl", f = "SportyPenaltyTicketDetailHandlerImpl.kt", l = {77}, m = "getTicketDetail", v = 2)
public final class r5d0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ q5d0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5d0(q5d0 q5d0Var, v1b<? super r5d0> v1bVar) {
        super(v1bVar);
        this.b = q5d0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
