package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class vr4 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final long e;
    public final boolean f;

    public vr4(int i, boolean z, boolean z2, int i2, long j, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = j;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr4)) {
            return false;
        }
        vr4 vr4Var = (vr4) obj;
        return this.a == vr4Var.a && this.b == vr4Var.b && this.c == vr4Var.c && this.d == vr4Var.d && this.e == vr4Var.e && this.f == vr4Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + f87.a(mtg0.a(gpp.a(this.d, mtg0.a(mtg0.a(gpp.a(this.a, Boolean.hashCode(false) * 31, 31), 31, this.b), 31, this.c), 31), 31, true), this.e, 31);
    }

    public final String toString() {
        return "BonusRequest(isOverMaxBonus=false, betType=" + this.a + ", isExistBonus=" + this.b + ", isBonusActivated=" + this.c + ", count=" + this.d + ", isRefresh=true, timeStamp=" + this.e + ", isSliding=" + this.f + ")";
    }
}
