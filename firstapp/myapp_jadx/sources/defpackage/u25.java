package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class u25 {
    public final v25 a;
    public final v25 b;
    public final v25 c;

    public u25(v25 v25Var, v25 v25Var2, v25 v25Var3) {
        this.a = v25Var;
        this.b = v25Var2;
        this.c = v25Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u25)) {
            return false;
        }
        u25 u25Var = (u25) obj;
        return this.a.equals(u25Var.a) && this.b.equals(u25Var.b) && this.c.equals(u25Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BoostRakebackData(realSport=" + this.a + ", iv=" + this.b + ", game=" + this.c + ")";
    }
}
