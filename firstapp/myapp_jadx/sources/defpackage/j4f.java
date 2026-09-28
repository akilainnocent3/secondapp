package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j4f {
    public final String a;
    public final int b;
    public final int c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final BigDecimal g;
    public final int h;
    public final int i;

    public j4f(String str, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i3, int i4) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = bigDecimal3;
        this.g = bigDecimal4;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4f)) {
            return false;
        }
        j4f j4fVar = (j4f) obj;
        return this.a.equals(j4fVar.a) && this.b == j4fVar.b && this.c == j4fVar.c && Intrinsics.g(this.d, j4fVar.d) && Intrinsics.g(this.e, j4fVar.e) && Intrinsics.g(this.f, j4fVar.f) && Intrinsics.g(this.g, j4fVar.g) && this.h == j4fVar.h && this.i == j4fVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + gpp.a(this.h, dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "DoubleOrNothingRoundInfo(challengeId=", this.a, ", roundNumber=", ", maxRounds=");
        sbA.append(this.c);
        sbA.append(", odds=");
        sbA.append(this.d);
        sbA.append(", baseAmount=");
        iib0.b(sbA, this.e, ", minStake=", this.f, ", maxStake=");
        sbA.append(this.g);
        sbA.append(", countdownDuration=");
        sbA.append(this.h);
        sbA.append(", kickCountdownDuration=");
        return zk1.a(this.i, ")", sbA);
    }
}
