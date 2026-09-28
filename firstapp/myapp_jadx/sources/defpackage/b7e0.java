package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class b7e0 {
    public final t6e0 a;
    public final int b;
    public final double c;

    public b7e0(t6e0 t6e0Var, int i, double d) {
        this.a = t6e0Var;
        this.b = i;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7e0)) {
            return false;
        }
        b7e0 b7e0Var = (b7e0) obj;
        return this.a == b7e0Var.a && this.b == b7e0Var.b && Double.compare(this.c, b7e0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StreakMilestone(level=" + this.a + ", daysRequired=" + this.b + ", multiplier=" + this.c + ")";
    }
}
