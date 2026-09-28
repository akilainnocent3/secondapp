package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jf00<K, V> extends x4<Map.Entry<? extends K, ? extends V>> implements vcn<Map.Entry<? extends K, ? extends V>> {
    public final pe00<K, V> b;

    public jf00(pe00<K, V> pe00Var) {
        this.b = pe00Var;
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
        pe00<K, V> pe00Var = this.b;
        V v = pe00Var.get(key);
        if (v != null) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && pe00Var.containsKey(entry.getKey());
    }

    @Override // defpackage.x4, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        bwg0<K, V> bwg0Var = this.b.d;
        ewg0[] ewg0VarArr = new ewg0[8];
        for (int i = 0; i < 8; i++) {
            ewg0VarArr[i] = new gwg0();
        }
        return new lf00(bwg0Var, ewg0VarArr);
    }
}
