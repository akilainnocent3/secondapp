package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.utils.apicache.CachedResourceImpl", f = "CachedResourceImpl.kt", l = {98, 99}, m = "safeEmit", v = 2)
public final class gt5 extends x1b {
    public wwd0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ts5<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt5(ts5 ts5Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ts5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, this);
    }
}
