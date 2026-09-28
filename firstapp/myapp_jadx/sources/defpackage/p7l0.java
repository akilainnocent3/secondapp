package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class p7l0 extends xal0 {
    public static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);
    public n7l0 c;
    public n7l0 d;
    public final PriorityBlockingQueue e;
    public final LinkedBlockingQueue f;
    public final j7l0 g;
    public final j7l0 h;
    public final Object i;
    public final Semaphore j;

    public p7l0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new j7l0(this, "Thread death: Uncaught exception on worker thread");
        this.h = new j7l0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.val0
    public final void g() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        ib5.a("Call expected from worker thread");
    }

    @Override // defpackage.xal0
    public final boolean h() {
        return false;
    }

    public final void k() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        ib5.a("Call expected from network thread");
    }

    public final void l() {
        if (Thread.currentThread() != this.c) {
            return;
        }
        ib5.a("Call not expected from worker thread");
    }

    public final boolean m() {
        return Thread.currentThread() == this.c;
    }

    public final l7l0 n(Callable callable) {
        i();
        l7l0 l7l0Var = new l7l0(this, callable, false);
        if (Thread.currentThread() != this.c) {
            t(l7l0Var);
            return l7l0Var;
        }
        if (!this.e.isEmpty()) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.a("Callable skipped the worker queue.");
        }
        l7l0Var.run();
        return l7l0Var;
    }

    public final l7l0 o(Callable callable) {
        i();
        l7l0 l7l0Var = new l7l0(this, callable, true);
        if (Thread.currentThread() == this.c) {
            l7l0Var.run();
            return l7l0Var;
        }
        t(l7l0Var);
        return l7l0Var;
    }

    public final void p(Runnable runnable) {
        i();
        hm20.h(runnable);
        t(new l7l0(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object q(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            p7l0 p7l0Var = this.a.g;
            k8l0.m(p7l0Var);
            p7l0Var.p(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                y4l0 y4l0Var = this.a.f;
                k8l0.m(y4l0Var);
                u4l0 u4l0Var = y4l0Var.i;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                u4l0Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            y4l0 y4l0Var2 = this.a.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.i.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void r(Runnable runnable) {
        i();
        t(new l7l0(this, runnable, true, "Task exception on worker thread"));
    }

    public final void s(Runnable runnable) {
        i();
        l7l0 l7l0Var = new l7l0(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f;
                linkedBlockingQueue.add(l7l0Var);
                n7l0 n7l0Var = this.d;
                if (n7l0Var == null) {
                    n7l0 n7l0Var2 = new n7l0(this, "Measurement Network", linkedBlockingQueue);
                    this.d = n7l0Var2;
                    n7l0Var2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    Object obj = n7l0Var.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(l7l0 l7l0Var) {
        synchronized (this.i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.e;
                priorityBlockingQueue.add(l7l0Var);
                n7l0 n7l0Var = this.c;
                if (n7l0Var == null) {
                    n7l0 n7l0Var2 = new n7l0(this, "Measurement Worker", priorityBlockingQueue);
                    this.c = n7l0Var2;
                    n7l0Var2.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    Object obj = n7l0Var.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
