package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {120, 124, 143, 148}, m = "useConnection")
public final class uua<R> extends x1b {
    public boolean a;
    public Object b;
    public Object c;
    public dq40 d;
    public CoroutineContext e;
    public dq40 f;
    public nua i;
    public /* synthetic */ Object v;
    public final /* synthetic */ xua w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uua(xua xuaVar, x1b x1bVar) {
        super(x1bVar);
        this.w = xuaVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.w0(false, null, this);
    }
}
