package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bf00<K, V> extends i4<K> {
    public final te00<K, V> a;

    public bf00(te00<K, V> te00Var) {
        this.a = te00Var;
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
        ewg0[] ewg0VarArr = new ewg0[8];
        for (int i = 0; i < 8; i++) {
            ewg0VarArr[i] = new iwg0();
        }
        return new df00(this.a, ewg0VarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        te00<K, V> te00Var = this.a;
        if (!te00Var.containsKey(obj)) {
            return false;
        }
        te00Var.remove(obj);
        return true;
    }
}
