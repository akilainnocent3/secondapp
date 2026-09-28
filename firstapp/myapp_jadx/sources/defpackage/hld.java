package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class hld implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService a;
    public final ScheduledExecutorService b;

    public hld(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new ild(new ild.b() { // from class: vkd
            @Override // ild.b
            public final ScheduledFuture a(final ild.a aVar) {
                final hld hldVar = this.a;
                ScheduledExecutorService scheduledExecutorService = hldVar.b;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.schedule(new Runnable() { // from class: cld
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService = hldVar.a;
                        final Runnable runnable3 = runnable2;
                        final ild.a aVar2 = aVar;
                        executorService.execute(new Runnable() { // from class: fld
                            @Override // java.lang.Runnable
                            public final void run() {
                                Runnable runnable4 = runnable3;
                                ild ildVar = ild.this;
                                try {
                                    runnable4.run();
                                    ildVar.j(null);
                                } catch (Exception e) {
                                    ildVar.l(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ild(new ild.b() { // from class: ykd
            @Override // ild.b
            public final ScheduledFuture a(final ild.a aVar) {
                final hld hldVar = this.a;
                ScheduledExecutorService scheduledExecutorService = hldVar.b;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: bld
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService = hldVar.a;
                        final Runnable runnable3 = runnable2;
                        final ild.a aVar2 = aVar;
                        executorService.execute(new Runnable() { // from class: wkd
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                try {
                                    runnable3.run();
                                } catch (Exception e) {
                                    ild.this.l(e);
                                    throw e;
                                }
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new ild(new ild.b() { // from class: zkd
            @Override // ild.b
            public final ScheduledFuture a(final ild.a aVar) {
                final hld hldVar = this.a;
                ScheduledExecutorService scheduledExecutorService = hldVar.b;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: eld
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService = hldVar.a;
                        final Runnable runnable3 = runnable2;
                        final ild.a aVar2 = aVar;
                        executorService.execute(new Runnable() { // from class: xkd
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    runnable3.run();
                                } catch (Exception e) {
                                    ild.this.l(e);
                                }
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new ild(new ild.b() { // from class: ald
            @Override // ild.b
            public final ScheduledFuture a(final ild.a aVar) {
                final hld hldVar = this.a;
                ScheduledExecutorService scheduledExecutorService = hldVar.b;
                final Callable callable2 = callable;
                return scheduledExecutorService.schedule(new Callable() { // from class: dld
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ExecutorService executorService = hldVar.a;
                        final Callable callable3 = callable2;
                        final ild.a aVar2 = aVar;
                        return executorService.submit(new Runnable() { // from class: gld
                            @Override // java.lang.Runnable
                            public final void run() {
                                Callable callable4 = callable3;
                                ild ildVar = ild.this;
                                try {
                                    ildVar.j(callable4.call());
                                } catch (Exception e) {
                                    ildVar.l(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }
}
