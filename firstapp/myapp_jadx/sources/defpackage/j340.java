package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", l = {125}, m = "takeNextOrNull")
public final class j340 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ k340<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j340(k340 k340Var, x1b x1bVar) {
        super(x1bVar);
        this.b = k340Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
