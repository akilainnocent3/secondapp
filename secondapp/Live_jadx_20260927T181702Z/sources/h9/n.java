package h9;

import dr.w2;
import f0.d1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n {
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final <V> void a(@oy.l d1<V> map, boolean z10, @oy.l ds.l<? super d1<V>, w2> fetchBlock) {
        m0.p(map, "map");
        m0.p(fetchBlock, "fetchBlock");
        d1<? extends V> d1Var = new d1<>(999);
        int iW = map.w();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iW) {
            if (z10) {
                d1Var.n(map.m(i10), map.x(i10));
            } else {
                d1Var.n(map.m(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(d1Var);
                if (!z10) {
                    map.o(d1Var);
                }
                d1Var.b();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(d1Var);
            if (z10) {
                return;
            }
            map.o(d1Var);
        }
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void b(@oy.l Map<K, V> map, boolean z10, @oy.l ds.l<? super Map<K, V>, w2> fetchBlock) {
        int i10;
        m0.p(map, "map");
        m0.p(fetchBlock, "fetchBlock");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<K> it = map.keySet().iterator();
        loop0: while (true) {
            i10 = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                K next = it.next();
                if (z10) {
                    linkedHashMap.put(next, map.get(next));
                } else {
                    linkedHashMap.put(next, null);
                }
                i10++;
            } while (i10 != 999);
            fetchBlock.invoke(linkedHashMap);
            if (!z10) {
                map.putAll(linkedHashMap);
            }
            linkedHashMap.clear();
        }
        if (i10 > 0) {
            fetchBlock.invoke(linkedHashMap);
            if (z10) {
                return;
            }
            map.putAll(linkedHashMap);
        }
    }
}
