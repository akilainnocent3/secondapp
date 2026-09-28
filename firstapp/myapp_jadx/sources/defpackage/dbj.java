package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class dbj<V> implements qis<V> {
    public final qis<V> a;
    public final nv5.a<V> b;

    public class a implements nv5.c<V> {
    }

    public dbj() {
        nv5.a<V> aVar = new nv5.a<>();
        nv5.d dVar = new nv5.d(aVar);
        aVar.b = dVar;
        aVar.a = a.class;
        try {
            km20.g("The result can only set once!", this.b == null);
            this.b = aVar;
            aVar.a = "FutureChain[" + this + "]";
        } catch (Exception e) {
            dVar.a(e);
        }
        this.a = dVar;
    }

    public static <V> dbj<V> a(qis<V> qisVar) {
        return qisVar instanceof dbj ? (dbj) qisVar : new dbj<>(qisVar);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.qis
    public final void k(Runnable runnable, Executor executor) {
        this.a.k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public dbj(qis<V> qisVar) {
        qisVar.getClass();
        this.a = qisVar;
    }
}
