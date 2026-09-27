package cj;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class m5<T> extends w5 implements Iterator<T> {
    @Override // cj.w5
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> h2();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return h2().hasNext();
    }

    @Override // java.util.Iterator
    @qj.a
    @n9
    public T next() {
        return h2().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        h2().remove();
    }
}
