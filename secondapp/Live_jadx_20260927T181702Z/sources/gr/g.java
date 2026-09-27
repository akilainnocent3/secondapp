package gr;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g<V> extends fr.g<V> implements Collection<V>, es.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final d<?, V> f87348b;

    public g(@l d<?, V> backing) {
        m0.p(backing, "backing");
        this.f87348b = backing;
    }

    @Override // fr.g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@l Collection<? extends V> elements) {
        m0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f87348b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f87348b.containsValue(obj);
    }

    @Override // fr.g
    public int d() {
        return this.f87348b.size();
    }

    @l
    public final d<?, V> e() {
        return this.f87348b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f87348b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<V> iterator() {
        return this.f87348b.Z();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f87348b.X(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@l Collection<?> elements) {
        m0.p(elements, "elements");
        this.f87348b.p();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@l Collection<?> elements) {
        m0.p(elements, "elements");
        this.f87348b.p();
        return super.retainAll(elements);
    }
}
