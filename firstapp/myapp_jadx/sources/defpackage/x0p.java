package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class x0p extends qm70 {
    public static final p760 d;
    public static final p760 e;
    public static final long f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    public static final c g;
    public static final boolean h;
    public static final a i;
    public final AtomicReference<a> c;

    public static final class a implements Runnable {
        public final long a;
        public final ConcurrentLinkedQueue<c> b;
        public final ema c;
        public final ScheduledExecutorService d;
        public final ScheduledFuture e;
        public final ThreadFactory f;

        public a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.a = nanos;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new ema();
            this.f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, x0p.e);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.e = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (c cVar : concurrentLinkedQueue) {
                if (cVar.c > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(cVar)) {
                    this.c.c(cVar);
                }
            }
        }
    }

    public static final class b extends qm70.c implements Runnable {
        public final a b;
        public final c c;
        public final AtomicBoolean d = new AtomicBoolean();
        public final ema a = new ema();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.b = aVar;
            if (aVar.c.b) {
                cVar2 = x0p.g;
            } else {
                do {
                    if (aVar.b.isEmpty()) {
                        cVar = new c(aVar.f);
                        aVar.c.b(cVar);
                        break;
                    }
                    cVar = aVar.b.poll();
                } while (cVar == null);
                cVar2 = cVar;
            }
            this.c = cVar2;
        }

        @Override // qm70.c
        public final pse a(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.a.b ? f2g.a : this.c.d(runnable, j, timeUnit, this.a);
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (this.d.compareAndSet(false, true)) {
                this.a.dispose();
                if (x0p.h) {
                    this.c.d(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                a aVar = this.b;
                aVar.getClass();
                long jNanoTime = System.nanoTime() + aVar.a;
                c cVar = this.c;
                cVar.c = jNanoTime;
                aVar.b.offer(cVar);
            }
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.d.get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = this.b;
            aVar.getClass();
            long jNanoTime = System.nanoTime() + aVar.a;
            c cVar = this.c;
            cVar.c = jNanoTime;
            aVar.b.offer(cVar);
        }
    }

    public static final class c extends arx {
        public long c;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.c = 0L;
        }
    }

    static {
        c cVar = new c(new p760("RxCachedThreadSchedulerShutdown"));
        g = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        p760 p760Var = new p760("RxCachedThreadScheduler", iMax, false);
        d = p760Var;
        e = new p760("RxCachedWorkerPoolEvictor", iMax, false);
        h = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, p760Var);
        i = aVar;
        aVar.c.dispose();
        ScheduledFuture scheduledFuture = aVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public x0p() {
        a aVar = i;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.c = atomicReference;
        a aVar2 = new a(f, TimeUnit.SECONDS, d);
        while (!atomicReference.compareAndSet(aVar, aVar2)) {
            if (atomicReference.get() != aVar) {
                aVar2.c.dispose();
                ScheduledFuture scheduledFuture = aVar2.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = aVar2.d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.qm70
    public final qm70.c b() {
        return new b(this.c.get());
    }
}
