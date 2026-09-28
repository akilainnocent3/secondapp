package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class mhh0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public mhh0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhh0)) {
            return false;
        }
        mhh0 mhh0Var = (mhh0) obj;
        return this.a == mhh0Var.a && this.b == mhh0Var.b && this.c == mhh0Var.c && this.d == mhh0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return lng.a(", hasActivatedTwoUp=", ")", cwz.a("UpBetslipState(supportsOneUp=", ", supportsTwoUp=", ", hasActivatedOneUp=", this.a, this.b), this.c, this.d);
    }
}
