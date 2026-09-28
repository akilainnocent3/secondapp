package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.results.data.ResultsRepositoryImpl", f = "ResultsRepositoryImpl.kt", l = {30}, m = "getEventResults", v = 2)
public final class hm50 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ jm50 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm50(jm50 jm50Var, x1b x1bVar) {
        super(x1bVar);
        this.b = jm50Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, 0L, 0L, null, null, null, null, this);
    }
}
