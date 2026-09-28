package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hp1 {
    public final ip1 a;
    public final ip1 b;
    public final int c;

    public hp1(ip1 ip1Var, ip1 ip1Var2, int i) {
        this.a = ip1Var;
        this.b = ip1Var2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp1)) {
            return false;
        }
        hp1 hp1Var = (hp1) obj;
        return this.a.equals(hp1Var.a) && this.b.equals(hp1Var.b) && this.c == hp1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AverageGoalsScoredState(homeTeam=");
        sb.append(this.a);
        sb.append(", awayTeam=");
        sb.append(this.b);
        sb.append(", labelTextColorResId=");
        return zk1.a(this.c, ")", sb);
    }
}
