package nj;

import cj.w5;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public abstract class y0 extends w5 implements ExecutorService, AutoCloseable {
    @Override // cj.w5
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public abstract ExecutorService g2();

    @Override // java.util.concurrent.ExecutorService
    @qj.b
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return g2().awaitTermination(timeout, unit);
    }

    public /* synthetic */ void close() {
        v1.h.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        g2().execute(command);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return g2().invokeAll(tasks);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) g2().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return g2().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return g2().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        g2().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @qj.a
    public List<Runnable> shutdownNow() {
        return g2().shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> task) {
        return g2().submit(task);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return g2().invokeAll(tasks, timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) g2().invokeAny(collection, j10, timeUnit);
    }

    public Future<?> submit(Runnable task) {
        return g2().submit(task);
    }

    public <T> Future<T> submit(Runnable task, @f2 T result) {
        return g2().submit(task, result);
    }
}
