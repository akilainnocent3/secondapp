package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s0f {
    public final int a;
    public final BigDecimal b;
    public final int c;
    public final BigDecimal d;

    public s0f(int i, BigDecimal bigDecimal, int i2, BigDecimal bigDecimal2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        this.a = i;
        this.b = bigDecimal;
        this.c = i2;
        this.d = bigDecimal2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0f)) {
            return false;
        }
        s0f s0fVar = (s0f) obj;
        return this.a == s0fVar.a && Intrinsics.g(this.b, s0fVar.b) && this.c == s0fVar.c && Intrinsics.g(this.d, s0fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gpp.a(this.c, dd3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "DoubleOrNothingCashoutResult(roundNumber=" + this.a + ", totalReturn=" + this.b + ", maxRounds=" + this.c + ", odds=" + this.d + ")";
    }
}
