package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zsw<K, V> extends dou<K, V> implements ghp.a {
    public final Map<K, igs<V>> c;
    public igs<V> d;

    public zsw(Map<K, igs<V>> map, K k, igs<V> igsVar) {
        super(k, igsVar.a);
        this.c = map;
        this.d = igsVar;
    }

    @Override // defpackage.dou, java.util.Map.Entry
    public final V getValue() {
        return this.d.a;
    }

    @Override // defpackage.dou, java.util.Map.Entry
    public final V setValue(V v) {
        igs<V> igsVar = this.d;
        V v2 = igsVar.a;
        igs<V> igsVar2 = new igs<>(v, igsVar.b, igsVar.c);
        this.d = igsVar2;
        this.c.put(this.a, igsVar2);
        return v2;
    }
}
