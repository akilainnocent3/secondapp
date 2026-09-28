package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class uw20 extends bnj {
    public final double a;
    public final String b;
    public final boolean c;
    public final String d;
    public final Double e;
    public final Double f;

    public uw20(double d, String str, boolean z, String str2, Double d2, Double d3) {
        this.a = d;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = d2;
        this.f = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw20)) {
            return false;
        }
        uw20 uw20Var = (uw20) obj;
        return Double.compare(this.a, uw20Var.a) == 0 && Intrinsics.g(this.b, uw20Var.b) && this.c == uw20Var.c && Intrinsics.g(this.d, uw20Var.d) && Intrinsics.g(this.e, uw20Var.e) && Intrinsics.g(this.f, uw20Var.f);
    }

    public final int hashCode() {
        int iA = mtg0.a(gmf0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.e;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrizeWon(amountWon=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", isWinner=");
        sb.append(this.c);
        sb.append(", winnerUsername=");
        sb.append(this.d);
        sb.append(", bonusWinAmount=");
        sb.append(this.e);
        sb.append(", goldRainAmount=");
        return itu.a(sb, this.f, ')');
    }
}
