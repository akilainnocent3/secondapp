package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n4d0 {
    public final m4d0 a;
    public final qcn<e5d0> b;

    public n4d0(m4d0 m4d0Var, qcn<e5d0> qcnVar) {
        this.a = m4d0Var;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4d0)) {
            return false;
        }
        n4d0 n4d0Var = (n4d0) obj;
        return Intrinsics.g(this.a, n4d0Var.a) && Intrinsics.g(this.b, n4d0Var.b);
    }

    public final int hashCode() {
        m4d0 m4d0Var = this.a;
        int iHashCode = (m4d0Var == null ? 0 : m4d0Var.hashCode()) * 31;
        qcn<e5d0> qcnVar = this.b;
        return iHashCode + (qcnVar != null ? qcnVar.hashCode() : 0);
    }

    public final String toString() {
        return "SportyPenaltyStatsCardState(averageGoalsState=" + this.a + ", recordStates=" + this.b + ")";
    }
}
