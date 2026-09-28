package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class dfn<T> implements Iterator<T>, dhp {
    public int a;
    public int b;
    public boolean c;

    public dfn(int i) {
        this.a = i;
    }

    public abstract T b(int i);

    public abstract void c(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        T tB = b(this.b);
        this.b++;
        this.c = true;
        return tB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            ib5.a("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        c(i);
        this.a--;
        this.c = false;
    }
}
