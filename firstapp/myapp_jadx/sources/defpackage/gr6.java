package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gr6 {
    public final double a;
    public final double b;
    public final double c;
    public final Double d;
    public final Double e;
    public final boolean f;
    public final boolean g;
    public final Double h;
    public final Double i;

    public gr6(double d, double d2, double d3, Double d4, Double d5, boolean z, boolean z2, Double d6, Double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = z;
        this.g = z2;
        this.h = d6;
        this.i = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr6)) {
            return false;
        }
        gr6 gr6Var = (gr6) obj;
        return Double.compare(this.a, gr6Var.a) == 0 && Double.compare(this.b, gr6Var.b) == 0 && Double.compare(this.c, gr6Var.c) == 0 && Intrinsics.g(this.d, gr6Var.d) && Intrinsics.g(this.e, gr6Var.e) && this.f == gr6Var.f && this.g == gr6Var.g && Intrinsics.g(this.h, gr6Var.h) && Intrinsics.g(this.i, gr6Var.i);
    }

    public final int hashCode() {
        int iA = nrg0.a(nrg0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Double d = this.d;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iA2 = mtg0.a(mtg0.a((iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.f), 31, this.g);
        Double d3 = this.h;
        int iHashCode2 = (iA2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.i;
        return iHashCode2 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ffp.a(this.a, "CashoutResult(amount=", ", winAmount=");
        sbA.append(this.b);
        hib0.b(this.c, ", payoutAmount=", ", giftAmount=", sbA);
        s27.a(this.d, this.e, ", bonusAmount=", ", showGift=", sbA);
        nng.a(", showBonus=", ", turboBonusAmount=", sbA, this.f, this.g);
        sbA.append(this.h);
        sbA.append(", payoutWithoutTurboBonusAmount=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
