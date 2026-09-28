package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class vg00<E> implements Iterator<E>, dhp {
    public Object a;
    public final Map<E, kgs> b;
    public int c;

    public vg00(Object obj, Map<E, kgs> map) {
        this.a = obj;
        this.b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        E e = (E) this.a;
        this.c++;
        kgs kgsVar = this.b.get(e);
        if (kgsVar == null) {
            throw new ConcurrentModificationException(aya.b(e, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.a = kgsVar.b;
        return e;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
