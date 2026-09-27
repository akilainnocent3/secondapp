package cj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class m9<T> implements Comparator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24219b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24220c = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.e
    @yi.d
    public static class a extends m9<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f24221d = new AtomicInteger(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ConcurrentMap<Object, Integer> f24222e = p9.m(new l8()).i();

        public final Integer N(Object obj) {
            Integer numPutIfAbsent;
            Integer numValueOf = this.f24222e.get(obj);
            return (numValueOf != null || (numPutIfAbsent = this.f24222e.putIfAbsent(obj, (numValueOf = Integer.valueOf(this.f24221d.getAndIncrement())))) == null) ? numValueOf : numPutIfAbsent;
        }

        public int O(Object object) {
            return System.identityHashCode(object);
        }

        @Override // cj.m9, java.util.Comparator
        public int compare(@zq.a Object left, @zq.a Object right) {
            if (left == right) {
                return 0;
            }
            if (left == null) {
                return -1;
            }
            if (right == null) {
                return 1;
            }
            int iO = O(left);
            int iO2 = O(right);
            if (iO != iO2) {
                return iO < iO2 ? -1 : 1;
            }
            int iCompareTo = N(left).compareTo(N(right));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.d
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m9<Object> f24223a = new a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends ClassCastException {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f24224c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f24225b;

        public c(Object value) {
            super("Cannot compare value: " + value);
            this.f24225b = value;
        }
    }

    @yi.b(serializable = true)
    public static <C extends Comparable> m9<C> E() {
        return f9.f23759f;
    }

    @yi.b(serializable = true)
    public static m9<Object> M() {
        return jc.f24021d;
    }

    @yi.b(serializable = true)
    public static m9<Object> d() {
        return r.f24457d;
    }

    @yi.d
    public static m9<Object> g() {
        return b.f24223a;
    }

    @yi.b(serializable = true)
    public static <T> m9<T> i(Iterable<? extends Comparator<? super T>> comparators) {
        return new x3(comparators);
    }

    @yi.b(serializable = true)
    public static <T> m9<T> k(T leastValue, T... remainingValuesInOrder) {
        return l(j8.c(leastValue, remainingValuesInOrder));
    }

    @yi.b(serializable = true)
    public static <T> m9<T> l(List<T> valuesInOrder) {
        return new r4(valuesInOrder);
    }

    @yi.b(serializable = true)
    @Deprecated
    public static <T> m9<T> m(m9<T> ordering) {
        return (m9) zi.l0.E(ordering);
    }

    @yi.b(serializable = true)
    public static <T> m9<T> n(Comparator<T> comparator) {
        return comparator instanceof m9 ? (m9) comparator : new q3(comparator);
    }

    @n9
    public <E extends T> E A(Iterable<E> iterable) {
        return (E) D(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n9
    public <E extends T> E B(@n9 E a10, @n9 E b10) {
        return compare(a10, b10) <= 0 ? a10 : b10;
    }

    @n9
    public <E extends T> E C(@n9 E e10, @n9 E e11, @n9 E e12, E... eArr) {
        E e13 = (E) B(B(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) B(e13, e14);
        }
        return e13;
    }

    @n9
    public <E extends T> E D(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) B(next, it.next());
        }
        return next;
    }

    @yi.b(serializable = true)
    public <S extends T> m9<S> G() {
        return new h9(this);
    }

    @yi.b(serializable = true)
    public <S extends T> m9<S> H() {
        return new i9(this);
    }

    public <T2 extends T> m9<Map.Entry<T2, ?>> I() {
        return (m9<Map.Entry<T2, ?>>) J(n8.R());
    }

    @yi.b(serializable = true)
    public <F> m9<F> J(zi.t<F, ? extends T> function) {
        return new z(function, this);
    }

    @yi.b(serializable = true)
    public <S extends T> m9<S> K() {
        return new ha(this);
    }

    public <E extends T> List<E> L(Iterable<E> elements) {
        Object[] objArrP = z7.P(elements);
        Arrays.sort(objArrP, this);
        return j8.r(Arrays.asList(objArrP));
    }

    @Override // java.util.Comparator
    public abstract int compare(@n9 T left, @n9 T right);

    @Deprecated
    public int h(List<? extends T> sortedList, @n9 T key) {
        return Collections.binarySearch(sortedList, key, this);
    }

    @yi.b(serializable = true)
    public <U extends T> m9<U> j(Comparator<? super U> secondaryComparator) {
        return new x3(this, (Comparator) zi.l0.E(secondaryComparator));
    }

    public <E extends T> List<E> o(Iterable<E> iterable, int k10) {
        return K().t(iterable, k10);
    }

    public <E extends T> List<E> p(Iterator<E> iterator, int k10) {
        return K().u(iterator, k10);
    }

    public <E extends T> v6<E> q(Iterable<E> elements) {
        return v6.R(this, elements);
    }

    public boolean r(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean s(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> t(Iterable<E> iterable, int k10) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) k10) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > k10) {
                    array = Arrays.copyOf(array, k10);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return u(iterable.iterator(), k10);
    }

    public <E extends T> List<E> u(Iterator<E> iterator, int k10) {
        zi.l0.E(iterator);
        j3.b(k10, "k");
        if (k10 == 0 || !iterator.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (k10 < 1073741823) {
            wb wbVarE = wb.e(k10, this);
            wbVarE.h(iterator);
            return wbVarE.k();
        }
        ArrayList arrayListS = j8.s(iterator);
        Collections.sort(arrayListS, this);
        if (arrayListS.size() > k10) {
            arrayListS.subList(k10, arrayListS.size()).clear();
        }
        arrayListS.trimToSize();
        return Collections.unmodifiableList(arrayListS);
    }

    @yi.b(serializable = true)
    public <S extends T> m9<Iterable<S>> v() {
        return new c8(this);
    }

    @n9
    public <E extends T> E w(Iterable<E> iterable) {
        return (E) z(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n9
    public <E extends T> E x(@n9 E a10, @n9 E b10) {
        return compare(a10, b10) >= 0 ? a10 : b10;
    }

    @n9
    public <E extends T> E y(@n9 E e10, @n9 E e11, @n9 E e12, E... eArr) {
        E e13 = (E) x(x(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) x(e13, e14);
        }
        return e13;
    }

    @n9
    public <E extends T> E z(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) x(next, it.next());
        }
        return next;
    }
}
