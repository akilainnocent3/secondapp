package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class rbj extends b3 {

    public static final class a<V> implements Runnable {
        public final Future<V> a;
        public final bcl0 b;

        public a(qis qisVar, bcl0 bcl0Var) {
            this.a = qisVar;
            this.b = bcl0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable thA;
            Future<V> future = this.a;
            boolean z = future instanceof vyo;
            bcl0 bcl0Var = this.b;
            if (z && (thA = ((vyo) future).a()) != null) {
                bcl0Var.a(thA);
                return;
            }
            try {
                rbj.X(future);
                nfl0 nfl0Var = bcl0Var.b;
                nfl0Var.g();
                bcl0Var.b();
                nfl0Var.i = false;
                nfl0Var.j = 1;
                y4l0 y4l0Var = nfl0Var.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.m.b(bcl0Var.a.a, "Successfully registered trigger URI");
                nfl0Var.F();
            } catch (ExecutionException e) {
                bcl0Var.a(e.getCause());
            } catch (Throwable th) {
                bcl0Var.a(th);
            }
        }

        public final String toString() {
            a5w a5wVar = new a5w(a.class.getSimpleName());
            a5w.a aVar = new a5w.a();
            a5wVar.c.b = aVar;
            a5wVar.c = aVar;
            aVar.a = this.b;
            return a5wVar.toString();
        }
    }

    public static <V> V X(Future<V> future) {
        V v;
        if (!future.isDone()) {
            ib5.a(p21.b("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
