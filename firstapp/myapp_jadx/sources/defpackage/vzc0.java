package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SportyPenaltyRepoImpl", f = "SportyPenaltyRepoImpl.kt", l = {111}, m = "getTicketDetail-gIAlu-s", v = 2)
public final class vzc0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ yzc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzc0(yzc0 yzc0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = yzc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(null, this);
        return objE == y5b.a ? objE : new zi50(objE);
    }
}
