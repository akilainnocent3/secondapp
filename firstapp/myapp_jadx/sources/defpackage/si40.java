package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class si40 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final int c;
    public final BigDecimal d;
    public final boolean e;

    public si40(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, BigDecimal bigDecimal3, boolean z) {
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = i;
        this.d = bigDecimal3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si40)) {
            return false;
        }
        si40 si40Var = (si40) obj;
        return this.a.equals(si40Var.a) && Intrinsics.g(this.b, si40Var.b) && this.c == si40Var.c && Intrinsics.g(this.d, si40Var.d) && this.e == si40Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dd3.a(this.d, gpp.a(this.c, dd3.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendCodeOddsModel(maxTotalOdds=");
        sb.append(this.a);
        sb.append(", bonusPercent=");
        sb.append(this.b);
        sb.append(", qualifyOddsCount=");
        sb.append(this.c);
        sb.append(", qualifyTotalOdds=");
        sb.append(this.d);
        sb.append(", hasBonus=");
        return mq0.a(sb, this.e, ")");
    }
}
