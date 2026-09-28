package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class l48 extends b {
    public static <T> int r(Iterable<? extends T> iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList s(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p48.w((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    public static Pair t(ArrayList arrayList) {
        int iR = r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(iR);
        ArrayList arrayList3 = new ArrayList(iR);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            arrayList2.add(pair.a);
            arrayList3.add(pair.b);
        }
        return new Pair(arrayList2, arrayList3);
    }
}
