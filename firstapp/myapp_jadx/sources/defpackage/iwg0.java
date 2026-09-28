package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iwg0<K, V> extends ewg0<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i = this.c;
        this.c = i + 2;
        return (K) this.a[i];
    }
}
