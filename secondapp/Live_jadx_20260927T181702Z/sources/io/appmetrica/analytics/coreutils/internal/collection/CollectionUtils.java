package io.appmetrica.analytics.coreutils.internal.collection;

import android.os.Bundle;
import cs.o;
import cv.k0;
import fr.a0;
import fr.i0;
import fr.m1;
import fr.n1;
import fr.q;
import fr.r0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class CollectionUtils {

    @l
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    @o
    public static final boolean areCollectionsEqual(@m Collection<? extends Object> collection, @m Collection<? extends Object> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @o
    @m
    public static final <T> List<T> arrayListCopyOfNullableCollection(@m Collection<? extends T> collection) {
        if (collection != null) {
            return r0.a6(collection);
        }
        return null;
    }

    @l
    @o
    public static final Map<String, byte[]> bundleToMap(@m Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                byte[] byteArray = bundle.getByteArray(str);
                if (byteArray != null) {
                    map.put(str, byteArray);
                }
            }
        }
        return map;
    }

    @l
    @o
    public static final <T> Map<String, T> convertMapKeysToLowerCase(@l Map<String, ? extends T> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            linkedHashMap.put(str != null ? str.toLowerCase(Locale.getDefault()) : null, entry.getValue());
        }
        return linkedHashMap;
    }

    @o
    @m
    public static final <K, V> Map<K, V> copyOf(@m Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    @l
    @o
    public static final List<String> createSortedListWithoutRepetitions(@l String... strArr) {
        return unmodifiableListCopy(q.I4(strArr));
    }

    @o
    @m
    public static final <T> T getFirstOrNull(@m List<? extends T> list) {
        if (list != null) {
            return (T) r0.L2(list);
        }
        return null;
    }

    @o
    @m
    public static final <T> T getFromMapIgnoreCase(@l Map<String, ? extends T> map, @l String str) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            CharSequence charSequence = (CharSequence) entry.getKey();
            if (charSequence != null && charSequence.length() != 0 && k0.c2((String) entry.getKey(), str, true)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (T) entry2.getValue();
        }
        return null;
    }

    @o
    @m
    public static final <K, V> List<Map.Entry<K, V>> getListFromMap(@m Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    @o
    public static final <K, V> Map<K, V> getMapFromList(@m List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(m1.j(i0.d0(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @m
    public static final <K, V> Map<K, V> getMapFromListOrNull(@m List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(m1.j(i0.d0(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @o
    public static final <K, V> V getOrDefault(@l Map<K, ? extends V> map, K k10, V v10) {
        V v11 = map.get(k10);
        return v11 == null ? v10 : v11;
    }

    @l
    @o
    public static final Set<Integer> hashSetFromIntArray(@l int[] iArr) {
        return a0.Iy(iArr);
    }

    @o
    public static final boolean isNullOrEmpty(@m Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @o
    @m
    public static final <K, V> Map<K, V> mapCopyOfNullableMap(@m Map<K, ? extends V> map) {
        if (map != null) {
            return n1.D0(map);
        }
        return null;
    }

    @l
    @o
    public static final Bundle mapToBundle(@l Map<String, byte[]> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            bundle.putByteArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    @l
    @o
    public static final <T> Set<T> merge(@l Set<T> set, @l Set<? extends T> set2) {
        set.addAll(set2);
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o
    @m
    public static final <T> List<T> nullIfEmptyList(@m List<? extends T> list) {
        if (list == 0 || list.isEmpty()) {
            return null;
        }
        return list;
    }

    @o
    public static final <K, V> void putOpt(@l Map<K, V> map, @m K k10, @m V v10) {
        if (k10 == null || v10 == null) {
            return;
        }
        map.put(k10, v10);
    }

    @l
    @o
    public static final List<Integer> toIntList(@l int[] iArr) {
        return a0.Sy(iArr);
    }

    @l
    @o
    public static final <T> List<T> unmodifiableListCopy(@l Collection<? extends T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    @l
    @o
    public static final <K, V> Map<K, V> unmodifiableMapCopy(@l Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    @l
    @o
    public static final <K, V> Map<K, V> unmodifiableSameOrderMapCopy(@l Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @l
    @o
    public static final <T> Set<T> unmodifiableSetOf(@l T... tArr) {
        return Collections.unmodifiableSet(a0.Ky(tArr));
    }
}
