package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.data.repository.TeamsRepositoryImpl", f = "TeamsRepositoryImpl.kt", l = {35}, m = "getRecentResults-yxL6bBk", v = 2)
public final class z9f0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ daf0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9f0(daf0 daf0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = daf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(null, null, 0, null, this);
        return objE == y5b.a ? objE : new zi50(objE);
    }
}
