package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class wpg0 extends qm70 {
    public static final /* synthetic */ int c = 0;

    public static final class a implements Runnable {
        public final Runnable a;
        public final c b;
        public final long c;

        public a(Runnable runnable, c cVar, long j) {
            this.a = runnable;
            this.b = cVar;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.d) {
                return;
            }
            long jA = qm70.a(TimeUnit.MILLISECONDS);
            long j = this.c;
            if (j > jA) {
                try {
                    Thread.sleep(j - jA);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    o760.b(e);
                    return;
                }
            }
            if (this.b.d) {
                return;
            }
            this.a.run();
        }
    }

    public static final class b implements Comparable<b> {
        public final Runnable a;
        public final long b;
        public final int c;
        public volatile boolean d;

        public b(Runnable runnable, Long l, int i) {
            this.a = runnable;
            this.b = l.longValue();
            this.c = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            int i;
            b bVar2 = bVar;
            long j = this.b;
            long j2 = bVar2.b;
            if (j < j2) {
                i = -1;
            } else {
                i = j > j2 ? 1 : 0;
            }
            if (i != 0) {
                return i;
            }
            int i2 = bVar2.c;
            int i3 = this.c;
            if (i3 < i2) {
                return -1;
            }
            return i3 > i2 ? 1 : 0;
        }
    }

    public static final class c extends qm70.c {
        public final PriorityBlockingQueue<b> a = new PriorityBlockingQueue<>();
        public final AtomicInteger b = new AtomicInteger();
        public final AtomicInteger c = new AtomicInteger();
        public volatile boolean d;

        public final class a implements Runnable {
            public final b a;

            public a(b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d = true;
                c.this.a.remove(this.a);
            }
        }

        @Override // qm70.c
        public final pse a(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + qm70.a(TimeUnit.MILLISECONDS);
            return d(millis, new a(runnable, this, millis));
        }

        @Override // qm70.c
        public final void b(Runnable runnable) {
            d(qm70.a(TimeUnit.MILLISECONDS), runnable);
        }

        public final pse d(long j, Runnable runnable) {
            f2g f2gVar = f2g.a;
            if (!this.d) {
                b bVar = new b(runnable, Long.valueOf(j), this.c.incrementAndGet());
                this.a.add(bVar);
                if (this.b.getAndIncrement() != 0) {
                    return new y160(new a(bVar));
                }
                int iAddAndGet = 1;
                while (true) {
                    boolean z = this.d;
                    PriorityBlockingQueue<b> priorityBlockingQueue = this.a;
                    if (z) {
                        priorityBlockingQueue.clear();
                        return f2gVar;
                    }
                    b bVarPoll = priorityBlockingQueue.poll();
                    if (bVarPoll == null) {
                        iAddAndGet = this.b.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (!bVarPoll.d) {
                        bVarPoll.a.run();
                    }
                }
            }
            return f2gVar;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.d = true;
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.d;
        }
    }

    static {
        new wpg0();
    }

    @Override // defpackage.qm70
    public final qm70.c b() {
        return new c();
    }

    @Override // defpackage.qm70
    public final pse c(Runnable runnable) {
        runnable.run();
        return f2g.a;
    }

    @Override // defpackage.qm70
    public final pse d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            o760.b(e);
        }
        return f2g.a;
    }
}
