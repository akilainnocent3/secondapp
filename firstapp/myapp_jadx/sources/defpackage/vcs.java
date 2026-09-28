package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public final class vcs extends k5b implements ekd {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(vcs.class, "runningWorkers$volatile");
    public static final /* synthetic */ long v = s0o.a.objectFieldOffset(vcs.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ ekd b;
    public final k5b c;
    public final int d;
    public final vet<Runnable> e;
    public final Object f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public final class a implements Runnable {
        public Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    o5b.a(e.a, th);
                }
                try {
                    Runnable runnableH0 = vcs.this.h0();
                    if (runnableH0 == null) {
                        return;
                    }
                    this.a = runnableH0;
                    i++;
                    if (i >= 16) {
                        vcs vcsVar = vcs.this;
                        if (zre.d(vcsVar.c, vcsVar)) {
                            vcs vcsVar2 = vcs.this;
                            zre.c(vcsVar2.c, vcsVar2, this);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    vcs vcsVar3 = vcs.this;
                    synchronized (vcsVar3.f) {
                        vcs.i.decrementAndGet(vcsVar3);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vcs(k5b k5bVar, int i2) {
        ekd ekdVar = k5bVar instanceof ekd ? (ekd) k5bVar : null;
        this.b = ekdVar == null ? icd.a : ekdVar;
        this.c = k5bVar;
        this.d = i2;
        this.e = new vet<>();
        this.f = new Object();
    }

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableH0;
        this.e.a(runnable);
        if (s0o.a.getIntVolatile(this, v) >= this.d || !l0() || (runnableH0 = h0()) == null) {
            return;
        }
        try {
            zre.c(this.c, this, new a(runnableH0));
        } catch (Throwable th) {
            i.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.k5b
    public final void e0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableH0;
        this.e.a(runnable);
        if (s0o.a.getIntVolatile(this, v) >= this.d || !l0() || (runnableH0 = h0()) == null) {
            return;
        }
        try {
            this.c.e0(this, new a(runnableH0));
        } catch (Throwable th) {
            i.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.k5b
    public final k5b g0(int i2) {
        wcs.a(i2);
        return i2 >= this.d ? this : super.g0(i2);
    }

    public final Runnable h0() {
        while (true) {
            Runnable runnableD = this.e.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.ekd
    public final void l(long j, bc6 bc6Var) {
        this.b.l(j, bc6Var);
    }

    public final boolean l0() {
        synchronized (this.f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (s0o.a.getIntVolatile(this, v) >= this.d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.ekd
    public final wse m(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.b.m(j, runnable, coroutineContext);
    }

    @Override // defpackage.k5b
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(".limitedParallelism(");
        return rr1.b(sb, this.d, ')');
    }
}
