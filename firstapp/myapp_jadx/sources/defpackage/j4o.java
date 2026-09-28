package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.InstantRacingTicketDetailHandlerImpl", f = "InstantRacingTicketDetailHandlerImpl.kt", l = {77}, m = "getTicketDetail", v = 2)
public final class j4o extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ i4o b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4o(i4o i4oVar, v1b<? super j4o> v1bVar) {
        super(v1bVar);
        this.b = i4oVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
