package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.utils.apicache.CachedResourceImpl", f = "CachedResourceImpl.kt", l = {128, 82, 83, 89, 90}, m = "fetchData", v = 2)
public final class us5 extends x1b {
    public km0 a;
    public quw b;
    public Object c;
    public int d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ts5<Object> i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us5(ts5 ts5Var, x1b x1bVar) {
        super(x1bVar);
        this.i = ts5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.c(null, this);
    }
}
