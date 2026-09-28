package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xyx {
    public static final xyx d;
    public final String a;
    public final int b;
    public final BigDecimal c;

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        d = new xyx("", 0, bigDecimal);
    }

    public xyx(String str, int i, BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.a = str;
        this.b = i;
        this.c = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyx)) {
            return false;
        }
        xyx xyxVar = (xyx) obj;
        return this.a.equals(xyxVar.a) && this.b == xyxVar.b && Intrinsics.g(this.c, xyxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return mh2.a(")", ml5.a(this.b, "NormalizedAmount(normalizedAmountText=", this.a, ", selectionIndex=", ", amount="), this.c);
    }
}
