package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.SportyLegendsTicketDetailHandlerImpl", f = "SportyLegendsTicketDetailHandlerImpl.kt", l = {88}, m = "getTicketDetail", v = 2)
public final class roc0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ qoc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roc0(qoc0 qoc0Var, v1b<? super roc0> v1bVar) {
        super(v1bVar);
        this.b = qoc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
