package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class te00<K, V> extends h4<K, V> implements vf00.a<K, V> {
    public pe00<K, V> a;
    public yrw b = new yrw();
    public bwg0<K, V> c;
    public V d;
    public int e;
    public int f;

    public te00(pe00<K, V> pe00Var) {
        this.a = pe00Var;
        this.c = pe00Var.d;
        this.f = pe00Var.e;
    }

    @Override // defpackage.h4
    public final Set<Map.Entry<K, V>> b() {
        return new xe00(this);
    }

    @Override // defpackage.h4
    public final Set<K> c() {
        return new bf00(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = bwg0.e;
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.h4
    public final int d() {
        return this.f;
    }

    @Override // defpackage.h4
    public final Collection<V> e() {
        return new ff00(this);
    }

    @Override // vf00.a
    public pe00<K, V> f() {
        bwg0<K, V> bwg0Var = this.c;
        pe00<K, V> pe00Var = this.a;
        if (bwg0Var != pe00Var.d) {
            this.b = new yrw();
            pe00Var = new pe00<>(this.c, this.f);
        }
        this.a = pe00Var;
        return pe00Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void h(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.d = null;
        this.c = this.c.l(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        pe00<K, V> pe00VarF = null;
        pe00<K, V> pe00Var = map instanceof pe00 ? (pe00) map : null;
        if (pe00Var == null) {
            te00 te00Var = map instanceof te00 ? (te00) map : null;
            if (te00Var != null) {
                pe00VarF = te00Var.f();
            }
        } else {
            pe00VarF = pe00Var;
        }
        if (pe00VarF == null) {
            super.putAll(map);
            return;
        }
        kmd kmdVar = new kmd();
        kmdVar.a = 0;
        int i = this.f;
        this.c = this.c.m(pe00VarF.d, 0, kmdVar, this);
        int i2 = (pe00VarF.e + i) - kmdVar.a;
        if (i != i2) {
            h(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f;
        bwg0<K, V> bwg0VarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (bwg0VarO == null) {
            bwg0VarO = bwg0.e;
        }
        this.c = bwg0VarO;
        return i != this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.d = null;
        bwg0<K, V> bwg0VarN = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (bwg0VarN == null) {
            bwg0VarN = bwg0.e;
        }
        this.c = bwg0VarN;
        return this.d;
    }
}
