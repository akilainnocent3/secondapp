package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class aug extends ztg implements ekd {
    public final Executor b;

    public aug(Executor executor) {
        Method method;
        this.b = executor;
        Method method2 = boa.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = boa.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.b.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            i9p.b(coroutineContext, cancellationException);
            pfd pfdVar = fse.a;
            odd.b.d0(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aug) && ((aug) obj).b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.ekd
    public final void l(long j, bc6 bc6Var) {
        Executor executor = this.b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            kn50 kn50Var = new kn50(this, bc6Var);
            CoroutineContext coroutineContext = bc6Var.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(kn50Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                i9p.b(coroutineContext, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            bc6Var.u(new nb6(scheduledFutureSchedule));
        } else {
            hcd.y.l(j, bc6Var);
        }
    }

    @Override // defpackage.ekd
    public final wse m(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                i9p.b(coroutineContext, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new vse(scheduledFutureSchedule) : hcd.y.m(j, runnable, coroutineContext);
    }

    @Override // defpackage.k5b
    public final String toString() {
        return this.b.toString();
    }
}
