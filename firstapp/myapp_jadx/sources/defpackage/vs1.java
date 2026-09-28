package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class vs1<T> {
    public final cdl a;
    public final cdl b;
    public final a<T> c;
    public T d;
    public T e;
    public int f;

    public interface a<T> {
        void a(T t, T t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vs1(Object obj, Looper looper, Looper looper2, fqe0 fqe0Var, a aVar) {
        this.a = fqe0Var.c(looper, null);
        this.b = fqe0Var.c(looper2, null);
        this.d = obj;
        this.e = obj;
        this.c = aVar;
    }

    public final void a(Runnable runnable) {
        cdl cdlVar = this.a;
        if (cdlVar.f().getThread().isAlive()) {
            cdlVar.i(runnable);
        }
    }

    public final void b(T t) {
        T t2 = this.d;
        this.d = t;
        if (t2.equals(t)) {
            return;
        }
        this.c.a(t2, t);
    }
}
