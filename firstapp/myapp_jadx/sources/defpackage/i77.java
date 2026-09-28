package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class i77<E> extends f580<i77<E>> {
    public final tb5<E> i;
    public final /* synthetic */ AtomicReferenceArray v;

    public i77(long j, i77<E> i77Var, tb5<E> tb5Var, int i) {
        super(j, i77Var, i);
        this.i = tb5Var;
        this.v = new AtomicReferenceArray(zb5.b * 2);
    }

    @Override // defpackage.f580
    public final int g() {
        return zb5.b;
    }

    @Override // defpackage.f580
    public final void h(int i, CoroutineContext coroutineContext) {
        tb5<E> tb5Var;
        int i2 = zb5.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.v.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof bwi0;
            tb5Var = this.i;
            if (z2 || (objL instanceof cwi0)) {
                if (k(i, objL, z ? zb5.j : zb5.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        tb5Var.getClass();
                        Function1<E, Unit> function1 = tb5Var.b;
                        if (function1 != null) {
                            lpy.a(function1, obj, coroutineContext);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (objL == zb5.j || objL == zb5.k) {
                    break;
                }
                if (objL != zb5.g && objL != zb5.f) {
                    if (objL == zb5.i || objL == zb5.d || objL == zb5.l) {
                        return;
                    }
                    ogf.a(objL, "unexpected state: ");
                    return;
                }
            }
        }
        n(i, null);
        if (z) {
            tb5Var.getClass();
            Function1<E, Unit> function2 = tb5Var.b;
            if (function2 != null) {
                lpy.a(function2, obj, coroutineContext);
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.v;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.v.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            tb5<E> tb5Var = this.i;
            tb5Var.getClass();
            tb5Var.P((this.d * ((long) zb5.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.v.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.v.set((i * 2) + 1, obj);
    }
}
