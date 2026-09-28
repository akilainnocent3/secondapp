package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class lg00<K, V> extends q2<V> {
    public final xf00<K, V> a;

    public lg00(xf00<K, V> xf00Var) {
        this.a = xf00Var;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.a.f.e();
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new mg00(this.a);
    }
}
