package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class dg00<K, V> implements Iterator<igs<V>>, dhp {
    public Object a;
    public final yf00<K, V> b;
    public Object c = g6g.a;
    public boolean d;
    public int e;
    public int f;

    public dg00(Object obj, yf00<K, V> yf00Var) {
        this.a = obj;
        this.b = yf00Var;
        this.e = yf00Var.d.e;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final igs<V> next() {
        se00<K, igs<V>> se00Var = this.b.d;
        if (se00Var.e != this.e) {
            sx0.a();
            return null;
        }
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        Object obj = this.a;
        this.c = obj;
        this.d = true;
        this.f++;
        igs<V> igsVar = se00Var.get(obj);
        if (igsVar != null) {
            igs<V> igsVar2 = igsVar;
            this.a = igsVar2.c;
            return igsVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.b.d.d();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            fm20.a();
            return;
        }
        Object obj = this.c;
        yf00<K, V> yf00Var = this.b;
        y8h0.c(yf00Var).remove(obj);
        this.c = null;
        this.d = false;
        this.e = yf00Var.d.e;
        this.f--;
    }
}
