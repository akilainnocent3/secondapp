package xt;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class c implements Collection<b>, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final Set<b> f145633b;

    public boolean a(@l b element) {
        m0.p(element, "element");
        return this.f145633b.contains(element);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return a((b) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> elements) {
        m0.p(elements, "elements");
        return this.f145633b.containsAll(elements);
    }

    @l
    public final Set<b> d() {
        return this.f145633b;
    }

    public int e() {
        return this.f145633b.size();
    }

    @Override // java.util.Collection
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && m0.g(this.f145633b, ((c) obj).f145633b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f145633b.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f145633b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l
    public Iterator<b> iterator() {
        return this.f145633b.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return w.a(this);
    }

    @l
    public String toString() {
        return a.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        m0.p(array, "array");
        return (T[]) w.b(this, array);
    }
}
