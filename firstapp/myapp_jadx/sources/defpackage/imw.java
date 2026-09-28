package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
public final class imw<K, V> extends t3<K, V> {
    public transient hmw f;

    @Override // defpackage.x3
    public final Map<K, Collection<V>> c() {
        Map<K, Collection<V>> map = this.d;
        if (map instanceof NavigableMap) {
            return new x3.d(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new x3.g(this, (SortedMap) map) : new x3.a(map);
    }

    @Override // defpackage.x3
    public final Collection d() {
        return (List) this.f.get();
    }

    @Override // defpackage.x3
    public final Set<K> e() {
        Map<K, Collection<V>> map = this.d;
        if (map instanceof NavigableMap) {
            return new x3.e(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new x3.h(this, (SortedMap) map) : new x3.c(map);
    }
}
