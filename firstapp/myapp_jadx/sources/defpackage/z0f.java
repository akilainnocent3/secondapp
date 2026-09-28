package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z0f {
    public final String a;
    public final BigDecimal b;
    public final int c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final long f;
    public final List<a1f> g;

    public z0f(String str, BigDecimal bigDecimal, int i, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, List<a1f> list) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        list.getClass();
        this.a = str;
        this.b = bigDecimal;
        this.c = i;
        this.d = bigDecimal2;
        this.e = bigDecimal3;
        this.f = j;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0f)) {
            return false;
        }
        z0f z0fVar = (z0f) obj;
        return this.a.equals(z0fVar.a) && Intrinsics.g(this.b, z0fVar.b) && this.c == z0fVar.c && Intrinsics.g(this.d, z0fVar.d) && Intrinsics.g(this.e, z0fVar.e) && this.f == z0fVar.f && Intrinsics.g(this.g, z0fVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + f87.a(dd3.a(this.e, dd3.a(this.d, gpp.a(this.c, dd3.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "DoubleOrNothingDetail(sourceBetId=", this.a, ", sourceBetWinningAmount=", ", maxRounds=");
        sbA.append(this.c);
        sbA.append(", odds=");
        sbA.append(this.d);
        sbA.append(", totalReturn=");
        sbA.append(this.e);
        sbA.append(", createTimestampMillis=");
        sbA.append(this.f);
        return ka1.a(sbA, ", rounds=", this.g, ")");
    }
}
