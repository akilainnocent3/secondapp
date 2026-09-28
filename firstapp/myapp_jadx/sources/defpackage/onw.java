package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class onw {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final long e;
    public final boolean f;

    public onw(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j, boolean z) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = bigDecimal4;
        this.e = j;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onw)) {
            return false;
        }
        onw onwVar = (onw) obj;
        return Intrinsics.g(this.a, onwVar.a) && Intrinsics.g(this.b, onwVar.b) && Intrinsics.g(this.c, onwVar.c) && Intrinsics.g(this.d, onwVar.d) && this.e == onwVar.e && this.f == onwVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + f87.a(dd3.a(this.d, dd3.a(this.c, dd3.a(this.b, this.a.hashCode() * 31, 31), 31), 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleWHTaxAndNetWin(minScaled=");
        sb.append(this.a);
        sb.append(", maxScaled=");
        sb.append(this.b);
        sb.append(", maxPW=");
        iib0.b(sb, this.c, ", stake=", this.d, ", multipleCount=");
        sb.append(this.e);
        sb.append(", canBetOneCut=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
