package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class zl2 {
    public final boolean a;
    public final boolean b;
    public final int c;

    public zl2(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2)) {
            return false;
        }
        zl2 zl2Var = (zl2) obj;
        return this.a == zl2Var.a && this.b == zl2Var.b && this.c == zl2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return zk1.a(this.c, ")", cwz.a("BetData(isFlexBet=", ", isAnyWin=", ", minToWin=", this.a, this.b));
    }
}
