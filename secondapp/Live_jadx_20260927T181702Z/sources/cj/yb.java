package cj;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class yb<F, T> extends xb<F, T> implements ListIterator<T> {
    public yb(ListIterator<? extends F> backingIterator) {
        super(backingIterator);
    }

    @Override // java.util.ListIterator
    public void add(@n9 T element) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<? extends F> b() {
        return (ListIterator) this.f24705b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    @n9
    public final T previous() {
        return a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    public void set(@n9 T element) {
        throw new UnsupportedOperationException();
    }
}
