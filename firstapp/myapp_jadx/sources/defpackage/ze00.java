package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ze00<K, V> implements Iterator<Map.Entry<K, V>>, dhp {
    public final ve00<K, V, Map.Entry<K, V>> a;

    public ze00(te00<K, V> te00Var) {
        ewg0[] ewg0VarArr = new ewg0[8];
        for (int i = 0; i < 8; i++) {
            ewg0VarArr[i] = new lwg0(this);
        }
        this.a = new ve00<>(te00Var, ewg0VarArr);
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
