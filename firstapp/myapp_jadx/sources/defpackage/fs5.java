package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fs5<K, V> extends ox0<K, V> {
    public int i;

    @Override // defpackage.nj90, java.util.Map
    public final void clear() {
        this.i = 0;
        super.clear();
    }

    @Override // defpackage.nj90
    public final void h(nj90<? extends K, ? extends V> nj90Var) {
        this.i = 0;
        super.h(nj90Var);
    }

    @Override // defpackage.nj90, java.util.Map
    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.i = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.nj90
    public final V i(int i) {
        this.i = 0;
        return (V) super.i(i);
    }

    @Override // defpackage.nj90
    public final V j(int i, V v) {
        this.i = 0;
        return (V) super.j(i, v);
    }

    @Override // defpackage.nj90, java.util.Map
    public final V put(K k, V v) {
        this.i = 0;
        return (V) super.put(k, v);
    }
}
