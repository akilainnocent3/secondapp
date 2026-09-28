package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t3<K, V> extends x3<K, V> {
    @Override // defpackage.gmw
    public final Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapC = c();
        this.c = mapC;
        return mapC;
    }
}
