package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class oe00<K, V> extends v3<K, V> implements wf00<K, V> {
    public static final oe00 f = new oe00(cwg0.e, 0);
    public final cwg0<K, V> d;
    public final int e;

    public static final class a implements Function2<V, ?, Boolean> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            igs igsVar = (igs) obj2;
            igsVar.getClass();
            return Boolean.valueOf(Intrinsics.g(obj, igsVar.a));
        }
    }

    public static final class b implements Function2<V, ?, Boolean> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            igs igsVar = (igs) obj2;
            igsVar.getClass();
            return Boolean.valueOf(Intrinsics.g(obj, igsVar.a));
        }
    }

    public static final class c implements Function2<V, ?, Boolean> {
        public static final c a = new c();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.g(obj, obj2));
        }
    }

    public static final class d implements Function2<V, ?, Boolean> {
        public static final d a = new d();

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.g(obj, obj2));
        }
    }

    public oe00(cwg0<K, V> cwg0Var, int i) {
        cwg0Var.getClass();
        this.d = cwg0Var;
        this.e = i;
    }

    @Override // defpackage.v3
    public final Set<Map.Entry<K, V>> c() {
        return new if00(this);
    }

    @Override // defpackage.v3, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.v3
    public final Set d() {
        return new mf00(this);
    }

    @Override // defpackage.v3
    public final int e() {
        return this.e;
    }

    @Override // defpackage.v3, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.e != map.size()) {
            return false;
        }
        boolean z = map instanceof xf00;
        cwg0<K, V> cwg0Var = this.d;
        if (z) {
            return cwg0Var.g(((xf00) obj).f.d, a.a);
        }
        if (map instanceof yf00) {
            return cwg0Var.g(((yf00) obj).d.c, b.a);
        }
        if (map instanceof oe00) {
            return cwg0Var.g(((oe00) obj).d, c.a);
        }
        return map instanceof se00 ? cwg0Var.g(((se00) obj).c, d.a) : super.equals(obj);
    }

    @Override // defpackage.v3
    public final Collection f() {
        return new qf00(this);
    }

    @Override // defpackage.v3, java.util.Map
    public final V get(Object obj) {
        return (V) this.d.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
