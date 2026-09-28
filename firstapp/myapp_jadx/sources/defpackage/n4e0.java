package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class n4e0 {
    public final int a;
    public final int b;
    public final o4e0 c;

    public n4e0(int i, int i2, o4e0 o4e0Var) {
        this.a = i;
        this.b = i2;
        this.c = o4e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4e0)) {
            return false;
        }
        n4e0 n4e0Var = (n4e0) obj;
        return this.a == n4e0Var.a && this.b == n4e0Var.b && this.c == n4e0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("StreakDayDisplayData(dayOfWeekRes=", this.a, this.b, ", statusIconRes=", ", status=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
