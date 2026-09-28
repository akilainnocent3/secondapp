package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class smc0 {
    public final dnc0 a;
    public final kmc0 b;
    public final qcn<anc0> c;

    public smc0(dnc0 dnc0Var, kmc0 kmc0Var, qcn<anc0> qcnVar) {
        this.a = dnc0Var;
        this.b = kmc0Var;
        this.c = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smc0)) {
            return false;
        }
        smc0 smc0Var = (smc0) obj;
        return this.a.equals(smc0Var.a) && Intrinsics.g(this.b, smc0Var.b) && Intrinsics.g(this.c, smc0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kmc0 kmc0Var = this.b;
        int iHashCode2 = (iHashCode + (kmc0Var == null ? 0 : kmc0Var.hashCode())) * 31;
        qcn<anc0> qcnVar = this.c;
        return iHashCode2 + (qcnVar != null ? qcnVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsStatsCardState(teamInfoState=");
        sb.append(this.a);
        sb.append(", overallAvgScore=");
        sb.append(this.b);
        sb.append(", recordStates=");
        return ts3.a(sb, this.c, ")");
    }
}
