package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mxd0<K, V> extends kxd0<K, V> implements Iterator<V>, dhp {
    @Override // java.util.Iterator
    public final V next() {
        Map.Entry<? extends K, ? extends V> entry = this.e;
        if (entry != null) {
            b();
            return entry.getValue();
        }
        fm20.a();
        return null;
    }
}
