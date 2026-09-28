package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.tournament.data.repository.TournamentRemoteDataSource", f = "TournamentRemoteDataSource.kt", l = {17}, m = "getKnockouts-gIAlu-s", v = 2)
public final class dcg0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ecg0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcg0(ecg0 ecg0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ecg0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
