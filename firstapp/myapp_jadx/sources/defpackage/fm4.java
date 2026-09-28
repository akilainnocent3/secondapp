package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fm4 {
    public final fp4 a;
    public final Integer b;
    public final Double c;
    public final Double d;

    public fm4(fp4 fp4Var, Integer num, Double d, Double d2) {
        this.a = fp4Var;
        this.b = num;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm4)) {
            return false;
        }
        fm4 fm4Var = (fm4) obj;
        return Intrinsics.g(this.a, fm4Var.a) && Intrinsics.g(this.b, fm4Var.b) && Intrinsics.g(this.c, fm4Var.c) && Intrinsics.g(this.d, fm4Var.d);
    }

    public final int hashCode() {
        fp4 fp4Var = this.a;
        int iHashCode = (fp4Var == null ? 0 : fp4Var.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupGameplayUpdate(spawnObject=");
        sb.append(this.a);
        sb.append(", timerSeconds=");
        sb.append(this.b);
        sb.append(", accumulatedReward=");
        sb.append(this.c);
        sb.append(", rewardDelta=");
        return itu.a(sb, this.d, ')');
    }
}
