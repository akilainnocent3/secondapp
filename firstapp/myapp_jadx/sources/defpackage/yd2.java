package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class yd2<T> {
    public final cb30 a;
    public final dq7 b;
    public final cb30 c;
    public final Function2<qn70, wrz, T> d;
    public final kqp e;
    public List<? extends ygp<?>> f;

    public yd2(cb30 cb30Var, dq7 dq7Var, cb30 cb30Var2, Function2 function2, kqp kqpVar, m2g m2gVar) {
        cb30Var.getClass();
        m2gVar.getClass();
        this.a = cb30Var;
        this.b = dq7Var;
        this.c = cb30Var2;
        this.d = function2;
        this.e = kqpVar;
        this.f = m2gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        yd2 yd2Var = (yd2) obj;
        return this.b.equals(yd2Var.b) && Intrinsics.g(this.c, yd2Var.c) && Intrinsics.g(this.a, yd2Var.a);
    }

    public final int hashCode() {
        cb30 cb30Var = this.c;
        int iHashCode = cb30Var != null ? cb30Var.hashCode() : 0;
        return this.a.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.e);
        sb.append(": '");
        sb.append(zgp.a(this.b));
        sb.append('\'');
        cb30 cb30Var = this.c;
        if (cb30Var != null) {
            sb.append(",qualifier:");
            sb.append(cb30Var);
        }
        eae0 eae0Var = zn70.e;
        cb30 cb30Var2 = this.a;
        if (!Intrinsics.g(cb30Var2, eae0Var)) {
            sb.append(",scope:");
            sb.append(cb30Var2);
        }
        if (!this.f.isEmpty()) {
            sb.append(",binds:");
            CollectionsKt.Z(this.f, sb, ",", new xd2(), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
