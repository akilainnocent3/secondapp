package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vw<T> {
    public final T a;
    public final T b;

    /* JADX WARN: Multi-variable type inference failed */
    public vw(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw)) {
            return false;
        }
        vw vwVar = (vw) obj;
        return Intrinsics.g(this.a, vwVar.a) && Intrinsics.g(this.b, vwVar.b);
    }

    public final int hashCode() {
        T t = this.a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        return "AmountRange(lower=" + this.a + ", upper=" + this.b + ")";
    }
}
