package fw;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class z {
    @oy.l
    public static final <K, V> Map<K, V> a(int i10) {
        return new ConcurrentHashMap(i10);
    }
}
