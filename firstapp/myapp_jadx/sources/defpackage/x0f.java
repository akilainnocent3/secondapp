package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x0f {
    public final String a;
    public final int b;
    public final int c;
    public final BigDecimal d;
    public final y0f e;
    public final a3f f;

    public x0f(String str, int i, int i2, BigDecimal bigDecimal, y0f y0fVar, a3f a3fVar) {
        bigDecimal.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = bigDecimal;
        this.e = y0fVar;
        this.f = a3fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0f)) {
            return false;
        }
        x0f x0fVar = (x0f) obj;
        return this.a.equals(x0fVar.a) && this.b == x0fVar.b && this.c == x0fVar.c && Intrinsics.g(this.d, x0fVar.d) && Intrinsics.g(this.e, x0fVar.e) && Intrinsics.g(this.f, x0fVar.f);
    }

    public final int hashCode() {
        int iA = dd3.a(this.d, gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        y0f y0fVar = this.e;
        int iHashCode = (iA + (y0fVar == null ? 0 : y0fVar.a.hashCode())) * 31;
        a3f a3fVar = this.f;
        return iHashCode + (a3fVar != null ? a3fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "DoubleOrNothingCreateAndSettleResult(challengeId=", this.a, ", roundNumber=", ", maxRounds=");
        sbA.append(this.c);
        sbA.append(", odds=");
        sbA.append(this.d);
        sbA.append(", currentRoundResult=");
        sbA.append(this.e);
        sbA.append(", nextRoundState=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
