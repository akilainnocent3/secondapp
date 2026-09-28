package defpackage;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes8.dex */
public final class hfn<T> implements Iterator<IndexedValue<? extends T>>, dhp {
    public final Iterator<T> a;
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    public hfn(Iterator<? extends T> it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 0) {
            return new IndexedValue(i, this.a.next());
        }
        b.q();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
