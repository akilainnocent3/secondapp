package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class pe00<K, V> extends v3<K, V> implements vf00<K, V> {
    public static final pe00 f = new pe00(bwg0.e, 0);
    public final bwg0<K, V> d;
    public final int e;

    public pe00(bwg0<K, V> bwg0Var, int i) {
        this.d = bwg0Var;
        this.e = i;
    }

    @Override // defpackage.v3
    public final Set<Map.Entry<K, V>> c() {
        return new jf00(this);
    }

    @Override // defpackage.v3, java.util.Map
    public boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.v3
    public final Set d() {
        return new nf00(this);
    }

    @Override // defpackage.v3
    public final int e() {
        return this.e;
    }

    @Override // defpackage.v3
    public final Collection f() {
        return new rf00(this);
    }

    @Override // defpackage.v3, java.util.Map
    public V get(Object obj) {
        return (V) this.d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.vf00, defpackage.ne00
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public te00<K, V> builder() {
        return new te00<>(this);
    }

    public final pe00 j(Object obj, kgs kgsVar) {
        bwg0.a aVarU = this.d.u(obj, obj != null ? obj.hashCode() : 0, 0, kgsVar);
        return aVarU == null ? this : new pe00(aVarU.a, this.e + aVarU.b);
    }
}
