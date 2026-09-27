package gr;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j<E> extends fr.j<E> implements Set<E>, Serializable, es.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final a f87358c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final j f87359d = new j(d.f87320o.e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final d<E, ?> f87360b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    public j(@l d<E, ?> backing) {
        m0.p(backing, "backing");
        this.f87360b = backing;
    }

    private final void h(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object i() throws NotSerializableException {
        if (this.f87360b.K()) {
            return new h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // fr.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        return this.f87360b.l(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l Collection<? extends E> elements) {
        m0.p(elements, "elements");
        this.f87360b.p();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f87360b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f87360b.containsKey(obj);
    }

    @Override // fr.j
    public int d() {
        return this.f87360b.size();
    }

    @l
    public final Set<E> g() {
        this.f87360b.n();
        return size() > 0 ? this : f87359d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f87360b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<E> iterator() {
        return this.f87360b.L();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f87360b.W(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l Collection<?> elements) {
        m0.p(elements, "elements");
        this.f87360b.p();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l Collection<?> elements) {
        m0.p(elements, "elements");
        this.f87360b.p();
        return super.retainAll(elements);
    }

    public j() {
        this(new d());
    }

    public j(int i10) {
        this(new d(i10));
    }
}
