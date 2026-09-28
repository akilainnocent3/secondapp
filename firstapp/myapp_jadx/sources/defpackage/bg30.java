package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class bg30 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;

    public bg30(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg30)) {
            return false;
        }
        bg30 bg30Var = (bg30) obj;
        return Intrinsics.g(this.a, bg30Var.a) && Intrinsics.g(this.b, bg30Var.b) && Intrinsics.g(this.c, bg30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickBetViewPayoutData(fullWinValue=");
        sb.append(this.a);
        sb.append(", taxValue=");
        sb.append(this.b);
        sb.append(", netValue=");
        return mh2.a(")", sb, this.c);
    }
}
