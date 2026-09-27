package nj;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public class u1<V> extends FutureTask<V> implements t1<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f117324b;

    public u1(Callable<V> callable) {
        super(callable);
        this.f117324b = new q0();
    }

    public static <V> u1<V> a(Runnable runnable, @f2 V result) {
        return new u1<>(runnable, result);
    }

    public static <V> u1<V> b(Callable<V> callable) {
        return new u1<>(callable);
    }

    @Override // nj.t1
    public void addListener(Runnable listener, Executor exec) {
        this.f117324b.a(listener, exec);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.f117324b.b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @f2
    @qj.a
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        return nanos <= e2.f116944a ? (V) super.get(j10, timeUnit) : (V) super.get(Math.min(nanos, e2.f116944a), TimeUnit.NANOSECONDS);
    }

    public u1(Runnable runnable, @f2 V result) {
        super(runnable, result);
        this.f117324b = new q0();
    }
}
