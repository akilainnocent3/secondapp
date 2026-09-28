package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl", f = "InstantWinRepoImpl.kt", l = {584}, m = "getBetslipRecommendations-0E7RQCE", v = 2)
public final class nko extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fko b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nko(fko fkoVar, x1b x1bVar) {
        super(x1bVar);
        this.b = fkoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objZ = this.b.z(null, null, this);
        return objZ == y5b.a ? objZ : new zi50(objZ);
    }
}
