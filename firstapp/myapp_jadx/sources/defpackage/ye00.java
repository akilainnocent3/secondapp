package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ye00<K, V> implements Iterator<Map.Entry<K, V>>, dhp {
    public final ue00<K, V, Map.Entry<K, V>> a;

    public ye00(se00<K, V> se00Var) {
        dwg0[] dwg0VarArr = new dwg0[8];
        for (int i = 0; i < 8; i++) {
            dwg0VarArr[i] = new kwg0(this);
        }
        this.a = new ue00<>(se00Var, dwg0VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
