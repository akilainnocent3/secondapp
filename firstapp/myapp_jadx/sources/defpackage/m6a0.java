package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m6a0<K, V> implements nxd0, Map<K, V>, ghp {
    public a a;
    public final o5a0 b;
    public final p5a0 c;
    public final r5a0 d;

    public static final class a<K, V> extends rxd0 {
        public vf00<K, ? extends V> c;
        public int d;

        public a(long j, vf00<K, ? extends V> vf00Var) {
            super(j);
            this.c = vf00Var;
        }

        @Override // defpackage.rxd0
        public final void a(rxd0 rxd0Var) {
            rxd0Var.getClass();
            a aVar = (a) rxd0Var;
            synchronized (n6a0.a) {
                this.c = aVar.c;
                this.d = aVar.d;
                Unit unit = Unit.a;
            }
        }

        @Override // defpackage.rxd0
        public final rxd0 b() {
            return new a(n5a0.g().g(), this.c);
        }

        @Override // defpackage.rxd0
        public final rxd0 c(long j) {
            return new a(j, this.c);
        }
    }

    public m6a0() {
        pe00 pe00Var = pe00.f;
        c5a0 c5a0VarG = n5a0.g();
        a aVar = new a(c5a0VarG.g(), pe00Var);
        if (!(c5a0VarG instanceof s2l)) {
            aVar.b = new a(1L, pe00Var);
        }
        this.a = aVar;
        this.b = new o5a0(this);
        this.c = new p5a0(this);
        this.d = new r5a0(this);
    }

    public static boolean b(a aVar, int i, vf00 vf00Var) {
        boolean z;
        synchronized (n6a0.a) {
            int i2 = aVar.d;
            if (i2 == i) {
                aVar.c = vf00Var;
                z = true;
                aVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final a<K, V> c() {
        a aVar = this.a;
        aVar.getClass();
        return (a) n5a0.r(aVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        c5a0 c5a0VarG;
        a aVar = this.a;
        aVar.getClass();
        vf00<K, ? extends V> vf00Var = ((a) n5a0.e(aVar)).c;
        pe00 pe00Var = pe00.f;
        if (pe00Var != vf00Var) {
            a aVar2 = this.a;
            aVar2.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                a aVar3 = (a) n5a0.v(aVar2, this, c5a0VarG);
                synchronized (n6a0.a) {
                    aVar3.c = pe00Var;
                    aVar3.d++;
                }
            }
            n5a0.k(c5a0VarG, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.b;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return c().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.c;
    }

    @Override // defpackage.nxd0
    public final void n(rxd0 rxd0Var) {
        this.a = (a) rxd0Var;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        vf00<K, ? extends V> vf00Var;
        int i;
        V v2;
        c5a0 c5a0VarG;
        boolean zB;
        do {
            synchronized (n6a0.a) {
                a aVar = this.a;
                aVar.getClass();
                a aVar2 = (a) n5a0.e(aVar);
                vf00Var = aVar2.c;
                i = aVar2.d;
                Unit unit = Unit.a;
            }
            vf00Var.getClass();
            te00 te00Var = (te00) vf00Var.builder();
            v2 = (V) te00Var.put(k, v);
            vf00<K, V> vf00VarF = te00Var.f();
            if (Intrinsics.g(vf00VarF, vf00Var)) {
                break;
            }
            a aVar3 = this.a;
            aVar3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zB = b((a) n5a0.v(aVar3, this, c5a0VarG), i, vf00VarF);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zB);
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        vf00<K, ? extends V> vf00Var;
        int i;
        c5a0 c5a0VarG;
        boolean zB;
        do {
            synchronized (n6a0.a) {
                a aVar = this.a;
                aVar.getClass();
                a aVar2 = (a) n5a0.e(aVar);
                vf00Var = aVar2.c;
                i = aVar2.d;
                Unit unit = Unit.a;
            }
            vf00Var.getClass();
            te00 te00Var = (te00) vf00Var.builder();
            te00Var.putAll(map);
            vf00<K, V> vf00VarF = te00Var.f();
            if (Intrinsics.g(vf00VarF, vf00Var)) {
                return;
            }
            a aVar3 = this.a;
            aVar3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zB = b((a) n5a0.v(aVar3, this, c5a0VarG), i, vf00VarF);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zB);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        vf00<K, ? extends V> vf00Var;
        int i;
        V vRemove;
        c5a0 c5a0VarG;
        boolean zB;
        do {
            synchronized (n6a0.a) {
                a aVar = this.a;
                aVar.getClass();
                a aVar2 = (a) n5a0.e(aVar);
                vf00Var = aVar2.c;
                i = aVar2.d;
                Unit unit = Unit.a;
            }
            vf00Var.getClass();
            vf00.a<K, ? extends V> aVarBuilder = vf00Var.builder();
            vRemove = aVarBuilder.remove(obj);
            vf00<K, ? extends V> vf00VarF = aVarBuilder.f();
            if (Intrinsics.g(vf00VarF, vf00Var)) {
                break;
            }
            a aVar3 = this.a;
            aVar3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zB = b((a) n5a0.v(aVar3, this, c5a0VarG), i, vf00VarF);
            }
            n5a0.k(c5a0VarG, this);
        } while (!zB);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return c().c.size();
    }

    public final String toString() {
        a aVar = this.a;
        aVar.getClass();
        return "SnapshotStateMap(value=" + ((a) n5a0.e(aVar)).c + ")@" + hashCode();
    }

    @Override // defpackage.nxd0
    public final rxd0 v() {
        return this.a;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.d;
    }
}
