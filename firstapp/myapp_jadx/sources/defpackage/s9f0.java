package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.data.repository.TeamsRemoteDataSource", f = "TeamsRemoteDataSource.kt", l = {30}, m = "getRecentResults-yxL6bBk", v = 2)
public final class s9f0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ w9f0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9f0(w9f0 w9f0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = w9f0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(null, null, 0, null, this);
        return objE == y5b.a ? objE : new zi50(objE);
    }
}
