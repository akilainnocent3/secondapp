package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cr90 {
    public final qcn<br90> a;

    public cr90(qcn<br90> qcnVar) {
        qcnVar.getClass();
        this.a = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr90) && Intrinsics.g(this.a, ((cr90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vf5.a(this.a, "SimulationTicketDetailContentState(itemStates=", ")");
    }
}
