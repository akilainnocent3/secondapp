package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class h44 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public h44(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h44)) {
            return false;
        }
        h44 h44Var = (h44) obj;
        return this.a == h44Var.a && this.b == h44Var.b && this.c == h44Var.c && this.d == h44Var.d && this.e == h44Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(gpp.a(this.c, mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("BettingStreakStatus(showNewBadge=", ", enabled=", ", currentStreakDays=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", hasExceededMaxLevel=");
        sbA.append(this.d);
        sbA.append(", showNewBadgeOnAlert=");
        return mq0.a(sbA, this.e, ")");
    }
}
