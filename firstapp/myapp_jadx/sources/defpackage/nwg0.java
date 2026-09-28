package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nwg0<K, V> extends ewg0<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.c;
        this.c = i + 2;
        return (V) this.a[i + 1];
    }
}
