package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantRacingRepoImpl", f = "InstantRacingRepoImpl.kt", l = {30}, m = "getOverallConfig-IoAF18A", v = 2)
public final class z2o extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ e3o b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2o(e3o e3oVar, x1b x1bVar) {
        super(x1bVar);
        this.b = e3oVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(this);
        return objC == y5b.a ? objC : new zi50(objC);
    }
}
