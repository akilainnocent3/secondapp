package fr;

import dr.w2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n1#2:528\n*E\n"})
public class h0 extends g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,527:1\n*E\n"})
    public static final class a<T> implements ds.l<T, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l<T, K> f85115b;

        /* JADX INFO: Incorrect field signature: TK; */
        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Comparable f85116c;

        /* JADX WARN: Incorrect types in method signature: (Lds/l<-TT;+TK;>;TK;)V */
        public a(ds.l lVar, Comparable comparable) {
            this.f85115b = lVar;
            this.f85116c = comparable;
        }

        @Override // ds.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(T t10) {
            return Integer.valueOf(jr.g.l((Comparable) this.f85115b.invoke(t10), this.f85116c));
        }
    }

    public static /* synthetic */ int A(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return x(list, comparable, i10, i11);
    }

    public static /* synthetic */ int B(List list, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = list.size();
        }
        return y(list, obj, comparator, i10, i11);
    }

    public static final <T, K extends Comparable<? super K>> int C(@oy.l List<? extends T> list, @oy.m K k10, int i10, int i11, @oy.l ds.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        return w(list, i10, i11, new a(selector, k10));
    }

    public static /* synthetic */ int D(List list, Comparable comparable, int i10, int i11, ds.l selector, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        kotlin.jvm.internal.m0.p(list, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        return w(list, i10, i11, new a(selector, comparable));
    }

    @dr.l1(version = "1.6")
    @ur.f
    public static final <E> List<E> E(int i10, @dr.b ds.l<? super List<E>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        List listK = g0.k(i10);
        builderAction.invoke(listK);
        return g0.b(listK);
    }

    @dr.l1(version = "1.6")
    @ur.f
    public static final <E> List<E> F(@dr.b ds.l<? super List<E>, w2> builderAction) {
        kotlin.jvm.internal.m0.p(builderAction, "builderAction");
        List listJ = g0.j();
        builderAction.invoke(listJ);
        return g0.b(listJ);
    }

    @oy.l
    public static final Object[] G(@oy.l Collection<?> collection) {
        kotlin.jvm.internal.m0.p(collection, "collection");
        int i10 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    @oy.l
    public static final <T> T[] H(@oy.l Collection<?> collection, @oy.l T[] array) {
        Object[] objArr;
        kotlin.jvm.internal.m0.p(collection, "collection");
        kotlin.jvm.internal.m0.p(array, "array");
        int i10 = 0;
        if (collection.isEmpty()) {
            return (T[]) g0.o(0, array);
        }
        if (array.length < collection.size()) {
            objArr = array;
            objArr = (T[]) o.a(array, collection.size());
        }
        objArr = array;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return (T[]) g0.o(collection.size(), objArr);
    }

    @ur.f
    public static final <T> boolean I(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        kotlin.jvm.internal.m0.p(elements, "elements");
        return collection.containsAll(elements);
    }

    @oy.l
    public static <T> List<T> J() {
        return u0.f85157b;
    }

    @oy.l
    public static ms.l K(@oy.l Collection<?> collection) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        return new ms.l(0, collection.size() - 1);
    }

    public static <T> int L(@oy.l List<? extends T> list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lds/a<+TR;>;)TR; */
    @dr.l1(version = "1.3")
    @ur.f
    public static final Object M(Collection collection, ds.a defaultValue) {
        kotlin.jvm.internal.m0.p(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    @ur.f
    public static final <T> boolean N(Collection<? extends T> collection) {
        kotlin.jvm.internal.m0.p(collection, "<this>");
        return !collection.isEmpty();
    }

    @dr.l1(version = "1.3")
    @ur.f
    public static final <T> boolean O(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @ur.f
    public static final <T> List<T> P() {
        return J();
    }

    @oy.l
    public static <T> List<T> Q(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return elements.length > 0 ? q.t(elements) : J();
    }

    @oy.l
    public static <T> List<T> R(@oy.m T t10) {
        return t10 != null ? g0.l(t10) : J();
    }

    @oy.l
    public static <T> List<T> S(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return a0.cb(elements);
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <T> List<T> T() {
        return new ArrayList();
    }

    @oy.l
    public static <T> List<T> U(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(u(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public static final <T> List<T> V(@oy.l List<? extends T> list) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : g0.l(list.get(0));
        }
        return J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ur.f
    public static final <T> Collection<T> W(Collection<? extends T> collection) {
        return collection == 0 ? J() : collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ur.f
    public static final <T> List<T> X(List<? extends T> list) {
        return list == 0 ? J() : list;
    }

    public static final void Y(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    @oy.l
    @dr.l1(version = "1.3")
    public static final <T> List<T> Z(@oy.l Iterable<? extends T> iterable, @oy.l ks.f random) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        kotlin.jvm.internal.m0.p(random, "random");
        List<T> listC6 = r0.c6(iterable);
        r0.j5(listC6, random);
        return listC6;
    }

    @dr.f1
    @dr.l1(version = "1.3")
    public static void a0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @dr.f1
    @dr.l1(version = "1.3")
    public static void b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <T> List<T> q(int i10, ds.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.m0.p(init, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(init.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <T> List<T> r(int i10, ds.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.m0.p(init, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(init.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @dr.l1(version = "1.1")
    @ur.f
    public static final <T> ArrayList<T> s() {
        return new ArrayList<>();
    }

    @oy.l
    public static <T> ArrayList<T> t(@oy.l T... elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(u(elements, true));
    }

    @oy.l
    public static final <T> Collection<T> u(@oy.l T[] tArr, boolean z10) {
        kotlin.jvm.internal.m0.p(tArr, "<this>");
        return new l(tArr, z10);
    }

    public static /* synthetic */ Collection v(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return u(objArr, z10);
    }

    public static final <T> int w(@oy.l List<? extends T> list, int i10, int i11, @oy.l ds.l<? super T, Integer> comparison) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        kotlin.jvm.internal.m0.p(comparison, "comparison");
        Y(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = comparison.invoke(list.get(i13)).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T extends Comparable<? super T>> int x(@oy.l List<? extends T> list, @oy.m T t10, int i10, int i11) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        Y(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iL = jr.g.l(list.get(i13), t10);
            if (iL < 0) {
                i10 = i13 + 1;
            } else {
                if (iL <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T> int y(@oy.l List<? extends T> list, T t10, @oy.l Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.m0.p(list, "<this>");
        kotlin.jvm.internal.m0.p(comparator, "comparator");
        Y(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iCompare = comparator.compare(list.get(i13), t10);
            if (iCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int z(List list, int i10, int i11, ds.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return w(list, i10, i11, lVar);
    }
}
