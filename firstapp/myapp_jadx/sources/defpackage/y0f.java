package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y0f {
    public final BigDecimal a;

    public y0f(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.a = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0f) && Intrinsics.g(this.a, ((y0f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DoubleOrNothingCurrentRoundResult(roundBalance=" + this.a + ")";
    }
}
