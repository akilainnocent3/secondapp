package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {422, 426}, m = "onSubscription")
public final class wde0 extends x1b {
    public xde0 a;
    public kr60 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xde0<Object> d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wde0(xde0 xde0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = xde0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
