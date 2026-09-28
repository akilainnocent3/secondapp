package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y9h<K, V> extends qr60<K, V> {
    public final HashMap<K, qr60.c<K, V>> e = new HashMap<>();

    @Override // defpackage.qr60
    public final qr60.c<K, V> a(K k) {
        return this.e.get(k);
    }

    @Override // defpackage.qr60
    public final V b(K k) {
        V v = (V) super.b(k);
        this.e.remove(k);
        return v;
    }
}
