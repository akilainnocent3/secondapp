package nj;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@qj.f("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
@yi.c
public interface y1 extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException;

    /* bridge */ /* synthetic */ Future submit(Runnable task);

    /* bridge */ /* synthetic */ Future submit(Runnable task, @f2 Object result);

    /* bridge */ /* synthetic */ Future submit(Callable task);

    t1<?> submit(Runnable task);

    <T> t1<T> submit(Runnable task, @f2 T result);

    <T> t1<T> submit(Callable<T> task);
}
