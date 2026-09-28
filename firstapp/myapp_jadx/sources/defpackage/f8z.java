package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f8z {
    public final boolean a;
    public final BigDecimal b;

    public f8z(boolean z, BigDecimal bigDecimal) {
        this.a = z;
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8z)) {
            return false;
        }
        f8z f8zVar = (f8z) obj;
        return this.a == f8zVar.a && Intrinsics.g(this.b, f8zVar.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        BigDecimal bigDecimal = this.b;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public final String toString() {
        return "OutcomeButtonState(isSelected=" + this.a + ", lfbBoostRatio=" + this.b + ")";
    }
}
