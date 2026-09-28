package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class hdh0 extends k5b {
    public static final hdh0 b = new hdh0();

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        s8k0 s8k0Var = (s8k0) coroutineContext.get(s8k0.b);
        if (s8k0Var != null) {
            s8k0Var.a = true;
        } else {
            zkh.a("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.k5b
    public final k5b g0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.k5b
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
