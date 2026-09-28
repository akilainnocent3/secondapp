package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class hwg0<K, V> extends dwg0<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.c;
        this.c = i + 2;
        return (K) this.a[i];
    }
}
