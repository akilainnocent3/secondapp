package defpackage;

import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w1f {
    public final String a;
    public final int b;
    public final int c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final BigDecimal g;
    public final int h;
    public final int i;

    public w1f(String str, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i3, int i4) {
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
        if (!(obj instanceof w1f)) {
            return false;
        }
        w1f w1fVar = (w1f) obj;
        return this.a.equals(w1fVar.a) && this.b == w1fVar.b && this.c == w1fVar.c && Intrinsics.g(this.d, w1fVar.d) && Intrinsics.g(this.e, w1fVar.e) && Intrinsics.g(this.f, w1fVar.f) && Intrinsics.g(this.g, w1fVar.g) && this.h == w1fVar.h && this.i == w1fVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + gpp.a(this.h, dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "DoubleOrNothingInfo(challengeId=", this.a, ", currentRoundNumber=", ", maxRounds=");
        sbA.append(this.c);
        sbA.append(", odds=");
        sbA.append(this.d);
        sbA.append(", baseAmount=");
        iib0.b(sbA, this.e, ", minStake=", this.f, ", maxStake=");
        sbA.append(this.g);
        sbA.append(", countdownDuration=");
        sbA.append(this.h);
        sbA.append(QQWMbKFOuTf.sjIOyFKR);
        return zk1.a(this.i, ")", sbA);
    }
}
