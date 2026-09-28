package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class sna extends qm70 {
    public static final b d;
    public static final p760 e;
    public static final int f;
    public static final c g;
    public final AtomicReference<b> c;

    public static final class a extends qm70.c {
        public final rgs a;
        public final ema b;
        public final rgs c;
        public final c d;
        public volatile boolean e;

        public a(c cVar) {
            this.d = cVar;
            rgs rgsVar = new rgs();
            this.a = rgsVar;
            ema emaVar = new ema();
            this.b = emaVar;
            rgs rgsVar2 = new rgs();
            this.c = rgsVar2;
            rgsVar2.b(rgsVar);
            rgsVar2.b(emaVar);
        }

        @Override // qm70.c
        public final pse a(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.e ? f2g.a : this.d.d(runnable, j, timeUnit, this.b);
        }

        @Override // qm70.c
        public final void b(Runnable runnable) {
            if (this.e) {
                return;
            }
            this.d.d(runnable, 0L, TimeUnit.MILLISECONDS, this.a);
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.c.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.e;
        }
    }

    public static final class b {
        public final int a;
        public final c[] b;
        public long c;

        public b(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public final c a() {
            int i = this.a;
            if (i == 0) {
                return sna.g;
            }
            long j = this.c;
            this.c = 1 + j;
            return this.b[(int) (j % ((long) i))];
        }
    }

    public static final class c extends arx {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f = iAvailableProcessors;
        c cVar = new c(new p760("RxComputationShutdown"));
        g = cVar;
        cVar.dispose();
        p760 p760Var = new p760("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        e = p760Var;
        b bVar = new b(0, p760Var);
        d = bVar;
        for (c cVar2 : bVar.b) {
            cVar2.dispose();
        }
    }

    public sna() {
        b bVar = d;
        AtomicReference<b> atomicReference = new AtomicReference<>(bVar);
        this.c = atomicReference;
        b bVar2 = new b(f, e);
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                for (c cVar : bVar2.b) {
                    cVar.dispose();
                }
                return;
            }
        }
    }

    @Override // defpackage.qm70
    public final qm70.c b() {
        return new a(this.c.get().a());
    }

    @Override // defpackage.qm70
    public final pse d(Runnable runnable, long j, TimeUnit timeUnit) {
        c cVarA = this.c.get().a();
        cVarA.getClass();
        sz60 sz60Var = new sz60(runnable);
        ScheduledExecutorService scheduledExecutorService = cVarA.a;
        try {
            sz60Var.a(j <= 0 ? scheduledExecutorService.submit(sz60Var) : scheduledExecutorService.schedule(sz60Var, j, timeUnit));
            return sz60Var;
        } catch (RejectedExecutionException e2) {
            o760.b(e2);
            return f2g.a;
        }
    }

    @Override // defpackage.qm70
    public final pse e(s2i.b bVar, long j, long j2, TimeUnit timeUnit) {
        c cVarA = this.c.get().a();
        ScheduledExecutorService scheduledExecutorService = cVarA.a;
        if (j2 <= 0) {
            nsn nsnVar = new nsn(bVar, scheduledExecutorService);
            try {
                nsnVar.a(j <= 0 ? scheduledExecutorService.submit(nsnVar) : scheduledExecutorService.schedule(nsnVar, j, timeUnit));
                return nsnVar;
            } catch (RejectedExecutionException e2) {
                o760.b(e2);
            }
        } else {
            rz60 rz60Var = new rz60(bVar);
            try {
                rz60Var.a(cVarA.a.scheduleAtFixedRate(rz60Var, j, j2, timeUnit));
                return rz60Var;
            } catch (RejectedExecutionException e3) {
                o760.b(e3);
            }
        }
        return f2g.a;
    }
}
