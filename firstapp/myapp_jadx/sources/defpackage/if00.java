package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class if00<K, V> extends x4<Map.Entry<? extends K, ? extends V>> implements ucn<Map.Entry<? extends K, ? extends V>> {
    public final oe00<K, V> b;

    public if00(oe00<K, V> oe00Var) {
        this.b = oe00Var;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.e;
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        oe00<K, V> oe00Var = this.b;
        V v = oe00Var.get(key);
        if (v != null) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && oe00Var.containsKey(entry.getKey());
    }

    @Override // defpackage.x4, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        cwg0<K, V> cwg0Var = this.b.d;
        cwg0Var.getClass();
        dwg0[] dwg0VarArr = new dwg0[8];
        for (int i = 0; i < 8; i++) {
            dwg0VarArr[i] = new fwg0();
        }
        return new kf00(cwg0Var, dwg0VarArr);
    }
}
