package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class e5d0 {
    public final d5d0 a;
    public final String b;
    public final String c;

    public e5d0(d5d0 d5d0Var, String str, String str2) {
        this.a = d5d0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5d0)) {
            return false;
        }
        e5d0 e5d0Var = (e5d0) obj;
        return this.a.equals(e5d0Var.a) && this.b.equals(e5d0Var.b) && this.c.equals(e5d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyPenaltyStatsRecordState(resultState=");
        sb.append(this.a);
        sb.append(", resultText=");
        sb.append(this.b);
        sb.append(", opponentLogoUrl=");
        return uf80.a(sb, this.c, ")");
    }
}
