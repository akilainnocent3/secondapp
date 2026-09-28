package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class p5d0 implements Serializable {
    public final String a;
    public final String b;
    public final String c;

    public p5d0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5d0)) {
            return false;
        }
        p5d0 p5d0Var = (p5d0) obj;
        return this.a.equals(p5d0Var.a) && this.b.equals(p5d0Var.b) && this.c.equals(p5d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("SportyPenaltyTicketBetDetail(eventId=", this.a, ", marketId=", this.b, ", outcomeId="), this.c, ")");
    }
}
