package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jxd0<K, V> extends kxd0<K, V> implements Iterator<Map.Entry<K, V>>, dhp {
    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (this.d != null) {
            return new ixd0(this);
        }
        fm20.a();
        return null;
    }
}
