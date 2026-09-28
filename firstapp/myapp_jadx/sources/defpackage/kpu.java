package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
public class kpu extends jpu {
    public static <K, V> HashMap<K, V> d(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> map = new HashMap<>(jpu.a(pairArr.length));
        j(map, pairArr);
        return map;
    }

    public static <K, V> LinkedHashMap<K, V> e(Pair<? extends K, ? extends V>... pairArr) {
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>(jpu.a(pairArr.length));
        j(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> f(Pair<? extends K, ? extends V>... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(jpu.a(pairArr.length));
            j(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }

    public static LinkedHashMap g(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jpu.a(pairArr.length));
        j(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap h(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> i(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        map.getClass();
        if (map.isEmpty()) {
            return jpu.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.a, pair.b);
        return linkedHashMap;
    }

    public static <K, V> void j(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        map.getClass();
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((Object) pair.a, (Object) pair.b);
        }
    }

    public static Map k(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return o2gVar;
        }
        if (size == 1) {
            return jpu.b((Pair) list.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(jpu.a(list.size()));
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.a, pair.b);
        }
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return o2gVar;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap m(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static Object c(Object obj, Map map) {
        map.getClass();
        if (map instanceof xou) {
            return ((xou) map).w();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            ibh0.a(aya.b(obj, "Key ", CaxEybC.bsajrUsb));
            return null;
        }
        return obj2;
    }
}
