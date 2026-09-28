package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class af00<K, V> extends i4<K> {
    public final se00<K, V> a;

    public af00(se00<K, V> se00Var) {
        this.a = se00Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.i4
    public final int b() {
        return this.a.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        dwg0[] dwg0VarArr = new dwg0[8];
        for (int i = 0; i < 8; i++) {
            dwg0VarArr[i] = new hwg0();
        }
        return new cf00(this.a, dwg0VarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        se00<K, V> se00Var = this.a;
        if (!se00Var.containsKey(obj)) {
            return false;
        }
        se00Var.remove(obj);
        return true;
    }
}
