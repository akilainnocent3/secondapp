package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl", f = "InstantWinRepoImpl.kt", l = {137}, m = "getInstantFootballTicketDetail-gIAlu-s", v = 2)
public final class wko extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fko b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wko(fko fkoVar, x1b x1bVar) {
        super(x1bVar);
        this.b = fkoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objP = this.b.p(null, this);
        return objP == y5b.a ? objP : new zi50(objP);
    }
}
