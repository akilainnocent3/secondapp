package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SportyLegendsRepoImpl", f = "SportyLegendsRepoImpl.kt", l = {75}, m = "getPrepareRound-gIAlu-s", v = 2)
public final class tgc0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mgc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgc0(mgc0 mgc0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mgc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objI = this.b.i(null, this);
        return objI == y5b.a ? objI : new zi50(objI);
    }
}
