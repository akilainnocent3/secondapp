package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SportyLegendsRepoImpl", f = "SportyLegendsRepoImpl.kt", l = {50}, m = "getSportConfig-gIAlu-s", v = 2)
public final class ugc0 extends x1b {
    public mgc0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mgc0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugc0(mgc0 mgc0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mgc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objJ = this.c.j(false, this);
        return objJ == y5b.a ? objJ : new zi50(objJ);
    }
}
