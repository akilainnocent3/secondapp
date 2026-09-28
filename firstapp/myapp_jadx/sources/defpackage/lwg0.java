package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lwg0<K, V> extends ewg0<K, V, Map.Entry<K, V>> {
    public final ze00<K, V> d;

    public lwg0(ze00<K, V> ze00Var) {
        this.d = ze00Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new atw(this.d, objArr[i], objArr[i + 1]);
    }
}
