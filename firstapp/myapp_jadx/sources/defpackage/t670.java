package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t670 implements l670 {
    public final slv a;
    public final qcn<klv> b;

    public t670(slv slvVar, qcn<klv> qcnVar) {
        qcnVar.getClass();
        this.a = slvVar;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t670)) {
            return false;
        }
        t670 t670Var = (t670) obj;
        return this.a.equals(t670Var.a) && Intrinsics.g(this.b, t670Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScheduledFootballHeadToHeadStatsPreviousMeetingsInfoState(meetingSummaryState=" + this.a + ", meetingMatchesRecords=" + this.b + ")";
    }
}
