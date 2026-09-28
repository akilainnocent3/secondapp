package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kd70 {
    public final ve70 a;
    public final qcn<ld70> b;
    public final sd70 c;

    public kd70(ve70 ve70Var, qcn<ld70> qcnVar, sd70 sd70Var) {
        qcnVar.getClass();
        this.a = ve70Var;
        this.b = qcnVar;
        this.c = sd70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd70)) {
            return false;
        }
        kd70 kd70Var = (kd70) obj;
        return this.a == kd70Var.a && Intrinsics.g(this.b, kd70Var.b) && this.c.equals(kd70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shu.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ScheduledFootballOverviewStatsBottomSheetState(selectedOverviewStatsType=" + this.a + ", overviewStatsChipStates=" + this.b + ", overviewStatsContentStatus=" + this.c + ")";
    }
}
