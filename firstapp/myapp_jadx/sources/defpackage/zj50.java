package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zj50 {
    public final String a;
    public final Long b;
    public final boolean c;
    public final boolean d;
    public final double e;
    public final String f;
    public final String g;
    public final double h;
    public final ap20 i;
    public final uf00<dp20> j;
    public final Double k;
    public final Double l;

    public zj50(String str, Long l, boolean z, boolean z2, double d, String str2, String str3, double d2, ap20 ap20Var, uf00<dp20> uf00Var, Double d3, Double d4) {
        uf00Var.getClass();
        this.a = str;
        this.b = l;
        this.c = z;
        this.d = z2;
        this.e = d;
        this.f = str2;
        this.g = str3;
        this.h = d2;
        this.i = ap20Var;
        this.j = uf00Var;
        this.k = d3;
        this.l = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj50)) {
            return false;
        }
        zj50 zj50Var = (zj50) obj;
        return Intrinsics.g(this.a, zj50Var.a) && Intrinsics.g(this.b, zj50Var.b) && this.c == zj50Var.c && this.d == zj50Var.d && Double.compare(this.e, zj50Var.e) == 0 && Intrinsics.g(this.f, zj50Var.f) && Intrinsics.g(this.g, zj50Var.g) && Double.compare(this.h, zj50Var.h) == 0 && this.i == zj50Var.i && Intrinsics.g(this.j, zj50Var.j) && Intrinsics.g(this.k, zj50Var.k) && Intrinsics.g(this.l, zj50Var.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iA = yvz.a(this.j, (this.i.hashCode() + nrg0.a(gmf0.a(gmf0.a(nrg0.a(mtg0.a(mtg0.a((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31);
        Double d = this.k;
        int iHashCode2 = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.l;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultScreenData(nextRoundRoomName=");
        sb.append(this.a);
        sb.append(", nextRoundRoomConfigId=");
        sb.append(this.b);
        sb.append(", prizeWon=");
        sb.append(this.c);
        sb.append(", isWinner=");
        sb.append(this.d);
        sb.append(", amountWon=");
        sb.append(this.e);
        sb.append(", currency=");
        sb.append(this.f);
        sb.append(", winnerUsername=");
        sb.append(this.g);
        sb.append(", feeForNextRound=");
        sb.append(this.h);
        sb.append(", pigType=");
        sb.append(this.i);
        sb.append(", sessionCards=");
        sb.append(this.j);
        sb.append(", bonusWinAmount=");
        sb.append(this.k);
        sb.append(", goldRainAmount=");
        return itu.a(sb, this.l, ')');
    }

    public zj50() {
        this(0);
    }

    public zj50(int i) {
        this("", null, false, false, 0.0d, "", "", 0.0d, ap20.b, n1a0.c, null, null);
    }
}
