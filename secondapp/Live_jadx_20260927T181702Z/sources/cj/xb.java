package cj;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class xb<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<? extends F> f24705b;

    public xb(Iterator<? extends F> backingIterator) {
        this.f24705b = (Iterator) zi.l0.E(backingIterator);
    }

    @n9
    public abstract T a(@n9 F from);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24705b.hasNext();
    }

    @Override // java.util.Iterator
    @n9
    public final T next() {
        return a(this.f24705b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f24705b.remove();
    }
}
