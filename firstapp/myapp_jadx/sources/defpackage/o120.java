package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {214}, m = "acquireWithTimeout-KLykuaI")
public final class o120 extends x1b {
    public long a;
    public Function0 b;
    public dq40 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ r120 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o120(r120 r120Var, x1b x1bVar) {
        super(x1bVar);
        this.e = r120Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0L, null, this);
    }
}
