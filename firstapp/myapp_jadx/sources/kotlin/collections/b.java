package kotlin.collections;

import defpackage.hb5;
import defpackage.lx30;
import defpackage.m2g;
import defpackage.mae0;
import defpackage.n36;
import defpackage.pe4;
import defpackage.tw0;
import defpackage.vl8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class b extends a {
    public static <T> ArrayList<T> f(T... tArr) {
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new tw0(tArr, true));
    }

    public static int g(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        n(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iB = vl8.b((Comparable) arrayList.get(i3), comparable);
            if (iB < 0) {
                i2 = i3 + 1;
            } else {
                if (iB <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static m2g h() {
        return m2g.a;
    }

    public static IntRange i(Collection<?> collection) {
        collection.getClass();
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static <T> int j(List<? extends T> list) {
        list.getClass();
        return list.size() - 1;
    }

    public static <T> List<T> k(T... tArr) {
        tArr.getClass();
        if (tArr.length <= 0) {
            return m2g.a;
        }
        List<T> listAsList = Arrays.asList(tArr);
        listAsList.getClass();
        return listAsList;
    }

    public static ArrayList l(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new tw0(objArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> m(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : a.c(list.get(0));
        }
        return m2g.a;
    }

    public static final void n(int i, int i2) {
        if (i2 < 0) {
            hb5.a(pe4.b(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            mae0.a(n36.a("toIndex (", i2, i, ") is greater than size (", ")."));
        }
    }

    public static <T> List<T> o(Iterable<? extends T> iterable, lx30 lx30Var) {
        iterable.getClass();
        lx30Var.getClass();
        List<T> listJ = CollectionsKt___CollectionsKt.J(iterable);
        ArrayList arrayList = (ArrayList) listJ;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            int iF = lx30Var.f(size + 1);
            arrayList.set(iF, arrayList.set(size, arrayList.get(iF)));
        }
        return listJ;
    }

    public static void p() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void q() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
