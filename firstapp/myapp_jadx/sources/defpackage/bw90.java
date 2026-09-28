package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class bw90 extends qm70 {
    public static final p760 d;
    public final AtomicReference<ScheduledExecutorService> c;

    public static final class a extends qm70.c {
        public final ScheduledExecutorService a;
        public final ema b = new ema();
        public volatile boolean c;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.a = scheduledExecutorService;
        }

        @Override // qm70.c
        public final pse a(Runnable runnable, long j, TimeUnit timeUnit) {
            f2g f2gVar = f2g.a;
            if (this.c) {
                return f2gVar;
            }
            om70 om70Var = new om70(runnable, this.b);
            this.b.b(om70Var);
            ScheduledExecutorService scheduledExecutorService = this.a;
            try {
                om70Var.a(j <= 0 ? scheduledExecutorService.submit((Callable) om70Var) : scheduledExecutorService.schedule((Callable) om70Var, j, timeUnit));
                return om70Var;
            } catch (RejectedExecutionException e) {
                dispose();
                o760.b(e);
                return f2gVar;
            }
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.c;
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        d = new p760("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public bw90() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.c = atomicReference;
        boolean z = tm70.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, d);
        if (tm70.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            tm70.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // defpackage.qm70
    public final qm70.c b() {
        return new a(this.c.get());
    }

    @Override // defpackage.qm70
    public final pse d(Runnable runnable, long j, TimeUnit timeUnit) {
        sz60 sz60Var = new sz60(runnable);
        AtomicReference<ScheduledExecutorService> atomicReference = this.c;
        try {
            sz60Var.a(j <= 0 ? atomicReference.get().submit(sz60Var) : atomicReference.get().schedule(sz60Var, j, timeUnit));
            return sz60Var;
        } catch (RejectedExecutionException e) {
            o760.b(e);
            return f2g.a;
        }
    }

    @Override // defpackage.qm70
    public final pse e(s2i.b bVar, long j, long j2, TimeUnit timeUnit) {
        f2g f2gVar = f2g.a;
        AtomicReference<ScheduledExecutorService> atomicReference = this.c;
        if (j2 > 0) {
            rz60 rz60Var = new rz60(bVar);
            try {
                rz60Var.a(atomicReference.get().scheduleAtFixedRate(rz60Var, j, j2, timeUnit));
                return rz60Var;
            } catch (RejectedExecutionException e) {
                o760.b(e);
                return f2gVar;
            }
        }
        ScheduledExecutorService scheduledExecutorService = atomicReference.get();
        nsn nsnVar = new nsn(bVar, scheduledExecutorService);
        try {
            nsnVar.a(j <= 0 ? scheduledExecutorService.submit(nsnVar) : scheduledExecutorService.schedule(nsnVar, j, timeUnit));
            return nsnVar;
        } catch (RejectedExecutionException e2) {
            o760.b(e2);
            return f2gVar;
        }
    }
}
