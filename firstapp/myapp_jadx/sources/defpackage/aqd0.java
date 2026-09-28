package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class aqd0 {
    public final double a;
    public final int b;
    public final String c;
    public final wmd0 d;
    public final and0 e;

    public aqd0(int i) {
        this(0.0d, -1, "", new wmd0(n1a0.c), and0.a);
    }

    public static aqd0 a(aqd0 aqd0Var, double d, int i, String str, wmd0 wmd0Var, and0 and0Var, int i2) {
        if ((i2 & 1) != 0) {
            d = aqd0Var.a;
        }
        double d2 = d;
        if ((i2 & 2) != 0) {
            i = aqd0Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = aqd0Var.c;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            wmd0Var = aqd0Var.d;
        }
        wmd0 wmd0Var2 = wmd0Var;
        if ((i2 & 16) != 0) {
            and0Var = aqd0Var.e;
        }
        and0 and0Var2 = and0Var;
        aqd0Var.getClass();
        str2.getClass();
        wmd0Var2.getClass();
        and0Var2.getClass();
        return new aqd0(d2, i3, str2, wmd0Var2, and0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqd0)) {
            return false;
        }
        aqd0 aqd0Var = (aqd0) obj;
        return Double.compare(this.a, aqd0Var.a) == 0 && this.b == aqd0Var.b && Intrinsics.g(this.c, aqd0Var.c) && Intrinsics.g(this.d, aqd0Var.d) && this.e == aqd0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + shu.a(this.d.a, gmf0.a(gpp.a(this.b, Double.hashCode(this.a) * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        return "StackerUIState(totalReward=" + this.a + ", collapsingRowIndex=" + this.b + ", rewardCurrency=" + this.c + ", stackerBoardGameState=" + this.d + ", stackerState=" + this.e + ')';
    }

    public aqd0(double d, int i, String str, wmd0 wmd0Var, and0 and0Var) {
        this.a = d;
        this.b = i;
        this.c = str;
        this.d = wmd0Var;
        this.e = and0Var;
    }

    public aqd0() {
        this(0);
    }
}
