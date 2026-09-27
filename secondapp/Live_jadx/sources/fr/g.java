package fr;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@dr.l1(version = "1.1")
public abstract class g<E> extends AbstractCollection<E> implements Collection<E>, es.b {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e10);

    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }
}
