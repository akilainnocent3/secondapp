package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class gg00<K, V> extends x4<Map.Entry<? extends K, ? extends V>> implements ucn<Map.Entry<? extends K, ? extends V>> {
    public final xf00<K, V> b;

    public gg00(xf00<K, V> xf00Var) {
        this.b = xf00Var;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.f.e();
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        xf00<K, V> xf00Var = this.b;
        V v = xf00Var.get(key);
        if (v != null) {
            return v.equals(entry.getValue());
        }
        if (entry.getValue() == null) {
            return xf00Var.f.containsKey(entry.getKey());
        }
        return false;
    }

    @Override // defpackage.x4, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new hg00(this.b);
    }
}
