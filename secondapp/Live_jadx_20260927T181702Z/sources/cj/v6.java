package cj;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true, serializable = true)
@j4
public abstract class v6<E> extends r6<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hc<Object> f24591e = new b(y9.f24721i, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f24592f = -889275714;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<E> extends r6.a<E> {
        public a() {
            this(4);
        }

        @Override // cj.r6.a
        @qj.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<E> g(E element) {
            super.g(element);
            return this;
        }

        @Override // cj.r6.a, cj.r6.b
        @qj.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<E> b(E... elements) {
            super.b(elements);
            return this;
        }

        @Override // cj.r6.a, cj.r6.b
        @qj.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> c(Iterable<? extends E> elements) {
            super.c(elements);
            return this;
        }

        @Override // cj.r6.b
        @qj.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<E> d(Iterator<? extends E> elements) {
            super.d(elements);
            return this;
        }

        @Override // cj.r6.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public v6<E> e() {
            this.f24468d = true;
            return v6.p(this.f24466b, this.f24467c);
        }

        public v6<E> o(Comparator<? super E> comparator) {
            this.f24468d = true;
            Arrays.sort(this.f24466b, 0, this.f24467c, comparator);
            return v6.p(this.f24466b, this.f24467c);
        }

        @qj.a
        public a<E> p(a<E> other) {
            h(other.f24466b, other.f24467c);
            return this;
        }

        public a(int capacity) {
            super(capacity);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<E> extends cj.b<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v6<E> f24593d;

        public b(v6<E> list, int index) {
            super(list.size(), index);
            this.f24593d = list;
        }

        @Override // cj.b
        public E a(int index) {
            return this.f24593d.get(index);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c<E> extends v6<E> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final transient v6<E> f24594g;

        public c(v6<E> backingList) {
            this.f24594g = backingList;
        }

        @Override // cj.v6
        public v6<E> P() {
            return this.f24594g;
        }

        @Override // cj.v6, java.util.List
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public v6<E> subList(int fromIndex, int toIndex) {
            zi.l0.f0(fromIndex, toIndex, size());
            return this.f24594g.subList(W(toIndex), W(fromIndex)).P();
        }

        public final int V(int index) {
            return (size() - 1) - index;
        }

        public final int W(int index) {
            return size() - index;
        }

        @Override // cj.v6, cj.r6, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zq.a Object object) {
            return this.f24594g.contains(object);
        }

        @Override // java.util.List
        public E get(int index) {
            zi.l0.C(index, size());
            return this.f24594g.get(V(index));
        }

        @Override // cj.v6, java.util.List
        public int indexOf(@zq.a Object object) {
            int iLastIndexOf = this.f24594g.lastIndexOf(object);
            if (iLastIndexOf >= 0) {
                return V(iLastIndexOf);
            }
            return -1;
        }

        @Override // cj.v6, cj.r6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // cj.r6
        public boolean j() {
            return this.f24594g.j();
        }

        @Override // cj.v6, java.util.List
        public int lastIndexOf(@zq.a Object object) {
            int iIndexOf = this.f24594g.indexOf(object);
            if (iIndexOf >= 0) {
                return V(iIndexOf);
            }
            return -1;
        }

        @Override // cj.v6, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // cj.v6, cj.r6
        @yi.c
        @yi.d
        public Object n() {
            return super.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f24594g.size();
        }

        @Override // cj.v6, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.d
    public static class d implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f24595c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f24596b;

        public d(Object[] elements) {
            this.f24596b = elements;
        }

        public Object d() {
            return v6.w(this.f24596b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends v6<E> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final transient int f24597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final transient int f24598h;

        public e(int offset, int length) {
            this.f24597g = offset;
            this.f24598h = length;
        }

        @Override // cj.v6, java.util.List
        /* JADX INFO: renamed from: S */
        public v6<E> subList(int fromIndex, int toIndex) {
            zi.l0.f0(fromIndex, toIndex, this.f24598h);
            v6 v6Var = v6.this;
            int i10 = this.f24597g;
            return v6Var.subList(fromIndex + i10, toIndex + i10);
        }

        @Override // cj.r6
        @zq.a
        public Object[] g() {
            return v6.this.g();
        }

        @Override // java.util.List
        public E get(int index) {
            zi.l0.C(index, this.f24598h);
            return v6.this.get(index + this.f24597g);
        }

        @Override // cj.r6
        public int h() {
            return v6.this.i() + this.f24597g + this.f24598h;
        }

        @Override // cj.r6
        public int i() {
            return v6.this.i() + this.f24597g;
        }

        @Override // cj.v6, cj.r6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // cj.r6
        public boolean j() {
            return true;
        }

        @Override // cj.v6, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // cj.v6, cj.r6
        @yi.c
        @yi.d
        public Object n() {
            return super.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f24598h;
        }

        @Override // cj.v6, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
            return super.listIterator(index);
        }
    }

    public static <E> v6<E> A(E e10) {
        return s(e10);
    }

    public static <E> v6<E> B(E e10, E e11) {
        return s(e10, e11);
    }

    public static <E> v6<E> C(E e10, E e11, E e12) {
        return s(e10, e11, e12);
    }

    public static <E> v6<E> D(E e10, E e11, E e12, E e13) {
        return s(e10, e11, e12, e13);
    }

    public static <E> v6<E> E(E e10, E e11, E e12, E e13, E e14) {
        return s(e10, e11, e12, e13, e14);
    }

    public static <E> v6<E> G(E e10, E e11, E e12, E e13, E e14, E e15) {
        return s(e10, e11, e12, e13, e14, e15);
    }

    public static <E> v6<E> H(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return s(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> v6<E> J(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return s(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> v6<E> K(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        return s(e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }

    public static <E> v6<E> L(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19) {
        return s(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }

    public static <E> v6<E> M(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e110) {
        return s(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e110);
    }

    @SafeVarargs
    public static <E> v6<E> N(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e110, E e111, E... others) {
        zi.l0.e(others.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[others.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e110;
        objArr[11] = e111;
        System.arraycopy(others, 0, objArr, 12, others.length);
        return s(objArr);
    }

    public static <E extends Comparable<? super E>> v6<E> Q(Iterable<? extends E> elements) {
        Comparable[] comparableArr = (Comparable[]) z7.R(elements, new Comparable[0]);
        j9.b(comparableArr);
        Arrays.sort(comparableArr);
        return o(comparableArr);
    }

    public static <E> v6<E> R(Comparator<? super E> comparator, Iterable<? extends E> elements) {
        zi.l0.E(comparator);
        Object[] objArrP = z7.P(elements);
        j9.b(objArrP);
        Arrays.sort(objArrP, comparator);
        return o(objArrP);
    }

    @n6
    public static <E> Collector<E, ?, v6<E>> U() {
        return h3.L();
    }

    @yi.d
    private void m(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> v6<E> o(Object[] elements) {
        return p(elements, elements.length);
    }

    public static <E> v6<E> p(Object[] elements, int length) {
        return length == 0 ? z() : new y9(elements, length);
    }

    public static <E> a<E> q() {
        return new a<>();
    }

    public static <E> a<E> r(int expectedSize) {
        j3.b(expectedSize, "expectedSize");
        return new a<>(expectedSize);
    }

    public static <E> v6<E> s(Object... elements) {
        return o(j9.b(elements));
    }

    public static <E> v6<E> t(Iterable<? extends E> elements) {
        zi.l0.E(elements);
        return elements instanceof Collection ? u((Collection) elements) : v(elements.iterator());
    }

    public static <E> v6<E> u(Collection<? extends E> elements) {
        if (!(elements instanceof r6)) {
            return s(elements.toArray());
        }
        v6<E> v6VarD = ((r6) elements).d();
        return v6VarD.j() ? o(v6VarD.toArray()) : v6VarD;
    }

    public static <E> v6<E> v(Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return z();
        }
        E next = elements.next();
        return !elements.hasNext() ? A(next) : new a().g(next).d(elements).e();
    }

    public static <E> v6<E> w(E[] elements) {
        return elements.length == 0 ? z() : s((Object[]) elements.clone());
    }

    public static <E> v6<E> z() {
        return (v6<E>) y9.f24721i;
    }

    public v6<E> P() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: S */
    public v6<E> subList(int fromIndex, int toIndex) {
        zi.l0.f0(fromIndex, toIndex, size());
        int i10 = toIndex - fromIndex;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? z() : T(fromIndex, toIndex);
    }

    public v6<E> T(int fromIndex, int toIndex) {
        return new e(fromIndex, toIndex - fromIndex);
    }

    @Override // java.util.List
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    @Override // cj.r6, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zq.a Object object) {
        return indexOf(object) >= 0;
    }

    @Override // cj.r6
    public int e(Object[] dst, int offset) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            dst[offset + i10] = get(i10);
        }
        return offset + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@zq.a Object obj) {
        return j8.j(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    public int indexOf(@zq.a Object object) {
        if (object == null) {
            return -1;
        }
        return j8.l(this, object);
    }

    @Override // cj.r6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: l */
    public gc<E> iterator() {
        return listIterator();
    }

    public int lastIndexOf(@zq.a Object object) {
        if (object == null) {
            return -1;
        }
        return j8.n(this, object);
    }

    @Override // cj.r6
    @yi.c
    @yi.d
    public Object n() {
        return new d(toArray());
    }

    @Override // java.util.List
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @qj.e("Always throws UnsupportedOperationException")
    @Deprecated
    @qj.a
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public hc<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public hc<E> listIterator(int i10) {
        zi.l0.d0(i10, size());
        return isEmpty() ? (hc<E>) f24591e : new b(this, i10);
    }

    @Override // cj.r6
    @qj.m(replacement = "this")
    @Deprecated
    public final v6<E> d() {
        return this;
    }
}
