package nj;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public final class n0 extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f117206b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @rj.a("lock")
    public int f117207c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @rj.a("lock")
    public boolean f117208d = false;

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        long nanos = unit.toNanos(timeout);
        synchronized (this.f117206b) {
            while (true) {
                try {
                    if (this.f117208d && this.f117207c == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f117206b, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void d() {
        synchronized (this.f117206b) {
            try {
                int i10 = this.f117207c - 1;
                this.f117207c = i10;
                if (i10 == 0) {
                    this.f117206b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        h();
        try {
            command.run();
        } finally {
            d();
        }
    }

    public final void h() {
        synchronized (this.f117206b) {
            try {
                if (this.f117208d) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f117207c++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z10;
        synchronized (this.f117206b) {
            z10 = this.f117208d;
        }
        return z10;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean z10;
        synchronized (this.f117206b) {
            try {
                z10 = this.f117208d && this.f117207c == 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.f117206b) {
            try {
                this.f117208d = true;
                if (this.f117207c == 0) {
                    this.f117206b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}
