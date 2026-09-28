package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lmw {
    public static final lmw m;
    public final long a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final BigDecimal g;
    public final BigDecimal h;
    public final BigDecimal i;
    public final BigDecimal j;
    public final BigDecimal k;
    public final float l;

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        m = new lmw(0L, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, bigDecimal, 0.0f);
    }

    public lmw(long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, float f) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        bigDecimal6.getClass();
        bigDecimal7.getClass();
        bigDecimal8.getClass();
        bigDecimal9.getClass();
        bigDecimal10.getClass();
        this.a = j;
        this.b = bigDecimal;
        this.c = bigDecimal2;
        this.d = bigDecimal3;
        this.e = bigDecimal4;
        this.f = bigDecimal5;
        this.g = bigDecimal6;
        this.h = bigDecimal7;
        this.i = bigDecimal8;
        this.j = bigDecimal9;
        this.k = bigDecimal10;
        this.l = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmw)) {
            return false;
        }
        lmw lmwVar = (lmw) obj;
        return this.a == lmwVar.a && Intrinsics.g(this.b, lmwVar.b) && Intrinsics.g(this.c, lmwVar.c) && Intrinsics.g(this.d, lmwVar.d) && Intrinsics.g(this.e, lmwVar.e) && Intrinsics.g(this.f, lmwVar.f) && Intrinsics.g(this.g, lmwVar.g) && Intrinsics.g(this.h, lmwVar.h) && Intrinsics.g(this.i, lmwVar.i) && Intrinsics.g(this.j, lmwVar.j) && Intrinsics.g(this.k, lmwVar.k) && Float.compare(this.l, lmwVar.l) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.l) + dd3.a(this.k, dd3.a(this.j, dd3.a(this.i, dd3.a(this.h, dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, dd3.a(this.c, dd3.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "MultipleBetCalculationResult(betCount=" + this.a + ", minOdds=" + this.b + ", totalOdds=" + this.c + ", minStake=" + this.d + ", totalStake=" + this.e + ", minPotentialWin=" + this.f + ", totalPotentialWin=" + this.g + ", minBonus=" + this.h + ", totalBonus=" + this.i + ", minPotentialWinWithBonus=" + this.j + ", totalPotentialWinWithBonus=" + this.k + ", bonusProgressFraction=" + this.l + ")";
    }
}
