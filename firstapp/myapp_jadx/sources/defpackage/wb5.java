package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
public final class wb5<E> extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ tb5<E> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb5(tb5 tb5Var, x1b x1bVar) {
        super(x1bVar);
        this.b = tb5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objH = tb5.H(this.b, this);
        return objH == y5b.a ? objH : new h77(objH);
    }
}
