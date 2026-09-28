package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.tournament.data.repository.TournamentRepositoryImpl", f = "TournamentRepositoryImpl.kt", l = {13}, m = "getGroups-gIAlu-s", v = 2)
public final class hcg0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ uh80 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcg0(uh80 uh80Var, x1b x1bVar) {
        super(x1bVar);
        this.b = uh80Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
