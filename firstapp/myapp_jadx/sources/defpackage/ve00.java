package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class ve00<K, V, T> extends re00<K, V, T> {
    public final te00<K, V> d;
    public K e;
    public boolean f;
    public int i;

    public ve00(te00<K, V> te00Var, ewg0<K, V, T>[] ewg0VarArr) {
        super(te00Var.c, ewg0VarArr);
        this.d = te00Var;
        this.i = te00Var.e;
    }

    public final void d(int i, bwg0<?, ?> bwg0Var, K k, int i2) {
        int i3 = i2 * 5;
        ewg0<K, V, T>[] ewg0VarArr = this.a;
        if (i3 <= 30) {
            int iA = 1 << jwg0.a(i, i3);
            if (bwg0Var.h(iA)) {
                ewg0VarArr[i2].b(Integer.bitCount(bwg0Var.a) * 2, bwg0Var.f(iA), bwg0Var.d);
                this.b = i2;
                return;
            }
            int iT = bwg0Var.t(iA);
            bwg0<?, ?> bwg0VarS = bwg0Var.s(iT);
            ewg0VarArr[i2].b(Integer.bitCount(bwg0Var.a) * 2, iT, bwg0Var.d);
            d(i, bwg0VarS, k, i2 + 1);
            return;
        }
        ewg0<K, V, T> ewg0Var = ewg0VarArr[i2];
        Object[] objArr = bwg0Var.d;
        ewg0Var.b(objArr.length, 0, objArr);
        while (true) {
            ewg0<K, V, T> ewg0Var2 = ewg0VarArr[i2];
            if (Intrinsics.g(ewg0Var2.a[ewg0Var2.c], k)) {
                this.b = i2;
                return;
            } else {
                ewg0VarArr[i2].c += 2;
            }
        }
    }

    @Override // defpackage.re00, java.util.Iterator
    public final T next() {
        if (this.d.e != this.i) {
            sx0.a();
            return null;
        }
        if (!this.c) {
            lrh0.a();
            return null;
        }
        ewg0<K, V, T> ewg0Var = this.a[this.b];
        this.e = (K) ewg0Var.a[ewg0Var.c];
        this.f = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.re00, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            fm20.a();
            return;
        }
        boolean z = this.c;
        te00<K, V> te00Var = this.d;
        if (!z) {
            y8h0.c(te00Var).remove(this.e);
        } else {
            if (!z) {
                lrh0.a();
                return;
            }
            ewg0<K, V, T> ewg0Var = this.a[this.b];
            Object obj = ewg0Var.a[ewg0Var.c];
            y8h0.c(te00Var).remove(this.e);
            d(obj != null ? obj.hashCode() : 0, te00Var.c, obj, 0);
        }
        this.e = null;
        this.f = false;
        this.i = te00Var.e;
    }
}
