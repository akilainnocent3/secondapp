package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qe00<K, V, T> implements Iterator<T>, dhp {
    public final dwg0<K, V, T>[] a;
    public int b;
    public boolean c;

    public qe00(cwg0<K, V> cwg0Var, dwg0<K, V, T>[] dwg0VarArr) {
        cwg0Var.getClass();
        this.a = dwg0VarArr;
        this.c = true;
        dwg0<K, V, T> dwg0Var = dwg0VarArr[0];
        Object[] objArr = cwg0Var.d;
        int iBitCount = Integer.bitCount(cwg0Var.a) * 2;
        dwg0Var.getClass();
        objArr.getClass();
        dwg0Var.a = objArr;
        dwg0Var.b = iBitCount;
        dwg0Var.c = 0;
        this.b = 0;
        b();
    }

    public final void b() {
        int i = this.b;
        dwg0<K, V, T>[] dwg0VarArr = this.a;
        dwg0<K, V, T> dwg0Var = dwg0VarArr[i];
        if (dwg0Var.c < dwg0Var.b) {
            return;
        }
        while (-1 < i) {
            int iC = c(i);
            if (iC == -1) {
                dwg0<K, V, T> dwg0Var2 = dwg0VarArr[i];
                int i2 = dwg0Var2.c;
                Object[] objArr = dwg0Var2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    dwg0Var2.c = i2 + 1;
                    iC = c(i);
                }
            }
            if (iC != -1) {
                this.b = iC;
                return;
            }
            if (i > 0) {
                dwg0<K, V, T> dwg0Var3 = dwg0VarArr[i - 1];
                int i3 = dwg0Var3.c;
                int length2 = dwg0Var3.a.length;
                dwg0Var3.c = i3 + 1;
            }
            dwg0<K, V, T> dwg0Var4 = dwg0VarArr[i];
            Object[] objArr2 = cwg0.e.d;
            dwg0Var4.getClass();
            objArr2.getClass();
            dwg0Var4.a = objArr2;
            dwg0Var4.b = 0;
            dwg0Var4.c = 0;
            i--;
        }
        this.c = false;
    }

    public final int c(int i) {
        dwg0<K, V, T>[] dwg0VarArr = this.a;
        dwg0<K, V, T> dwg0Var = dwg0VarArr[i];
        int i2 = dwg0Var.c;
        if (i2 < dwg0Var.b) {
            return i;
        }
        Object[] objArr = dwg0Var.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        cwg0 cwg0Var = (cwg0) obj;
        if (i == 6) {
            dwg0<K, V, T> dwg0Var2 = dwg0VarArr[i + 1];
            Object[] objArr2 = cwg0Var.d;
            int length2 = objArr2.length;
            dwg0Var2.getClass();
            dwg0Var2.a = objArr2;
            dwg0Var2.b = length2;
            dwg0Var2.c = 0;
        } else {
            dwg0<K, V, T> dwg0Var3 = dwg0VarArr[i + 1];
            Object[] objArr3 = cwg0Var.d;
            int iBitCount = Integer.bitCount(cwg0Var.a) * 2;
            dwg0Var3.getClass();
            objArr3.getClass();
            dwg0Var3.a = objArr3;
            dwg0Var3.b = iBitCount;
            dwg0Var3.c = 0;
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
