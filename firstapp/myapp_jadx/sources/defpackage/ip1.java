package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ip1 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public ip1(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip1)) {
            return false;
        }
        ip1 ip1Var = (ip1) obj;
        return Float.compare(this.a, ip1Var.a) == 0 && Float.compare(this.b, ip1Var.b) == 0 && Float.compare(this.c, ip1Var.c) == 0 && this.d == ip1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AverageGoalsScoredTeam(overallScore=" + this.a + ", homeScore=" + this.b + ", awayScore=" + this.c + ", colorResId=" + this.d + ")";
    }
}
