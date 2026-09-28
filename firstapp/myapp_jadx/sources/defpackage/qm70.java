package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qm70 {
    public static final boolean a = Boolean.getBoolean("rx2.scheduler.use-nanotime");
    public static final long b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final class a implements pse, Runnable {
        public final Runnable a;
        public final c b;
        public Thread c;

        public a(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        @Override // defpackage.pse
        public final void dispose() {
            if (this.c == Thread.currentThread()) {
                c cVar = this.b;
                if (cVar instanceof arx) {
                    arx arxVar = (arx) cVar;
                    if (arxVar.b) {
                        return;
                    }
                    arxVar.b = true;
                    arxVar.a.shutdown();
                    return;
                }
            }
            this.b.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c = Thread.currentThread();
            try {
                this.a.run();
            } finally {
                dispose();
                this.c = null;
            }
        }
    }

    public static final class b implements pse, Runnable {
        public final s2i.b a;
        public final c b;
        public volatile boolean c;

        public b(s2i.b bVar, c cVar) {
            this.a = bVar;
            this.b = cVar;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.c = true;
            this.b.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c) {
                return;
            }
            try {
                this.a.run();
            } catch (Throwable th) {
                qtg.a(th);
                this.b.dispose();
                throw otg.c(th);
            }
        }
    }

    public static abstract class c implements pse {

        public final class a implements Runnable {
            public final Runnable a;
            public final md80 b;
            public final long c;
            public long d;
            public long e;
            public long f;

            public a(long j, Runnable runnable, long j2, md80 md80Var, long j3) {
                this.a = runnable;
                this.b = md80Var;
                this.c = j3;
                this.e = j2;
                this.f = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.a.run();
                md80 md80Var = this.b;
                if (md80Var.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                cVar.getClass();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = qm70.a(timeUnit);
                long j2 = qm70.b;
                long j3 = jA + j2;
                long j4 = this.e;
                long j5 = this.c;
                if (j3 < j4 || jA >= j4 + j5 + j2) {
                    j = jA + j5;
                    long j6 = this.d + 1;
                    this.d = j6;
                    this.f = j - (j5 * j6);
                } else {
                    long j7 = this.f;
                    long j8 = this.d + 1;
                    this.d = j8;
                    j = (j8 * j5) + j7;
                }
                this.e = jA;
                xse.c(md80Var, cVar.a(this, j - jA, timeUnit));
            }
        }

        public abstract pse a(Runnable runnable, long j, TimeUnit timeUnit);

        public void b(Runnable runnable) {
            a(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public final pse c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            md80 md80Var = new md80();
            md80 md80Var2 = new md80();
            md80Var2.lazySet(md80Var);
            long nanos = timeUnit.toNanos(j2);
            long jA = qm70.a(TimeUnit.NANOSECONDS);
            pse pseVarA = a(new a(timeUnit.toNanos(j) + jA, runnable, jA, md80Var2, nanos), j, timeUnit);
            if (pseVarA == f2g.a) {
                return pseVarA;
            }
            xse.c(md80Var, pseVarA);
            return md80Var2;
        }
    }

    public static long a(TimeUnit timeUnit) {
        return !a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract c b();

    public pse c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public pse d(Runnable runnable, long j, TimeUnit timeUnit) {
        c cVarB = b();
        a aVar = new a(runnable, cVarB);
        cVarB.a(aVar, j, timeUnit);
        return aVar;
    }

    public pse e(s2i.b bVar, long j, long j2, TimeUnit timeUnit) {
        c cVarB = b();
        b bVar2 = new b(bVar, cVarB);
        pse pseVarC = cVarB.c(bVar2, j, j2, timeUnit);
        return pseVarC == f2g.a ? pseVarC : bVar2;
    }
}
