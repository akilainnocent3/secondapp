package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.InstantFootballTicketDetailHandlerImpl", f = "InstantFootballTicketDetailHandlerImpl.kt", l = {94}, m = "getTicketDetail", v = 2)
public final class nrn extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mrn b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrn(mrn mrnVar, v1b<? super nrn> v1bVar) {
        super(v1bVar);
        this.b = mrnVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
