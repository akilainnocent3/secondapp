package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class vci {
    public final String a;
    public final bz3 b;
    public final int c;

    public vci(String str, bz3 bz3Var, int i) {
        this.a = str;
        this.b = bz3Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vci)) {
            return false;
        }
        vci vciVar = (vci) obj;
        return this.a.equals(vciVar.a) && this.b == vciVar.b && this.c == vciVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FootballFamilySettlementOutcomeTicketTag(outcomeId=");
        sb.append(this.a);
        sb.append(", betslipType=");
        sb.append(this.b);
        sb.append(", displayNumber=");
        return zk1.a(this.c, ")", sb);
    }
}
