package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f148572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f148573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f148574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f148575e;

    public e82(int i10, byte[] bArr, Map map, List list, boolean z10) {
        this.f148571a = i10;
        this.f148572b = bArr;
        this.f148573c = map;
        if (list == null) {
            this.f148574d = null;
        } else {
            this.f148574d = Collections.unmodifiableList(list);
        }
        this.f148575e = z10;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new q01((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static Map a(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q01 q01Var = (q01) it.next();
            treeMap.put(q01Var.f154215a, q01Var.f154216b);
        }
        return treeMap;
    }
}
