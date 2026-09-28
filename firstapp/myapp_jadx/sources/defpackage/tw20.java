package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tw20 extends bnj {
    public final Double a;
    public final Double b;

    public tw20(Double d, Double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw20)) {
            return false;
        }
        tw20 tw20Var = (tw20) obj;
        return Intrinsics.g(this.a, tw20Var.a) && Intrinsics.g(this.b, tw20Var.b);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrizeLost(bonusWinAmount=");
        sb.append(this.a);
        sb.append(", goldRainAmount=");
        return itu.a(sb, this.b, ')');
    }
}
