package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.data.repository.TeamsRepositoryImpl", f = "TeamsRepositoryImpl.kt", l = {17}, m = "getTeamDetails-gIAlu-s", v = 2)
public final class aaf0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ daf0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaf0(daf0 daf0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = daf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(null, this);
        return objC == y5b.a ? objC : new zi50(objC);
    }
}
