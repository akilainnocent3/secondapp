package fr;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@dr.l1(version = "1.1")
@kotlin.jvm.internal.s1({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n360#2,7:182\n388#2,7:189\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:182,7\n29#1:189,7\n*E\n"})
public abstract class d<E> extends fr.b<E> implements List<E>, es.a {

    @oy.l
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                return i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i12;
        }

        public final boolean f(@oy.l Collection<?> c10, @oy.l Collection<?> other) {
            kotlin.jvm.internal.m0.p(c10, "c");
            kotlin.jvm.internal.m0.p(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.m0.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(@oy.l Collection<?> c10) {
            kotlin.jvm.internal.m0.p(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Iterator<E>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f85098b;

        public b() {
        }

        public final int a() {
            return this.f85098b;
        }

        public final void b(int i10) {
            this.f85098b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f85098b < d.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            int i10 = this.f85098b;
            this.f85098b = i10 + 1;
            return dVar.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends d<E>.b implements ListIterator<E>, es.a {
        public c(int i10) {
            super();
            d.Companion.c(i10, d.this.size());
            b(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            b(a() - 1);
            return dVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: fr.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0835d<E> extends d<E> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final d<E> f85101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f85103d;

        /* JADX WARN: Multi-variable type inference failed */
        public C0835d(@oy.l d<? extends E> list, int i10, int i11) {
            kotlin.jvm.internal.m0.p(list, "list");
            this.f85101b = list;
            this.f85102c = i10;
            d.Companion.d(i10, i11, list.size());
            this.f85103d = i11 - i10;
        }

        @Override // fr.d, java.util.List
        public E get(int i10) {
            d.Companion.b(i10, this.f85103d);
            return this.f85101b.get(this.f85102c + i10);
        }

        @Override // fr.d, fr.b
        public int getSize() {
            return this.f85103d;
        }

        @Override // fr.d, java.util.List
        @oy.l
        public List<E> subList(int i10, int i11) {
            d.Companion.d(i10, i11, this.f85103d);
            d<E> dVar = this.f85101b;
            int i12 = this.f85102c;
            return new C0835d(dVar, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@oy.m Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // fr.b
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.g(this);
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m0.g(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // fr.b, java.util.Collection, java.lang.Iterable
    @oy.l
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.m0.g(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @oy.l
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @oy.l
    public List<E> subList(int i10, int i11) {
        return new C0835d(this, i10, i11);
    }

    @Override // java.util.List
    @oy.l
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }
}
