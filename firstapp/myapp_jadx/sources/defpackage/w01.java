package defpackage;

import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class w01<D> extends oxs<D> {
    public Executor f;
    public volatile w01<D>.a g;
    public volatile w01<D>.a h;

    public final class a extends m2w<D> implements Runnable {
        public a() {
        }

        @Override // defpackage.m2w
        public final void a() {
            w01.this.b();
        }

        @Override // defpackage.m2w
        public final void b(D d) {
            w01 w01Var = w01.this;
            if (w01Var.h == this) {
                SystemClock.uptimeMillis();
                w01Var.h = null;
                w01Var.a();
            }
        }

        @Override // defpackage.m2w
        public final void c(D d) {
            w01 w01Var = w01.this;
            if (w01Var.g != this) {
                if (w01Var.h == this) {
                    SystemClock.uptimeMillis();
                    w01Var.h = null;
                    w01Var.a();
                    return;
                }
                return;
            }
            if (w01Var.c) {
                return;
            }
            SystemClock.uptimeMillis();
            w01Var.g = null;
            qxs.a aVar = w01Var.a;
            if (aVar != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aVar.m(d);
                } else {
                    aVar.j(d);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            w01.this.a();
        }
    }

    public final void a() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        w01<D>.a aVar = this.g;
        Executor executor = this.f;
        if (aVar.b == m2w.d.a) {
            aVar.b = m2w.d.b;
            executor.execute(aVar.a);
            return;
        }
        int iOrdinal = aVar.b.ordinal();
        if (iOrdinal == 1) {
            ib5.a("Cannot execute task: the task is already running.");
        } else if (iOrdinal != 2) {
            ib5.a("We should never reach this state");
        } else {
            ib5.a("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public abstract void b();

    public final boolean c() {
        if (this.g == null) {
            return false;
        }
        boolean z = this.b;
        if (!z) {
            if (z) {
                d();
            } else {
                this.e = true;
            }
        }
        w01<D>.a aVar = this.h;
        w01<D>.a aVar2 = this.g;
        if (aVar != null) {
            aVar2.getClass();
            this.g = null;
            return false;
        }
        aVar2.getClass();
        w01<D>.a aVar3 = this.g;
        aVar3.c.set(true);
        boolean zCancel = aVar3.a.cancel(false);
        if (zCancel) {
            this.h = this.g;
        }
        this.g = null;
        return zCancel;
    }

    public final void d() {
        c();
        this.g = new a();
        a();
    }
}
