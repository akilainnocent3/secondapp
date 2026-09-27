package nj;

import cj.v6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public abstract class j3 implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f117090b;

    public j3(ExecutorService delegate) {
        this.f117090b = (ExecutorService) zi.l0.E(delegate);
    }

    public static /* synthetic */ void a(Callable callable) {
        try {
            callable.call();
        } catch (Exception e10) {
            h2.b(e10);
            zi.y0.w(e10);
            throw new RuntimeException(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return this.f117090b.awaitTermination(timeout, unit);
    }

    public Runnable b(Runnable command) {
        final Callable callableC = c(Executors.callable(command, null));
        return new Runnable() { // from class: nj.i3
            @Override // java.lang.Runnable
            public final void run() {
                j3.a(callableC);
            }
        };
    }

    public abstract <T> Callable<T> c(Callable<T> callable);

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        v1.h.a(this);
    }

    public final <T> v6<Callable<T>> d(Collection<? extends Callable<T>> tasks) {
        v6.a aVarQ = v6.q();
        Iterator<? extends Callable<T>> it = tasks.iterator();
        while (it.hasNext()) {
            aVarQ.g(c(it.next()));
        }
        return aVarQ.e();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        this.f117090b.execute(b(command));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return this.f117090b.invokeAll(d(tasks));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f117090b.invokeAny(d(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f117090b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f117090b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f117090b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @qj.a
    public final List<Runnable> shutdownNow() {
        return this.f117090b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> task) {
        return this.f117090b.submit(c((Callable) zi.l0.E(task)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return this.f117090b.invokeAll(d(tasks), timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f117090b.invokeAny(d(collection), j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable task) {
        return this.f117090b.submit(b(task));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable task, @f2 T result) {
        return this.f117090b.submit(b(task), result);
    }
}
