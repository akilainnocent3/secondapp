package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<E> extends AbstractList<E> implements t1.l<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9639c = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9640b;

    public c() {
        this(true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        d();
        return super.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> c10) {
        d();
        return super.addAll(c10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        super.clear();
    }

    public void d() {
        if (!this.f9640b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (o10 == this) {
            return true;
        }
        if (!(o10 instanceof List)) {
            return false;
        }
        if (!(o10 instanceof RandomAccess)) {
            return super.equals(o10);
        }
        List list = (List) o10;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l
    public boolean isModifiable() {
        return this.f9640b;
    }

    @Override // androidx.datastore.preferences.protobuf.t1.l
    public final void makeImmutable() {
        if (this.f9640b) {
            this.f9640b = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        d();
        return (E) super.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> c10) {
        d();
        return super.removeAll(c10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> c10) {
        d();
        return super.retainAll(c10);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        d();
        return (E) super.set(i10, e10);
    }

    public c(boolean isMutable) {
        this.f9640b = isMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        d();
        super.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> c10) {
        d();
        return super.addAll(index, c10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object o10) {
        d();
        int iIndexOf = indexOf(o10);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
