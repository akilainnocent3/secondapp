package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class lsf0 extends uj4 {
    public final String a;
    public final b3 b;
    public final Double c;

    public lsf0(String str, b3 b3Var, Double d) {
        str.getClass();
        b3Var.getClass();
        this.a = str;
        this.b = b3Var;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsf0)) {
            return false;
        }
        lsf0 lsf0Var = (lsf0) obj;
        return Intrinsics.g(this.a, lsf0Var.a) && Intrinsics.g(this.b, lsf0Var.b) && Intrinsics.g(this.c, lsf0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Double d = this.c;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TierNotReached(gameName=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", maxReward=");
        return itu.a(sb, this.c, ')');
    }
}
