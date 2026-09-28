package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ssf0 extends bj4 {
    public final qsf0 a;
    public final Double b;

    public ssf0(qsf0 qsf0Var, Double d) {
        qsf0Var.getClass();
        this.a = qsf0Var;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssf0)) {
            return false;
        }
        ssf0 ssf0Var = (ssf0) obj;
        return Intrinsics.g(this.a, ssf0Var.a) && Intrinsics.g(this.b, ssf0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Double d = this.b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TierNotReachedDialog(data=");
        sb.append(this.a);
        sb.append(", maxReward=");
        return itu.a(sb, this.b, ')');
    }
}
