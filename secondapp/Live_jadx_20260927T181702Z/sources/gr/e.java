package gr;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final d<K, V> f87346b;

    public e(@l d<K, V> backing) {
        m0.p(backing, "backing");
        this.f87346b = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l Collection<? extends Map.Entry<K, V>> elements) {
        m0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f87346b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@l Collection<?> elements) {
        m0.p(elements, "elements");
        return this.f87346b.s(elements);
    }

    @Override // fr.j
    public int d() {
        return this.f87346b.size();
    }

    @Override // gr.a
    public boolean f(@l Map.Entry<? extends K, ? extends V> element) {
        m0.p(element, "element");
        return this.f87346b.t(element);
    }

    @Override // gr.a
    public boolean g(@l Map.Entry<K, V> element) {
        m0.p(element, "element");
        return this.f87346b.T(element);
    }

    @Override // fr.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(@l Map.Entry<K, V> element) {
        m0.p(element, "element");
        throw new UnsupportedOperationException();
    }

    @l
    public final d<K, V> i() {
        return this.f87346b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f87346b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f87346b.x();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l Collection<?> elements) {
        m0.p(elements, "elements");
        this.f87346b.p();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l Collection<?> elements) {
        m0.p(elements, "elements");
        this.f87346b.p();
        return super.retainAll(elements);
    }
}
