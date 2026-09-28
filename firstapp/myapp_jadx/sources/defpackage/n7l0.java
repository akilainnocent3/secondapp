package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class n7l0 extends Thread {
    public final Object a;
    public final BlockingQueue b;
    public boolean c = false;
    public final /* synthetic */ p7l0 d;

    public n7l0(p7l0 p7l0Var, String str, BlockingQueue blockingQueue) {
        this.d = p7l0Var;
        hm20.h(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        p7l0 p7l0Var = this.d;
        synchronized (p7l0Var.i) {
            try {
                if (!this.c) {
                    p7l0Var.j.release();
                    p7l0Var.i.notifyAll();
                    if (this == p7l0Var.c) {
                        p7l0Var.c = null;
                    } else if (this == p7l0Var.d) {
                        p7l0Var.d = null;
                    } else {
                        y4l0 y4l0Var = p7l0Var.a.f;
                        k8l0.m(y4l0Var);
                        y4l0Var.f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                y4l0 y4l0Var = this.d.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                l7l0 l7l0Var = (l7l0) blockingQueue.poll();
                if (l7l0Var != null) {
                    Process.setThreadPriority(true != l7l0Var.b ? 10 : threadPriority);
                    l7l0Var.run();
                } else {
                    Object obj = this.a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                y4l0 y4l0Var2 = this.d.a.f;
                                k8l0.m(y4l0Var2);
                                y4l0Var2.i.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.d.i) {
                        if (this.b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
