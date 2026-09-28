package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class xf00<K, V> extends v3<K, V> implements wf00<K, V> {
    public static final xf00 i;
    public final Object d;
    public final Object e;
    public final oe00<K, igs<V>> f;

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

    static {
        oe00 oe00Var = oe00.f;
        oe00Var.getClass();
        g6g g6gVar = g6g.a;
        i = new xf00(g6gVar, g6gVar, oe00Var);
    }

    public xf00(Object obj, Object obj2, oe00<K, igs<V>> oe00Var) {
        this.d = obj;
        this.e = obj2;
        this.f = oe00Var;
    }

    @Override // defpackage.v3
    public final Set<Map.Entry<K, V>> c() {
        return new gg00(this);
    }

    @Override // defpackage.v3, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // defpackage.v3
    public final Set d() {
        return new ig00(this);
    }

    @Override // defpackage.v3
    public final int e() {
        return this.f.e();
    }

    @Override // defpackage.v3, java.util.Map
    public final boolean equals(Object obj) {
        oe00<K, igs<V>> oe00Var = this.f;
        cwg0<K, igs<V>> cwg0Var = oe00Var.d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (oe00Var.e() != map.size()) {
            return false;
        }
        if (map instanceof xf00) {
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
        return new lg00(this);
    }

    @Override // defpackage.v3, java.util.Map
    public final V get(Object obj) {
        igs<V> igsVar = this.f.get(obj);
        if (igsVar != null) {
            return igsVar.a;
        }
        return null;
    }
}
