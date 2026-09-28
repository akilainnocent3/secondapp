package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a3f {
    public final int a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final int e;
    public final int f;

    public a3f(int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i2, int i3) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        this.a = i;
        this.b = bigDecimal;
        this.c = bigDecimal2;
        this.d = bigDecimal3;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3f)) {
            return false;
        }
        a3f a3fVar = (a3f) obj;
        return this.a == a3fVar.a && Intrinsics.g(this.b, a3fVar.b) && Intrinsics.g(this.c, a3fVar.c) && Intrinsics.g(this.d, a3fVar.d) && this.e == a3fVar.e && this.f == a3fVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + gpp.a(this.e, dd3.a(this.d, dd3.a(this.c, dd3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleOrNothingNextRoundState(roundNumber=");
        sb.append(this.a);
        sb.append(", baseAmount=");
        sb.append(this.b);
        sb.append(", minStake=");
        iib0.b(sb, this.c, ", maxStake=", this.d, ", countdownDuration=");
        return b7f.a(sb, this.e, ", kickCountdownDuration=", this.f, ")");
    }
}
