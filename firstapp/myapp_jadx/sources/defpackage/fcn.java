package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class fcn<V> implements qis<V> {

    public static class a<V> extends fcn<V> {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        @Override // java.util.concurrent.Future
        public final V get() throws ExecutionException {
            throw new ExecutionException(this.a);
        }

        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.a + "]]";
        }
    }

    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    public static final class c<V> extends fcn<V> {
        public static final c b = new c(null);
        public final V a;

        public c(V v) {
            this.a = v;
        }

        @Override // java.util.concurrent.Future
        public final V get() {
            return this.a;
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // defpackage.qis
    public final void k(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            pgt.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }
}
