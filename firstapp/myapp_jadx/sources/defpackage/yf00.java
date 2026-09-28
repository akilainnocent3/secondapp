package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class yf00<K, V> extends h4<K, V> implements wf00.a<K, V> {
    public xf00<K, V> a;
    public Object b;
    public Object c;
    public final se00<K, igs<V>> d;

    public static final class a implements Function2<igs<V>, ?, Boolean> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            igs igsVar = (igs) obj;
            igs igsVar2 = (igs) obj2;
            igsVar.getClass();
            igsVar2.getClass();
            return Boolean.valueOf(Intrinsics.g(igsVar.a, igsVar2.a));
        }
    }

    public static final class b implements Function2<igs<V>, ?, Boolean> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            igs igsVar = (igs) obj;
            igs igsVar2 = (igs) obj2;
            igsVar.getClass();
            igsVar2.getClass();
            return Boolean.valueOf(Intrinsics.g(igsVar.a, igsVar2.a));
        }
    }

    public static final class c implements Function2<igs<V>, ?, Boolean> {
        public static final c a = new c();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            igs igsVar = (igs) obj;
            igsVar.getClass();
            return Boolean.valueOf(Intrinsics.g(igsVar.a, obj2));
        }
    }

    public static final class d implements Function2<igs<V>, ?, Boolean> {
        public static final d a = new d();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            igs igsVar = (igs) obj;
            igsVar.getClass();
            return Boolean.valueOf(Intrinsics.g(igsVar.a, obj2));
        }
    }

    public yf00(xf00<K, V> xf00Var) {
        this.a = xf00Var;
        this.b = xf00Var.d;
        this.c = xf00Var.e;
        this.d = new se00<>(xf00Var.f);
    }

    @Override // defpackage.h4
    public final Set<Map.Entry<K, V>> b() {
        return new zf00(this);
    }

    @Override // wf00.a
    public final wf00<K, V> build() {
        xf00<K, V> xf00Var = this.a;
        if (xf00Var != null) {
            return xf00Var;
        }
        xf00<K, V> xf00Var2 = new xf00<>(this.b, this.c, this.d.build());
        this.a = xf00Var2;
        return xf00Var2;
    }

    @Override // defpackage.h4
    public final Set<K> c() {
        return new bg00(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        se00<K, igs<V>> se00Var = this.d;
        if (!se00Var.isEmpty()) {
            this.a = null;
        }
        se00Var.clear();
        g6g g6gVar = g6g.a;
        this.b = g6gVar;
        this.c = g6gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.h4
    public final int d() {
        return this.d.d();
    }

    @Override // defpackage.h4
    public final Collection<V> e() {
        return new eg00(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            se00<K, igs<V>> se00Var = this.d;
            Map map = (Map) obj;
            if (se00Var.d() == map.size()) {
                if (map instanceof xf00) {
                    return se00Var.c.g(((xf00) obj).f.d, a.a);
                }
                if (map instanceof yf00) {
                    return se00Var.c.g(((yf00) obj).d.c, b.a);
                }
                if (map instanceof oe00) {
                    return se00Var.c.g(((oe00) obj).d, c.a);
                }
                if (map instanceof se00) {
                    return se00Var.c.g(((se00) obj).c, d.a);
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

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        igs<V> igsVar = this.d.get(obj);
        if (igsVar != null) {
            return igsVar.a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        se00<K, igs<V>> se00Var = this.d;
        igs<V> igsVar = se00Var.get(k);
        if (igsVar != null) {
            V v2 = igsVar.a;
            if (v2 == v) {
                return v;
            }
            this.a = null;
            se00Var.put(k, new igs<>(v, igsVar.b, igsVar.c));
            return v2;
        }
        this.a = null;
        boolean zIsEmpty = isEmpty();
        g6g g6gVar = g6g.a;
        if (zIsEmpty) {
            this.b = k;
            this.c = k;
            se00Var.put(k, new igs<>(v, g6gVar, g6gVar));
            return null;
        }
        Object obj = this.c;
        igs<V> igsVar2 = se00Var.get(obj);
        igsVar2.getClass();
        igs<V> igsVar3 = igsVar2;
        se00Var.put((K) obj, new igs<>(igsVar3.a, igsVar3.b, k));
        se00Var.put(k, new igs<>(v, obj, g6gVar));
        this.c = k;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        se00<K, igs<V>> se00Var = this.d;
        igs<V> igsVarRemove = se00Var.remove(obj);
        if (igsVarRemove == null) {
            return null;
        }
        Object obj2 = igsVarRemove.c;
        Object obj3 = igsVarRemove.b;
        this.a = null;
        g6g g6gVar = g6g.a;
        if (obj3 != g6gVar) {
            igs<V> igsVar = se00Var.get(obj3);
            igsVar.getClass();
            igs<V> igsVar2 = igsVar;
            se00Var.put((K) obj3, new igs<>(igsVar2.a, igsVar2.b, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 != g6gVar) {
            igs<V> igsVar3 = se00Var.get(obj2);
            igsVar3.getClass();
            igs<V> igsVar4 = igsVar3;
            se00Var.put((K) obj2, new igs<>(igsVar4.a, obj3, igsVar4.c));
        } else {
            this.c = obj3;
        }
        return igsVarRemove.a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        igs<V> igsVar = this.d.get(obj);
        if (igsVar == null || !Intrinsics.g(igsVar.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
