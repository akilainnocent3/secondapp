package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class xb5 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ tb5<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb5(tb5 tb5Var, x1b x1bVar) {
        super(x1bVar);
        this.b = tb5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        AtomicLongFieldUpdater atomicLongFieldUpdater = tb5.d;
        Object objI = this.b.I(null, 0, 0L, this);
        return objI == y5b.a ? objI : new h77(objI);
    }
}
