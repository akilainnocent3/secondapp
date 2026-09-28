package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gq90 implements rn90 {
    public final qcn<nq90> a;

    public gq90(qcn<nq90> qcnVar) {
        qcnVar.getClass();
        this.a = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq90) && Intrinsics.g(this.a, ((gq90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vf5.a(this.a, "SimulationSettlementSummaryContentState(ticketStates=", ")");
    }
}
