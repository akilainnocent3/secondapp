package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class kcn<K, V> extends b4<K, V> implements Serializable {
    public final K a;
    public final V b;

    public kcn(K k, V v) {
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
        throw new UnsupportedOperationException();
    }
}
