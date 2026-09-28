package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nq90 {
    public final String a;
    public final String b;
    public final jo90 c;
    public final bo90 d;
    public final Integer e;
    public final qcn<ao90> f;

    public nq90(String str, String str2, jo90 jo90Var, bo90 bo90Var, Integer num, qcn<ao90> qcnVar) {
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = jo90Var;
        this.d = bo90Var;
        this.e = num;
        this.f = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq90)) {
            return false;
        }
        nq90 nq90Var = (nq90) obj;
        return this.a.equals(nq90Var.a) && this.b.equals(nq90Var.b) && Intrinsics.g(this.c, nq90Var.c) && this.d == nq90Var.d && Intrinsics.g(this.e, nq90Var.e) && Intrinsics.g(this.f, nq90Var.f);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        jo90 jo90Var = this.c;
        int iHashCode = (this.d.hashCode() + ((iA + (jo90Var == null ? 0 : jo90Var.hashCode())) * 31)) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationSettlementSummaryTicketState(ticketId=", this.a, ", titleText=", this.b, ", insureState=");
        sbA.append(this.c);
        sbA.append(", expansionState=");
        sbA.append(this.d);
        sbA.append(", wonIconResId=");
        sbA.append(this.e);
        sbA.append(", eventStates=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
