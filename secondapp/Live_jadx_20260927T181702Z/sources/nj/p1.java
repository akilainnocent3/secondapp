package nj;

import com.ironsource.C4235d4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@km.h(km.h.a.FULL)
@yi.b(emulated = true)
public abstract class p1<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f117243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Runnable f117244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f117245d = 1000;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.e
    public static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p1<?> f117246b;

        @yi.e
        @zq.a
        public Thread d() {
            return super.getExclusiveOwnerThread();
        }

        public final void e(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.f117246b.toString();
        }

        public b(p1<?> task) {
            this.f117246b = task;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f117243b = new c();
        f117244c = new c();
    }

    public abstract void a(Throwable error);

    public abstract void b(@f2 T result);

    public final void d() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.e(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f117243b) == f117244c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean g();

    @f2
    public abstract T h() throws Exception;

    public abstract String i();

    public final void j(Thread currentThread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f117244c) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f117244c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            currentThread.interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objH = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zG = g();
            if (!zG) {
                try {
                    objH = h();
                } catch (Throwable th2) {
                    try {
                        h2.b(th2);
                        if (!compareAndSet(threadCurrentThread, f117243b)) {
                            j(threadCurrentThread);
                        }
                        if (zG) {
                            return;
                        }
                        a(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, f117243b)) {
                            j(threadCurrentThread);
                        }
                        if (!zG) {
                            b(d2.a(null));
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f117243b)) {
                j(threadCurrentThread);
            }
            if (zG) {
                return;
            }
            b(d2.a(objH));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f117243b) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + C4235d4.j.f61462e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + i();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
