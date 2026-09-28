package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {557}, m = "beginTransaction")
public final class v120 extends x1b {
    public crg0.a a;
    public ava b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u120 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v120(u120 u120Var, x1b x1bVar) {
        super(x1bVar);
        this.d = u120Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, this);
    }
}
