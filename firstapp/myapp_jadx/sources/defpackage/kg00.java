package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class kg00<K, V> implements Iterator<igs<V>>, dhp {
    public Object a;
    public final Map<K, igs<V>> b;
    public int c;

    public kg00(Object obj, Map<K, igs<V>> map) {
        this.a = obj;
        this.b = map;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final igs<V> next() {
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        igs<V> igsVar = this.b.get(this.a);
        if (igsVar != null) {
            igs<V> igsVar2 = igsVar;
            this.c++;
            this.a = igsVar2.c;
            return igsVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
