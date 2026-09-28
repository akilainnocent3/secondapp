package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class eou<K, V> implements Map.Entry<K, V>, dhp {
    public final K a;
    public final V b;

    public eou(K k, V v) {
        this.a = k;
        this.b = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
