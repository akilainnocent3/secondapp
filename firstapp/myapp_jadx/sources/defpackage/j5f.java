package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class j5f {
    public final int a;
    public final k5f b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public j5f(int i, k5f k5fVar, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = k5fVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5f)) {
            return false;
        }
        j5f j5fVar = (j5f) obj;
        return this.a == j5fVar.a && this.b == j5fVar.b && this.c.equals(j5fVar.c) && this.d.equals(j5fVar.d) && this.e.equals(j5fVar.e) && this.f.equals(j5fVar.f) && this.g.equals(j5fVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleOrNothingTicketDetailRoundCardState(roundNumber=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", baseAmountText=");
        hxa.c(sb, this.c, ", cashoutAmountText=", this.d, ", stakeAmountText=");
        hxa.c(sb, this.e, ", roundBalanceText=", this.f, ", ticketIdText=");
        return uf80.a(sb, this.g, ")");
    }
}
