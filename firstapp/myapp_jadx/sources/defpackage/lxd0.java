package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lxd0<K, V> extends kxd0<K, V> implements Iterator<K>, dhp {
    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<? extends K, ? extends V> entry = this.e;
        if (entry != null) {
            b();
            return entry.getKey();
        }
        fm20.a();
        return null;
    }
}
