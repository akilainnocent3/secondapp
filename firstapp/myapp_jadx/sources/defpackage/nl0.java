package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nl0 {
    public boolean a;
    public BigDecimal b;
    public BigDecimal c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl0)) {
            return false;
        }
        nl0 nl0Var = (nl0) obj;
        return this.a == nl0Var.a && Intrinsics.g(this.b, nl0Var.b) && Intrinsics.g(this.c, nl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dd3.a(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        boolean z = this.a;
        BigDecimal bigDecimal = this.b;
        BigDecimal bigDecimal2 = this.c;
        StringBuilder sb = new StringBuilder("AnyWinInfo(isPlaceBet=");
        sb.append(z);
        sb.append(", oddsKey=");
        sb.append(bigDecimal);
        sb.append(", anyWinOdds=");
        return mh2.a(")", sb, bigDecimal2);
    }
}
