package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SportyLegendsRepoImpl", f = "SportyLegendsRepoImpl.kt", l = {58}, m = "getBetBuilderConfig-0E7RQCE", v = 2)
public final class pgc0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mgc0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgc0(mgc0 mgc0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mgc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(0, this, null);
        return objE == y5b.a ? objE : new zi50(objE);
    }
}
