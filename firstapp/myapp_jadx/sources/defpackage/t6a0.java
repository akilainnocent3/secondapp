package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class t6a0<T> {
    public final AtomicReference<apf0> a = new AtomicReference<>(u6a0.a);
    public final Object b = new Object();
    public T c;

    public final T a() {
        long jA = ipf0.a();
        if (jA == hpf0.a) {
            return this.c;
        }
        apf0 apf0Var = this.a.get();
        int iA = apf0Var.a(jA);
        if (iA >= 0) {
            return (T) apf0Var.c[iA];
        }
        return null;
    }

    public final void b(T t) {
        long jA = ipf0.a();
        if (jA == hpf0.a) {
            this.c = t;
            return;
        }
        synchronized (this.b) {
            apf0 apf0Var = this.a.get();
            int iA = apf0Var.a(jA);
            if (iA >= 0) {
                apf0Var.c[iA] = t;
            } else {
                this.a.set(apf0Var.b(t, jA));
                Unit unit = Unit.a;
            }
        }
    }
}
