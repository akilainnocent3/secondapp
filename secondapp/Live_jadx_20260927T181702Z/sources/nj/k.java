package nj;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@qj.b
@yi.c
@yi.d
public abstract class k extends AbstractExecutorService implements y1, AutoCloseable {
    public /* synthetic */ void close() {
        v1.h.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    @qj.a
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, @f2 T value) {
        return d3.Q(runnable, value);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    @qj.a
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return d3.R(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, nj.y1
    @qj.a
    public t1<?> submit(Runnable task) {
        return (t1) super.submit(task);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, nj.y1
    @qj.a
    public <T> t1<T> submit(Runnable task, @f2 T result) {
        return (t1) super.submit(task, (Object) result);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, nj.y1
    @qj.a
    public <T> t1<T> submit(Callable<T> task) {
        return (t1) super.submit((Callable) task);
    }
}
