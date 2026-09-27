package fr;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class m0 extends l0 {
    @ur.f
    public static final <T> void A0(Collection<? super T> collection, zu.m<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        L0(collection, elements);
    }

    @ur.f
    public static final <T> void B0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        M0(collection, elements);
    }

    @ur.f
    public static final <T> void C0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        s0(collection, elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ur.f
    public static final <T> void D0(Collection<? super T> collection, T t10) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        collection.add(t10);
    }

    @ur.f
    public static final <T> void E0(Collection<? super T> collection, zu.m<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        t0(collection, elements);
    }

    @ur.f
    public static final <T> void F0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        u0(collection, elements);
    }

    @ur.f
    @dr.o(level = dr.q.ERROR, message = "Use removeAt(index) instead.", replaceWith = @dr.g1(expression = "removeAt(index)", imports = {}))
    public static final <T> T G0(List<T> list, int i10) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        return list.remove(i10);
    }

    @ur.f
    public static final <T> boolean H0(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        return kotlin.jvm.internal.v1.a(collection).remove(t10);
    }

    public static <T> boolean I0(@oy.l Iterable<? extends T> iterable, @oy.l ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        return w0(iterable, predicate, true);
    }

    public static final <T> boolean J0(@oy.l Collection<? super T> collection, @oy.l Iterable<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return collection.removeAll(v0(elements));
    }

    @ur.f
    public static final <T> boolean K0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return kotlin.jvm.internal.v1.a(collection).removeAll(elements);
    }

    public static final <T> boolean L0(@oy.l Collection<? super T> collection, @oy.l zu.m<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        List listI3 = zu.k0.I3(elements);
        return !listI3.isEmpty() && collection.removeAll(listI3);
    }

    public static final <T> boolean M0(@oy.l Collection<? super T> collection, @oy.l T[] elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(q.t(elements));
    }

    public static <T> boolean N0(@oy.l List<T> list, @oy.l ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        return x0(list, predicate, true);
    }

    @dr.l1(version = sc.k.f129877g)
    public static <T> T O0(@oy.l List<T> list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @dr.l1(version = sc.k.f129877g)
    @oy.m
    public static <T> T P0(@oy.l List<T> list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @dr.l1(version = sc.k.f129877g)
    public static <T> T Q0(@oy.l List<T> list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(h0.L(list));
    }

    @dr.l1(version = sc.k.f129877g)
    @oy.m
    public static <T> T R0(@oy.l List<T> list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(h0.L(list));
    }

    public static <T> boolean S0(@oy.l Iterable<? extends T> iterable, @oy.l ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        return w0(iterable, predicate, false);
    }

    public static final <T> boolean T0(@oy.l Collection<? super T> collection, @oy.l Iterable<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return collection.retainAll(v0(elements));
    }

    @ur.f
    public static final <T> boolean U0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return kotlin.jvm.internal.v1.a(collection).retainAll(elements);
    }

    public static final <T> boolean V0(@oy.l Collection<? super T> collection, @oy.l zu.m<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        List listI3 = zu.k0.I3(elements);
        return !listI3.isEmpty() ? collection.retainAll(listI3) : Y0(collection);
    }

    public static final <T> boolean W0(@oy.l Collection<? super T> collection, @oy.l T[] elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return !(elements.length == 0) ? collection.retainAll(q.t(elements)) : Y0(collection);
    }

    public static final <T> boolean X0(@oy.l List<T> list, @oy.l ds.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        kotlin.jvm.internal.m0.p(predicate, "predicate");
        return x0(list, predicate, false);
    }

    public static final boolean Y0(Collection<?> collection) {
        boolean z10 = !collection.isEmpty();
        collection.clear();
        return z10;
    }

    public static <T> boolean s0(@oy.l Collection<? super T> collection, @oy.l Iterable<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean t0(@oy.l Collection<? super T> collection, @oy.l zu.m<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean u0(@oy.l Collection<? super T> collection, @oy.l T[] elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return collection.addAll(q.t(elements));
    }

    @oy.l
    public static <T> Collection<T> v0(@oy.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : r0.a6(iterable);
    }

    public static final <T> boolean w0(Iterable<? extends T> iterable, ds.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final <T> boolean x0(List<T> list, ds.l<? super T, Boolean> lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.m0.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return w0(kotlin.jvm.internal.v1.c(list), lVar, z10);
        }
        int iL = h0.L(list);
        if (iL >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t10 = list.get(i11);
                if (lVar.invoke(t10).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
                if (i11 == iL) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iL2 = h0.L(list);
        if (i10 > iL2) {
            return true;
        }
        while (true) {
            list.remove(iL2);
            if (iL2 == i10) {
                return true;
            }
            iL2--;
        }
    }

    @ur.f
    public static final <T> void y0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        J0(collection, elements);
    }

    @ur.f
    public static final <T> void z0(Collection<? super T> collection, T t10) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        collection.remove(t10);
    }
}
