package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportypicks.data.repository.PicksRepositoryImpl", f = "PicksRepositoryImpl.kt", l = {38}, m = "getPickTournaments-IoAF18A", v = 2)
public final class cu00 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ du00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu00(du00 du00Var, x1b x1bVar) {
        super(x1bVar);
        this.b = du00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
