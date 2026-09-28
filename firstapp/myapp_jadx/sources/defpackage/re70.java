package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class re70 implements rd70 {
    public final qcn<le70> a;

    public re70(qcn<le70> qcnVar) {
        qcnVar.getClass();
        this.a = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re70) && Intrinsics.g(this.a, ((re70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vf5.a(this.a, "ScheduledFootballOverviewStatsMatchResultsContentState(cellStates=", ")");
    }
}
