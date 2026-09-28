package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class vyc0 {
    public final String a;
    public final xxc0 b;
    public final nxc0 c;

    public vyc0(String str, xxc0 xxc0Var, nxc0 nxc0Var) {
        this.a = str;
        this.b = xxc0Var;
        this.c = nxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vyc0) {
            vyc0 vyc0Var = (vyc0) obj;
            if (this.a.equals(vyc0Var.a) && this.b == vyc0Var.b && this.c.equals(vyc0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SportyPenaltyMarketState(marketType=" + this.a + ", headerState=" + this.b + ", contentState=" + this.c + ")";
    }
}
