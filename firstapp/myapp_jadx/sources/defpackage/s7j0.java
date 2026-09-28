package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class s7j0 {
    public final t7j0 a;
    public final t7j0 b;
    public final int c;
    public final int d;

    public s7j0(t7j0 t7j0Var, t7j0 t7j0Var2, int i, int i2) {
        this.a = t7j0Var;
        this.b = t7j0Var2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7j0)) {
            return false;
        }
        s7j0 s7j0Var = (s7j0) obj;
        return this.a.equals(s7j0Var.a) && this.b.equals(s7j0Var.b) && this.c == s7j0Var.c && this.d == s7j0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinProbabilityState(homeTeam=");
        sb.append(this.a);
        sb.append(", awayTeam=");
        sb.append(this.b);
        sb.append(", drawProbability=");
        return b7f.a(sb, this.c, ", tickBarBackgroundColorResId=", this.d, ")");
    }
}
