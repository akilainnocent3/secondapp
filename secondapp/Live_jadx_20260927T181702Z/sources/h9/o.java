package h9;

import dr.w2;
import java.util.HashMap;
import java.util.Iterator;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o {
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void a(@oy.l f0.a<K, V> map, boolean z10, @oy.l ds.l<? super f0.a<K, V>, w2> fetchBlock) {
        m0.p(map, "map");
        m0.p(fetchBlock, "fetchBlock");
        f0.a aVar = new f0.a(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                aVar.put(map.g(i10), map.l(i10));
            } else {
                aVar.put(map.g(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(aVar);
                if (!z10) {
                    map.putAll(aVar);
                }
                aVar.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(aVar);
            if (z10) {
                return;
            }
            map.putAll(aVar);
        }
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void b(@oy.l HashMap<K, V> map, boolean z10, @oy.l ds.l<? super HashMap<K, V>, w2> fetchBlock) {
        int i10;
        m0.p(map, "map");
        m0.p(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        Iterator<K> it = map.keySet().iterator();
        loop0: while (true) {
            i10 = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                K next = it.next();
                m0.o(next, "next(...)");
                if (z10) {
                    map2.put(next, map.get(next));
                } else {
                    map2.put(next, null);
                }
                i10++;
            } while (i10 != 999);
            fetchBlock.invoke(map2);
            if (!z10) {
                map.putAll(map2);
            }
            map2.clear();
        }
        if (i10 > 0) {
            fetchBlock.invoke(map2);
            if (z10) {
                return;
            }
            map.putAll(map2);
        }
    }
}
