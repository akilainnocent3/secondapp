package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class arx extends qm70.c {
    public final ScheduledExecutorService a;
    public volatile boolean b;

    public arx(ThreadFactory threadFactory) {
        boolean z = tm70.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (tm70.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            tm70.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // qm70.c
    public final pse a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b ? f2g.a : d(runnable, j, timeUnit, null);
    }

    @Override // qm70.c
    public final void b(Runnable runnable) {
        a(runnable, 0L, null);
    }

    public final om70 d(Runnable runnable, long j, TimeUnit timeUnit, rse rseVar) {
        om70 om70Var = new om70(runnable, rseVar);
        if (rseVar != null && !rseVar.b(om70Var)) {
            return om70Var;
        }
        ScheduledExecutorService scheduledExecutorService = this.a;
        try {
            om70Var.a(j <= 0 ? scheduledExecutorService.submit((Callable) om70Var) : scheduledExecutorService.schedule((Callable) om70Var, j, timeUnit));
            return om70Var;
        } catch (RejectedExecutionException e) {
            if (rseVar != null) {
                rseVar.c(om70Var);
            }
            o760.b(e);
            return om70Var;
        }
    }

    @Override // defpackage.pse
    public final void dispose() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.shutdownNow();
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this.b;
    }
}
