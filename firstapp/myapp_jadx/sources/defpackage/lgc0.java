package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class lgc0 {
    public final enc0 a;
    public final enc0 b;

    public lgc0(enc0 enc0Var, enc0 enc0Var2) {
        this.a = enc0Var;
        this.b = enc0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgc0)) {
            return false;
        }
        lgc0 lgc0Var = (lgc0) obj;
        return this.a.equals(lgc0Var.a) && this.b.equals(lgc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsRecommendedMatch(homeTeam=" + this.a + ", awayTeam=" + this.b + ")";
    }
}
