package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ici {
    public final String a;
    public final qcn<gci> b;

    public ici(qcn qcnVar, String str) {
        qcnVar.getClass();
        this.a = str;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ici)) {
            return false;
        }
        ici iciVar = (ici) obj;
        return this.a.equals(iciVar.a) && Intrinsics.g(this.b, iciVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FootballFamilySettlementFillingEvent(titleText=" + this.a + ", eventStates=" + this.b + ")";
    }
}
