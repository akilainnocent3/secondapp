package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jwv {
    public final uf00<kwv> a;
    public final boolean b;
    public final yg00<Integer> c;
    public final yg00<Integer> d;
    public final int e;
    public final int f;
    public final Integer g;
    public final Integer h;

    public jwv(uf00<kwv> uf00Var, boolean z, yg00<Integer> yg00Var, yg00<Integer> yg00Var2, int i, int i2, Integer num, Integer num2) {
        uf00Var.getClass();
        yg00Var.getClass();
        yg00Var2.getClass();
        this.a = uf00Var;
        this.b = z;
        this.c = yg00Var;
        this.d = yg00Var2;
        this.e = i;
        this.f = i2;
        this.g = num;
        this.h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwv)) {
            return false;
        }
        jwv jwvVar = (jwv) obj;
        return Intrinsics.g(this.a, jwvVar.a) && this.b == jwvVar.b && Intrinsics.g(this.c, jwvVar.c) && Intrinsics.g(this.d, jwvVar.d) && this.e == jwvVar.e && this.f == jwvVar.f && Intrinsics.g(this.g, jwvVar.g) && Intrinsics.g(this.h, jwvVar.h);
    }

    public final int hashCode() {
        int iA = gpp.a(this.f, gpp.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31), 31);
        Integer num = this.g;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionUIState(missionUiDataList=");
        sb.append(this.a);
        sb.append(", hasPublishedMission=");
        sb.append(this.b);
        sb.append(", expandedRulesMissionIds=");
        sb.append(this.c);
        sb.append(", processingMissionIds=");
        sb.append(this.d);
        sb.append(", onGoingCount=");
        d5d.a(sb, this.e, ", completedCount=", this.f, ", firstBetslipThemeMissionId=");
        sb.append(this.g);
        sb.append(", firstOngoingBetslipThemeMissionId=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public jwv() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jwv(int i) {
        n1a0 n1a0Var = n1a0.c;
        pg00 pg00Var = pg00.e;
        this(n1a0Var, false, pg00Var, pg00Var, 0, 0, null, null);
    }
}
