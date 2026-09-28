package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c3 extends AtomicReference<Future<?>> implements pse {
    public static final FutureTask<Void> c;
    public static final FutureTask<Void> d;
    public final Runnable a;
    public Thread b;

    static {
        taj.g gVar = taj.b;
        c = new FutureTask<>(gVar, null);
        d = new FutureTask<>(gVar, null);
    }

    public c3(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == c) {
                return;
            }
            if (future2 == d) {
                future.cancel(this.b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.pse
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == c || future == (futureTask = d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.b != Thread.currentThread());
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == c || future == d;
    }
}
