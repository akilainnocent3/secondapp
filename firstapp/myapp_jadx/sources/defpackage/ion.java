package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.InstantBasketballTicketDetailHandlerImpl", f = "InstantBasketballTicketDetailHandlerImpl.kt", l = {94}, m = "getTicketDetail", v = 2)
public final class ion extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hon b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ion(hon honVar, v1b<? super ion> v1bVar) {
        super(v1bVar);
        this.b = honVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
