package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class obj {

    public static final class b<V> implements Runnable {
        public final Future<V> a;
        public final cbj<? super V> b;

        public b(qis qisVar, cbj cbjVar) {
            this.a = qisVar;
            this.b = cbjVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            cbj<? super V> cbjVar = this.b;
            try {
                cbjVar.onSuccess((Object) obj.a(this.a));
            } catch (Error e) {
                e = e;
                cbjVar.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                cbjVar.onFailure(e);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    cbjVar.onFailure(e3);
                } else {
                    cbjVar.onFailure(cause);
                }
            }
        }

        public final String toString() {
            return b.class.getSimpleName() + "," + this.b;
        }
    }

    public static <V> V a(Future<V> future) {
        km20.g("Future was expected to be done, " + future, future.isDone());
        return (V) b(future);
    }

    public static <V> V b(Future<V> future) {
        V v;
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

    public static fcn.c c(Object obj) {
        return obj == null ? fcn.c.b : new fcn.c(obj);
    }

    public static <V> qis<V> d(qis<V> qisVar) {
        qisVar.getClass();
        if (qisVar.isDone()) {
            return qisVar;
        }
        nv5.a aVar = new nv5.a();
        nv5.d dVar = new nv5.d(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            f(false, qisVar, aVar, nqe.a());
            aVar.a = "nonCancellationPropagating[" + qisVar + "]";
        } catch (Exception e) {
            dVar.a(e);
        }
        return dVar;
    }

    public static <V> void e(qis<V> qisVar, nv5.a<V> aVar) {
        f(true, qisVar, aVar, nqe.a());
    }

    public static void f(boolean z, qis qisVar, nv5.a aVar, nqe nqeVar) {
        qisVar.getClass();
        aVar.getClass();
        nqeVar.getClass();
        qisVar.k(new b(qisVar, new pbj(aVar)), nqeVar);
        if (z) {
            aVar.a(new qbj(qisVar), nqe.a());
        }
    }

    public static pw6 g(qis qisVar, wz0 wz0Var, Executor executor) {
        pw6 pw6Var = new pw6(wz0Var, qisVar);
        qisVar.k(pw6Var, executor);
        return pw6Var;
    }

    public static nv5.d h(qis qisVar) {
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            qisVar.k(new Runnable() { // from class: mbj
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.b(null);
                }
            }, nqe.a());
            aVar.a = "transformVoidFuture [" + qisVar + "]";
            return dVar;
        } catch (Exception e) {
            dVar.a(e);
            return dVar;
        }
    }

    public class a implements oaj<Object, Object> {
        @Override // defpackage.oaj
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
