package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl", f = "InstantWinRepoImpl.kt", l = {420}, m = "getWorldCupTickets-eH_QyT8", v = 2)
public final class clo extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fko b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clo(fko fkoVar, x1b x1bVar) {
        super(x1bVar);
        this.b = fkoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objI = this.b.i(null, 0, null, false, 0L, 0L, null, this);
        return objI == y5b.a ? objI : new zi50(objI);
    }
}
