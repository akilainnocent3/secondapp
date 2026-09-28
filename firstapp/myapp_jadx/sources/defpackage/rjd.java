package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class rjd extends k5b {
    public static final /* synthetic */ long d = s0o.a.objectFieldOffset(rjd.class.getDeclaredField("c"));
    public final k5b b;
    public volatile /* synthetic */ int c = 1;

    public rjd(k5b k5bVar) {
        this.b = k5bVar;
    }

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        h0().d0(coroutineContext, runnable);
    }

    @Override // defpackage.k5b
    public final void e0(CoroutineContext coroutineContext, Runnable runnable) {
        h0().e0(coroutineContext, runnable);
    }

    @Override // defpackage.k5b
    public final boolean f0(CoroutineContext coroutineContext) {
        return h0().f0(coroutineContext);
    }

    @Override // defpackage.k5b
    public final k5b g0(int i) {
        return h0().g0(i);
    }

    public final k5b h0() {
        return s0o.a.getIntVolatile(this, d) == 1 ? fse.b : this.b;
    }

    @Override // defpackage.k5b
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.b + ")";
    }
}
