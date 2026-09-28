package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class hsa0 implements Iterator<Object>, dhp {
    public int a;
    public final /* synthetic */ esa0<Object> b;

    public hsa0(esa0<Object> esa0Var) {
        this.b = esa0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        this.a = i + 1;
        return this.b.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
