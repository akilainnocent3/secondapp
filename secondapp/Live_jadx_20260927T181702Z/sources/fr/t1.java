package fr;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class t1<T> extends h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<T> f85153b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements ListIterator<T>, es.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListIterator<T> f85154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t1<T> f85155c;

        public a(t1<T> t1Var, int i10) {
            this.f85155c = t1Var;
            this.f85154b = t1Var.f85153b.listIterator(n0.g1(t1Var, i10));
        }

        public final ListIterator<T> a() {
            return this.f85154b;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.f85154b.add(t10);
            this.f85154b.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f85154b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f85154b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f85154b.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return n0.f1(this.f85155c, this.f85154b.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f85154b.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return n0.f1(this.f85155c, this.f85154b.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f85154b.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f85154b.set(t10);
        }
    }

    public t1(@oy.l List<T> delegate) {
        kotlin.jvm.internal.m0.p(delegate, "delegate");
        this.f85153b = delegate;
    }

    @Override // fr.h, java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        this.f85153b.add(n0.g1(this, i10), t10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f85153b.clear();
    }

    @Override // fr.h
    public int d() {
        return this.f85153b.size();
    }

    @Override // fr.h
    public T e(int i10) {
        return this.f85153b.remove(n0.e1(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f85153b.get(n0.e1(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @oy.l
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @oy.l
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // fr.h, java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        return this.f85153b.set(n0.e1(this, i10), t10);
    }

    @Override // java.util.AbstractList, java.util.List
    @oy.l
    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
