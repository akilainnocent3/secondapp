package nj;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f116904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.a
    @rj.a("lock")
    public a f116905c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @km.m
        public final b2 f116906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Condition f116907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @rj.a("monitor.lock")
        public int f116908c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @zq.a
        @rj.a("monitor.lock")
        public a f116909d;

        public a(b2 monitor) {
            this.f116906a = (b2) zi.l0.F(monitor, kp.b.f102821a);
            this.f116907b = monitor.f116904b.newCondition();
        }

        public abstract boolean a();
    }

    public b2() {
        this(false);
    }

    public static long E(long startTime, long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        return timeoutNanos - (System.nanoTime() - startTime);
    }

    public static long H(long time, TimeUnit unit) {
        return lj.n.g(unit.toNanos(time), 0L, 6917529027641081853L);
    }

    public static long y(long timeoutNanos) {
        if (timeoutNanos <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    public boolean A() {
        return this.f116904b.isLocked();
    }

    public boolean B() {
        return this.f116904b.isHeldByCurrentThread();
    }

    @rj.a("lock")
    public final boolean C(a guard) {
        try {
            return guard.a();
        } catch (Throwable th2) {
            F();
            throw th2;
        }
    }

    public void D() {
        ReentrantLock reentrantLock = this.f116904b;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                G();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @rj.a("lock")
    public final void F() {
        for (a aVar = this.f116905c; aVar != null; aVar = aVar.f116909d) {
            aVar.f116907b.signalAll();
        }
    }

    @rj.a("lock")
    public final void G() {
        for (a aVar = this.f116905c; aVar != null; aVar = aVar.f116909d) {
            if (C(aVar)) {
                aVar.f116907b.signal();
                return;
            }
        }
    }

    public boolean I() {
        return this.f116904b.tryLock();
    }

    public boolean J(a guard) {
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f116904b;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean zA = guard.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void K(a guard) throws InterruptedException {
        if (guard.f116906a != this || !this.f116904b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.a()) {
            return;
        }
        b(guard, true);
    }

    public boolean L(a guard, long time, TimeUnit unit) throws InterruptedException {
        long jH = H(time, unit);
        if (guard.f116906a != this || !this.f116904b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.a()) {
            return true;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return c(guard, jH, true);
    }

    public void M(a guard) {
        if (guard.f116906a != this || !this.f116904b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.a()) {
            return;
        }
        d(guard, true);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    public boolean N(a guard, long time, TimeUnit unit) throws Throwable {
        long jH = H(time, unit);
        if (guard.f116906a != this || !this.f116904b.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        boolean z10 = true;
        if (guard.a()) {
            return true;
        }
        long jY = y(jH);
        boolean zInterrupted = Thread.interrupted();
        long jE = jH;
        boolean z11 = true;
        while (true) {
            try {
                try {
                    boolean zC = c(guard, jE, z11);
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return zC;
                } catch (Throwable th2) {
                    th = th2;
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (InterruptedException unused) {
                if (guard.a()) {
                    Thread.currentThread().interrupt();
                    return true;
                }
                jE = E(jY, jH);
                z11 = false;
                zInterrupted = true;
            } catch (Throwable th3) {
                th = th3;
                z10 = zInterrupted;
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    @rj.a("lock")
    public final void b(a guard, boolean signalBeforeWaiting) throws InterruptedException {
        if (signalBeforeWaiting) {
            G();
        }
        e(guard);
        do {
            try {
                guard.f116907b.await();
            } finally {
                f(guard);
            }
        } while (!guard.a());
    }

    @rj.a("lock")
    public final boolean c(a guard, long nanos, boolean signalBeforeWaiting) throws InterruptedException {
        boolean z10 = true;
        while (nanos > 0) {
            if (z10) {
                if (signalBeforeWaiting) {
                    try {
                        G();
                    } catch (Throwable th2) {
                        if (!z10) {
                            f(guard);
                        }
                        throw th2;
                    }
                }
                e(guard);
                z10 = false;
            }
            nanos = guard.f116907b.awaitNanos(nanos);
            if (guard.a()) {
                if (!z10) {
                    f(guard);
                }
                return true;
            }
        }
        if (!z10) {
            f(guard);
        }
        return false;
    }

    @rj.a("lock")
    public final void d(a guard, boolean signalBeforeWaiting) {
        if (signalBeforeWaiting) {
            G();
        }
        e(guard);
        do {
            try {
                guard.f116907b.awaitUninterruptibly();
            } finally {
                f(guard);
            }
        } while (!guard.a());
    }

    @rj.a("lock")
    public final void e(a guard) {
        int i10 = guard.f116908c;
        guard.f116908c = i10 + 1;
        if (i10 == 0) {
            guard.f116909d = this.f116905c;
            this.f116905c = guard;
        }
    }

    @rj.a("lock")
    public final void f(a guard) {
        int i10 = guard.f116908c - 1;
        guard.f116908c = i10;
        if (i10 == 0) {
            a aVar = this.f116905c;
            a aVar2 = null;
            while (aVar != guard) {
                aVar2 = aVar;
                aVar = aVar.f116909d;
            }
            if (aVar2 == null) {
                this.f116905c = aVar.f116909d;
            } else {
                aVar2.f116909d = aVar.f116909d;
            }
            aVar.f116909d = null;
        }
    }

    public void g() {
        this.f116904b.lock();
    }

    public boolean h(long time, TimeUnit unit) throws Throwable {
        boolean zTryLock;
        long jH = H(time, unit);
        ReentrantLock reentrantLock = this.f116904b;
        boolean z10 = true;
        if (!this.f116903a && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = Thread.interrupted();
        try {
            long jNanoTime = System.nanoTime();
            long jE = jH;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jE, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    jE = E(jNanoTime, jH);
                    zInterrupted = true;
                }
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th3) {
            th = th3;
            z10 = zInterrupted;
        }
    }

    public boolean i(a guard) {
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f116904b;
        reentrantLock.lock();
        try {
            boolean zA = guard.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean j(a guard, long time, TimeUnit unit) {
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        if (!h(time, unit)) {
            return false;
        }
        try {
            boolean zA = guard.a();
            if (!zA) {
                this.f116904b.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            this.f116904b.unlock();
            throw th2;
        }
    }

    public boolean k(a guard) throws InterruptedException {
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f116904b;
        reentrantLock.lockInterruptibly();
        try {
            boolean zA = guard.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean l(a guard, long time, TimeUnit unit) throws InterruptedException {
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f116904b;
        if (!reentrantLock.tryLock(time, unit)) {
            return false;
        }
        try {
            boolean zA = guard.a();
            if (!zA) {
                reentrantLock.unlock();
            }
            return zA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void m() throws InterruptedException {
        this.f116904b.lockInterruptibly();
    }

    public boolean n(long time, TimeUnit unit) throws InterruptedException {
        return this.f116904b.tryLock(time, unit);
    }

    public void o(a guard) throws InterruptedException {
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f116904b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.a()) {
                return;
            }
            b(guard, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    public boolean p(a guard, long time, TimeUnit unit) throws InterruptedException {
        long jY;
        boolean z10;
        long jH = H(time, unit);
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f116904b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        if (this.f116903a) {
            jY = y(jH);
            if (!reentrantLock.tryLock(time, unit)) {
                return false;
            }
        } else {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (reentrantLock.tryLock()) {
                jY = 0;
            } else {
                jY = y(jH);
                if (!reentrantLock.tryLock(time, unit)) {
                    return false;
                }
            }
        }
        try {
            if (!guard.a()) {
                if (jY != 0) {
                    jH = E(jY, jH);
                }
                z10 = c(guard, jH, zIsHeldByCurrentThread);
            }
            if (!z10) {
                reentrantLock.unlock();
            }
            return z10;
        } catch (Throwable th2) {
            if (!zIsHeldByCurrentThread) {
                try {
                    G();
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw th2;
        }
    }

    public void q(a guard) {
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f116904b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.a()) {
                return;
            }
            d(guard, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            D();
            throw th2;
        }
    }

    public boolean r(a guard, long time, TimeUnit unit) throws Throwable {
        long jY;
        long jE;
        long jH = H(time, unit);
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.f116904b;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        boolean zInterrupted = Thread.interrupted();
        try {
            boolean zC = true;
            if (this.f116903a || !reentrantLock.tryLock()) {
                jY = y(jH);
                long jE2 = jH;
                while (true) {
                    try {
                        try {
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            zInterrupted = true;
                            if (zInterrupted) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jE2 = E(jY, jH);
                        zInterrupted = true;
                    }
                }
                if (!reentrantLock.tryLock(jE2, TimeUnit.NANOSECONDS)) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
            } else {
                jY = 0;
            }
            while (!guard.a()) {
                try {
                    if (jY == 0) {
                        jY = y(jH);
                        jE = jH;
                    } else {
                        jE = E(jY, jH);
                    }
                    zC = c(guard, jE, zIsHeldByCurrentThread);
                } catch (InterruptedException unused2) {
                    zIsHeldByCurrentThread = false;
                    zInterrupted = zC;
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
            if (!zC) {
                reentrantLock.unlock();
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zC;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public int s() {
        return this.f116904b.getHoldCount();
    }

    public int t() {
        return this.f116904b.getQueueLength();
    }

    public int u(a guard) {
        if (guard.f116906a != this) {
            throw new IllegalMonitorStateException();
        }
        this.f116904b.lock();
        try {
            return guard.f116908c;
        } finally {
            this.f116904b.unlock();
        }
    }

    public boolean v(Thread thread) {
        return this.f116904b.hasQueuedThread(thread);
    }

    public boolean w() {
        return this.f116904b.hasQueuedThreads();
    }

    public boolean x(a guard) {
        return u(guard) > 0;
    }

    public boolean z() {
        return this.f116903a;
    }

    public b2(boolean fair) {
        this.f116905c = null;
        this.f116903a = fair;
        this.f116904b = new ReentrantLock(fair);
    }
}
