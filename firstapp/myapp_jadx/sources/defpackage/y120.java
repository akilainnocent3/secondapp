package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {568}, m = "usePrepared")
public final class y120<R> extends x1b {
    public String a;
    public Function1 b;
    public ava c;
    public /* synthetic */ Object d;
    public final /* synthetic */ u120 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y120(u120 u120Var, x1b x1bVar) {
        super(x1bVar);
        this.e = u120Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, null, this);
    }
}
