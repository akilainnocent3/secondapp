package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class u14 {
    public final t6e0 a;
    public final int b;

    public u14(t6e0 t6e0Var, int i) {
        this.a = t6e0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u14)) {
            return false;
        }
        u14 u14Var = (u14) obj;
        return this.a == u14Var.a && this.b == u14Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BettingStreakLevelConfig(level=" + this.a + ", streakDays=" + this.b + ")";
    }
}
