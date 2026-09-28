package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class sye {
    public final long a;
    public final double b;
    public final cs50 c;
    public final String d;

    public sye(long j, double d, cs50 cs50Var, String str) {
        this.a = j;
        this.b = d;
        this.c = cs50Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sye)) {
            return false;
        }
        sye syeVar = (sye) obj;
        return this.a == syeVar.a && Double.compare(this.b, syeVar.b) == 0 && this.c == syeVar.c && this.d.equals(syeVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + nrg0.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DomainReward(playerId=");
        sb.append(this.a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", rewardType=");
        sb.append(this.c);
        sb.append(", currency=");
        return j26.a(sb, this.d, ')');
    }
}
