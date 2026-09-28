package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
public class e9l {
    public static <T, K> Map<K, Integer> a(c9l<T, ? extends K> c9lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = c9lVar.b();
        while (itB.hasNext()) {
            K kA = c9lVar.a(itB.next());
            Object bq40Var = linkedHashMap.get(kA);
            if (bq40Var == null && !linkedHashMap.containsKey(kA)) {
                bq40Var = new bq40();
            }
            bq40 bq40Var2 = (bq40) bq40Var;
            bq40Var2.a++;
            linkedHashMap.put(kA, bq40Var2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof dhp) && !(entry instanceof ghp.a)) {
                y8h0.f(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((bq40) entry.getValue()).a));
        }
        return y8h0.c(linkedHashMap);
    }
}
