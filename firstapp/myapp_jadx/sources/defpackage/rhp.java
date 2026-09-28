package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes8.dex */
public final class rhp implements qhp {
    public final qhp a;

    public rhp(qhp qhpVar) {
        qhpVar.getClass();
        this.a = qhpVar;
    }

    @Override // defpackage.qhp
    public final List<KTypeProjection> a() {
        return this.a.a();
    }

    @Override // defpackage.qhp
    public final boolean b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        rhp rhpVar = obj instanceof rhp ? (rhp) obj : null;
        qhp qhpVar = rhpVar != null ? rhpVar.a : null;
        qhp qhpVar2 = this.a;
        if (!Intrinsics.g(qhpVar2, qhpVar)) {
            return false;
        }
        ygp ygpVarG = qhpVar2.g();
        if (!(ygpVarG instanceof ygp)) {
            return false;
        }
        qhp qhpVar3 = obj instanceof qhp ? (qhp) obj : null;
        ygp ygpVarG2 = qhpVar3 != null ? qhpVar3.g() : null;
        if (ygpVarG2 == null || !(ygpVarG2 instanceof ygp)) {
            return false;
        }
        return tgp.b(ygpVarG).equals(tgp.b(ygpVarG2));
    }

    @Override // defpackage.qhp
    public final ygp g() {
        return this.a.g();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
