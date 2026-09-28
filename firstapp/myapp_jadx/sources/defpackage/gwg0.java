package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gwg0<K, V> extends ewg0<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new cou(objArr[i], objArr[i + 1]);
    }
}
