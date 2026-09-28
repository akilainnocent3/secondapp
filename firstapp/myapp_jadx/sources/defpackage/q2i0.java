package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class q2i0 {
    public final d6f0 a;
    public final d6f0 b;

    public q2i0(d6f0 d6f0Var, d6f0 d6f0Var2) {
        this.a = d6f0Var;
        this.b = d6f0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2i0)) {
            return false;
        }
        q2i0 q2i0Var = (q2i0) obj;
        return this.a.equals(q2i0Var.a) && this.b.equals(q2i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VersusInfo(homeTeamBasicInfo=" + this.a + ", awayTeamBasicInfo=" + this.b + ")";
    }
}
