package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class re00<K, V, T> implements Iterator<T>, dhp {
    public final ewg0<K, V, T>[] a;
    public int b;
    public boolean c = true;

    public re00(bwg0<K, V> bwg0Var, ewg0<K, V, T>[] ewg0VarArr) {
        this.a = ewg0VarArr;
        ewg0VarArr[0].b(Integer.bitCount(bwg0Var.a) * 2, 0, bwg0Var.d);
        this.b = 0;
        b();
    }

    public final void b() {
        int i = this.b;
        ewg0<K, V, T>[] ewg0VarArr = this.a;
        ewg0<K, V, T> ewg0Var = ewg0VarArr[i];
        if (ewg0Var.c < ewg0Var.b) {
            return;
        }
        while (-1 < i) {
            int iC = c(i);
            if (iC == -1) {
                ewg0<K, V, T> ewg0Var2 = ewg0VarArr[i];
                int i2 = ewg0Var2.c;
                Object[] objArr = ewg0Var2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    ewg0Var2.c = i2 + 1;
                    iC = c(i);
                }
            }
            if (iC != -1) {
                this.b = iC;
                return;
            }
            if (i > 0) {
                ewg0<K, V, T> ewg0Var3 = ewg0VarArr[i - 1];
                int i3 = ewg0Var3.c;
                int length2 = ewg0Var3.a.length;
                ewg0Var3.c = i3 + 1;
            }
            ewg0VarArr[i].b(0, 0, bwg0.e.d);
            i--;
        }
        this.c = false;
    }

    public final int c(int i) {
        ewg0<K, V, T>[] ewg0VarArr = this.a;
        ewg0<K, V, T> ewg0Var = ewg0VarArr[i];
        int i2 = ewg0Var.c;
        if (i2 < ewg0Var.b) {
            return i;
        }
        Object[] objArr = ewg0Var.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        bwg0 bwg0Var = (bwg0) obj;
        if (i == 6) {
            ewg0<K, V, T> ewg0Var2 = ewg0VarArr[i + 1];
            Object[] objArr2 = bwg0Var.d;
            ewg0Var2.b(objArr2.length, 0, objArr2);
        } else {
            ewg0VarArr[i + 1].b(Integer.bitCount(bwg0Var.a) * 2, 0, bwg0Var.d);
        }
        return c(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.c) {
            lrh0.a();
            return null;
        }
        T next = this.a[this.b].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
