package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class fwg0<K, V> extends dwg0<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new dou(objArr[i], objArr[i + 1]);
    }
}
