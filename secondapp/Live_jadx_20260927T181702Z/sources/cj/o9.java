package cj;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@qj.f("Use Iterators.peekingIterator")
@j4
public interface o9<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @qj.a
    @n9
    E next();

    @n9
    E peek();

    @Override // java.util.Iterator
    void remove();
}
