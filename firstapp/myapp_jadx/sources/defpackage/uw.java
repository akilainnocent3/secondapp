package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uw {
    public final List<BigDecimal> a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public uw(List<? extends BigDecimal> list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        return Intrinsics.g(this.a, uwVar.a) && this.b == uwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AmountQuickAddingButtonGroupState(values=" + this.a + ", isVisible=" + this.b + ")";
    }

    public uw() {
        this(0);
    }

    public uw(int i) {
        this(m2g.a, false);
    }
}
