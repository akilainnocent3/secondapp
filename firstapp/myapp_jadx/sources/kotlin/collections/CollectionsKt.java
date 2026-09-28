package kotlin.collections;

import defpackage.gfn;
import defpackage.hb5;
import defpackage.ibh0;
import defpackage.jpu;
import defpackage.kb5;
import defpackage.l48;
import defpackage.lx30;
import defpackage.m2g;
import defpackage.o48;
import defpackage.p48;
import defpackage.pe4;
import defpackage.s48;
import defpackage.sqi;
import defpackage.t3g;
import defpackage.u48;
import defpackage.uts;
import defpackage.wi80;
import defpackage.xx0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"kotlin/collections/a", "kotlin/collections/b", "l48", "m48", "n48", "o48", "p48", "q48", "r48", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static List A0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return b.m(CollectionsKt___CollectionsKt.J(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m2g.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return a.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] B0(List list) {
        list.getClass();
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList C0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static LinkedHashSet D0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.I(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set E0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.I(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : wi80.b(linkedHashSet.iterator().next());
            }
            return t3g.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return t3g.a;
        }
        if (size2 == 1) {
            return wi80.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(jpu.a(collection.size()));
        CollectionsKt___CollectionsKt.I(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static ArrayList F0(Iterable iterable, int i, int i2) {
        iterable.getClass();
        sqi.b(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itC = sqi.c(iterable.iterator(), i, i2);
            while (itC.hasNext()) {
                arrayList.add((List) itC.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static gfn G0(List list) {
        list.getClass();
        return new gfn(new s48(list, 0));
    }

    public static ArrayList H0(List list, List list2) {
        list.getClass();
        list2.getClass();
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(l48.r(list, 10), l48.r(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static u48 K(Iterable iterable) {
        iterable.getClass();
        return new u48(iterable);
    }

    public static ArrayList L(Iterable iterable, int i) {
        iterable.getClass();
        return F0(iterable, i, i);
    }

    public static boolean M(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return W(iterable, obj) >= 0;
    }

    public static List N(Iterable iterable) {
        iterable.getClass();
        return A0(D0(iterable));
    }

    public static List O(Iterable iterable, int i) {
        ArrayList arrayList;
        Object objB0;
        iterable.getClass();
        if (i < 0) {
            kb5.a(pe4.b(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return A0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return m2g.a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objB0 = b0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        ibh0.a("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objB0 = next;
                }
                return a.c(objB0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return b.m(arrayList);
    }

    public static List P(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return t0(list, size);
    }

    public static Object Q(Iterable iterable, final int i) {
        iterable.getClass();
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        Function1 function1 = new Function1() { // from class: t48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
            }
        };
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            function1.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            function1.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        function1.invoke(Integer.valueOf(i));
        throw null;
    }

    public static ArrayList R(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object S(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return T((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        ibh0.a("Collection is empty.");
        return null;
    }

    public static Object T(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        ibh0.a("List is empty.");
        return null;
    }

    public static Object U(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object V(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int W(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                b.q();
                throw null;
            }
            if (Intrinsics.g(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int X(List list, Object obj) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static LinkedHashSet Y(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionA0 = iterable2 instanceof Collection ? (Collection) iterable2 : A0(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionA0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static /* synthetic */ void Z(Iterable iterable, StringBuilder sb, String str, Function1 function1, int i) {
        if ((i & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.H(iterable, sb, str, "", "", "...", function1);
    }

    public static String a0(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.H(iterable, sb, charSequence2, str3, str4, "...", function1);
        return sb.toString();
    }

    public static Object b0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return uts.a(1, list);
        }
        ibh0.a("List is empty.");
        return null;
    }

    public static Object c0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return uts.a(1, list);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object d0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return uts.a(1, list);
    }

    public static Comparable e0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable f0(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList g0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.g(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List h0(Iterable iterable, List list) {
        iterable.getClass();
        Collection collectionA0 = iterable instanceof Collection ? (Collection) iterable : A0(iterable);
        if (collectionA0.isEmpty()) {
            return A0(list);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!collectionA0.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList i0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            p48.w(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList j0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object k0(List list, lx30.Companion aVar) {
        list.getClass();
        aVar.getClass();
        if (list.isEmpty()) {
            ibh0.a("Collection is empty.");
            return null;
        }
        return Q(list, lx30.b.f(list.size()));
    }

    public static Object l0(Collection collection, lx30.Companion aVar) {
        collection.getClass();
        aVar.getClass();
        if (collection.isEmpty()) {
            return null;
        }
        return Q(collection, lx30.b.f(collection.size()));
    }

    public static List m0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return A0(iterable);
        }
        List listJ = CollectionsKt___CollectionsKt.J(iterable);
        Collections.reverse(listJ);
        return listJ;
    }

    public static Object n0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            ibh0.a("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        hb5.a("List has more than one element.");
        return null;
    }

    public static Object o0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object p0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List q0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listJ = CollectionsKt___CollectionsKt.J(iterable);
            o48.u(listJ);
            return listJ;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return A0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return xx0.c(array);
    }

    public static List r0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listJ = CollectionsKt___CollectionsKt.J(iterable);
            o48.v(comparator, listJ);
            return listJ;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return A0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static double s0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static List t0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            kb5.a(pe4.b(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return m2g.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return A0(iterable);
            }
            if (i == 1) {
                return a.c(S(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return b.m(arrayList);
    }

    public static List u0(int i, List list) {
        list.getClass();
        if (i < 0) {
            kb5.a(pe4.b(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return m2g.a;
        }
        int size = list.size();
        if (i >= size) {
            return A0(list);
        }
        if (i == 1) {
            return a.c(b0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] v0(List list) {
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] w0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static float[] x0(List list) {
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet y0(Iterable iterable) {
        HashSet hashSet = new HashSet(jpu.a(l48.r(iterable, 12)));
        CollectionsKt___CollectionsKt.I(iterable, hashSet);
        return hashSet;
    }

    public static int[] z0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }
}
