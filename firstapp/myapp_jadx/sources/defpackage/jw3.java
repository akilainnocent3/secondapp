package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class jw3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public jw3(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw3)) {
            return false;
        }
        jw3 jw3Var = (jw3) obj;
        return this.a == jw3Var.a && this.b == jw3Var.b && this.c == jw3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(cwz.a("BetslipThemeAvailability(canCustomize=", ", newThemeMissionAvailable=", ", themeMissionOngoing=", this.a, this.b), this.c, ")");
    }
}
