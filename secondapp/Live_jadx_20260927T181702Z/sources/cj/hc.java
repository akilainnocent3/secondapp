package cj;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class hc<E> extends gc<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(@n9 E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(@n9 E e10) {
        throw new UnsupportedOperationException();
    }
}
