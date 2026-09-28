package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class ig00<K, V> extends x4<K> implements ucn<K> {
    public final xf00<K, V> b;

    public ig00(xf00<K, V> xf00Var) {
        this.b = xf00Var;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.f.e();
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.f.containsKey(obj);
    }

    @Override // defpackage.x4, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new jg00(this.b);
    }
}
