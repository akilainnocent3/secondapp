package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class jmc0 {
    public final cnc0 a;
    public final cnc0 b;

    public jmc0(cnc0 cnc0Var, cnc0 cnc0Var2) {
        this.a = cnc0Var;
        this.b = cnc0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmc0)) {
            return false;
        }
        jmc0 jmc0Var = (jmc0) obj;
        return this.a.equals(jmc0Var.a) && this.b.equals(jmc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsStats(homeTeam=" + this.a + ", awayTeam=" + this.b + ")";
    }
}
