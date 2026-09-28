package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public final class odd extends ztg implements Executor {
    public static final odd b = new odd();
    public static final k5b c;

    static {
        igh0 igh0Var = igh0.b;
        int i = yqe0.a;
        if (64 >= i) {
            i = 64;
        }
        c = igh0Var.g0(zqe0.b(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        c.d0(coroutineContext, runnable);
    }

    @Override // defpackage.k5b
    public final void e0(CoroutineContext coroutineContext, Runnable runnable) {
        c.e0(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d0(e.a, runnable);
    }

    @Override // defpackage.k5b
    public final k5b g0(int i) {
        return igh0.b.g0(i);
    }

    @Override // defpackage.k5b
    public final String toString() {
        return "Dispatchers.IO";
    }
}
