package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
public final class c390<T> extends x1b {
    public b390 a;
    public myh b;
    public e390 c;
    public c9p d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b390<T> f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c390(b390<T> b390Var, v1b<? super c390> v1bVar) {
        super(v1bVar);
        this.f = b390Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        b390.m(this.f, null, this);
        return y5b.a;
    }
}
