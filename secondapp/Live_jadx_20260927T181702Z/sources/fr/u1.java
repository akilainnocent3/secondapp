package fr;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class u1<T> extends d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<T> f85159b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements ListIterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListIterator<T> f85160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u1<T> f85161c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(u1<? extends T> u1Var, int i10) {
            this.f85161c = u1Var;
            this.f85160b = u1Var.f85159b.listIterator(n0.g1(u1Var, i10));
        }

        public final ListIterator<T> a() {
            return this.f85160b;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f85160b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f85160b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f85160b.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return n0.f1(this.f85161c, this.f85160b.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f85160b.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return n0.f1(this.f85161c, this.f85160b.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u1(@oy.l List<? extends T> delegate) {
        kotlin.jvm.internal.m0.p(delegate, "delegate");
        this.f85159b = delegate;
    }

    @Override // fr.d, java.util.List
    public T get(int i10) {
        return this.f85159b.get(n0.e1(this, i10));
    }

    @Override // fr.d, fr.b
    public int getSize() {
        return this.f85159b.size();
    }

    @Override // fr.d, fr.b, java.util.Collection, java.lang.Iterable
    @oy.l
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // fr.d, java.util.List
    @oy.l
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // fr.d, java.util.List
    @oy.l
    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
