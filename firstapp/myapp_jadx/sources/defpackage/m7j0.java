package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class m7j0 {
    public final d6f0 a;
    public final int b;
    public final d6f0 c;
    public final int d;

    public m7j0(d6f0 d6f0Var, int i, d6f0 d6f0Var2, int i2) {
        this.a = d6f0Var;
        this.b = i;
        this.c = d6f0Var2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7j0)) {
            return false;
        }
        m7j0 m7j0Var = (m7j0) obj;
        return this.a.equals(m7j0Var.a) && this.b == m7j0Var.b && this.c.equals(m7j0Var.c) && this.d == m7j0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "WinProbability(homeTeamBasicInfo=" + this.a + ", homeTeamWinProbability=" + this.b + ", awayTeamBasicInfo=" + this.c + ", awayTeamWinProbability=" + this.d + ")";
    }
}
