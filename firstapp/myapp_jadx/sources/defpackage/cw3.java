package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cw3 {
    public final zp3 a;
    public final qcn<hw3> b;
    public final km3 c;

    public cw3(zp3 zp3Var, uf00 uf00Var, km3 km3Var) {
        this.a = zp3Var;
        this.b = uf00Var;
        this.c = km3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw3)) {
            return false;
        }
        cw3 cw3Var = (cw3) obj;
        return this.a.equals(cw3Var.a) && Intrinsics.g(this.b, cw3Var.b) && this.c.equals(cw3Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qcn<hw3> qcnVar = this.b;
        return this.c.hashCode() + ((iHashCode + (qcnVar == null ? 0 : qcnVar.hashCode())) * 31);
    }

    public final String toString() {
        return "BetslipState(headerState=" + this.a + ", tabStates=" + this.b + ", contentState=" + this.c + ")";
    }
}
