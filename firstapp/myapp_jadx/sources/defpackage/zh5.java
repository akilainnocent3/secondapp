package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.BuildAndGoTicketDetailHandlerImpl", f = "BuildAndGoTicketDetailHandlerImpl.kt", l = {74}, m = "getTicketDetail", v = 2)
public final class zh5 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ yh5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh5(yh5 yh5Var, v1b<? super zh5> v1bVar) {
        super(v1bVar);
        this.b = yh5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
