package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class kwg0<K, V> extends dwg0<K, V, Map.Entry<K, V>> {
    public final ye00<K, V> d;

    public kwg0(ye00<K, V> ye00Var) {
        this.d = ye00Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new ysw(this.d, objArr[i], objArr[i + 1]);
    }
}
