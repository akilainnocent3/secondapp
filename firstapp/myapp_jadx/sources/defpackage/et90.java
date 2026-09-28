package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class et90 {
    public static final et90 h;
    public final long a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final BigDecimal g;

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        h = new et90(0L, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal);
    }

    public et90(long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        bigDecimal6.getClass();
        this.a = j;
        this.b = bigDecimal;
        this.c = bigDecimal2;
        this.d = bigDecimal3;
        this.e = bigDecimal4;
        this.f = bigDecimal5;
        this.g = bigDecimal6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et90)) {
            return false;
        }
        et90 et90Var = (et90) obj;
        return this.a == et90Var.a && Intrinsics.g(this.b, et90Var.b) && Intrinsics.g(this.c, et90Var.c) && Intrinsics.g(this.d, et90Var.d) && Intrinsics.g(this.e, et90Var.e) && Intrinsics.g(this.f, et90Var.f) && Intrinsics.g(this.g, et90Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, dd3.a(this.c, dd3.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SingleBetCalculationResult(betCount=" + this.a + ", minOdds=" + this.b + ", totalOdds=" + this.c + ", minStake=" + this.d + ", totalStake=" + this.e + ", minPotentialWin=" + this.f + ", totalPotentialWin=" + this.g + ")";
    }
}
