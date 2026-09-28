package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class se00<K, V> extends h4<K, V> implements wf00.a<K, V> {
    public oe00<K, V> a;
    public el9 b = new el9();
    public cwg0<K, V> c;
    public V d;
    public int e;
    public int f;

    public static final class a implements Function2<V, ?, Boolean> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.g(obj, obj2));
        }
    }

    public static final class b implements Function2<V, ?, Boolean> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.g(obj, obj2));
        }
    }

    public static final class c implements Function2<V, ?, Boolean> {
        public static final c a = new c();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            igs igsVar = (igs) obj2;
            igsVar.getClass();
            return Boolean.valueOf(Intrinsics.g(obj, igsVar.a));
        }
    }

    public static final class d implements Function2<V, ?, Boolean> {
        public static final d a = new d();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            igs igsVar = (igs) obj2;
            igsVar.getClass();
            return Boolean.valueOf(Intrinsics.g(obj, igsVar.a));
        }
    }

    public se00(oe00<K, V> oe00Var) {
        this.a = oe00Var;
        this.c = oe00Var.d;
        this.f = oe00Var.e;
    }

    @Override // defpackage.h4
    public final Set<Map.Entry<K, V>> b() {
        return new we00(this);
    }

    @Override // defpackage.h4
    public final Set<K> c() {
        return new af00(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        cwg0<K, V> cwg0Var = cwg0.e;
        cwg0Var.getClass();
        h(cwg0Var);
        i(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.h4
    public final int d() {
        return this.f;
    }

    @Override // defpackage.h4
    public final Collection<V> e() {
        return new ef00(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f == map.size()) {
                if (map instanceof oe00) {
                    return this.c.g(((oe00) obj).d, a.a);
                }
                if (map instanceof se00) {
                    return this.c.g(((se00) obj).c, b.a);
                }
                if (map instanceof xf00) {
                    return this.c.g(((xf00) obj).f.d, c.a);
                }
                if (map instanceof yf00) {
                    return this.c.g(((yf00) obj).d.c, d.a);
                }
                if (d() != map.size()) {
                    hb5.a("Failed requirement.");
                    return false;
                }
                if (map.isEmpty()) {
                    return true;
                }
                Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!rou.a(this, it.next())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // wf00.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final oe00<K, V> build() {
        oe00<K, V> oe00Var = this.a;
        if (oe00Var != null) {
            return oe00Var;
        }
        oe00<K, V> oe00Var2 = new oe00<>(this.c, d());
        this.a = oe00Var2;
        this.b = new el9();
        return oe00Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return (V) this.c.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void h(cwg0<K, V> cwg0Var) {
        if (cwg0Var != this.c) {
            this.c = cwg0Var;
            this.a = null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final void i(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.d = null;
        h(this.c.m(k != null ? k.hashCode() : 0, k, v, 0, this));
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        oe00<K, V> oe00VarBuild = null;
        oe00<K, V> oe00Var = map instanceof oe00 ? (oe00) map : null;
        if (oe00Var == null) {
            se00 se00Var = map instanceof se00 ? (se00) map : null;
            if (se00Var != null) {
                oe00VarBuild = se00Var.build();
            }
        } else {
            oe00VarBuild = oe00Var;
        }
        if (oe00VarBuild == null) {
            super.putAll(map);
            return;
        }
        jmd jmdVar = new jmd();
        jmdVar.a = 0;
        int i = this.f;
        cwg0<K, V> cwg0Var = this.c;
        cwg0<K, V> cwg0Var2 = oe00VarBuild.d;
        cwg0Var2.getClass();
        h(cwg0Var.n(cwg0Var2, 0, jmdVar, this));
        int i2 = (oe00VarBuild.e + i) - jmdVar.a;
        if (i != i2) {
            i(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iD = d();
        cwg0<K, V> cwg0VarP = this.c.p(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (cwg0VarP == null) {
            cwg0VarP = cwg0.e;
            cwg0VarP.getClass();
        }
        h(cwg0VarP);
        return iD != d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        this.d = null;
        cwg0<K, V> cwg0VarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (cwg0VarO == null) {
            cwg0VarO = cwg0.e;
            cwg0VarO.getClass();
        }
        h(cwg0VarO);
        return this.d;
    }
}
