package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {190, 230, 207}, m = "onNext")
public final class edh0 extends x1b {
    public fdh0 a;
    public Object b;
    public tuw c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fdh0<Object, Object> f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edh0(fdh0 fdh0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = fdh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(0, null, this);
    }
}
