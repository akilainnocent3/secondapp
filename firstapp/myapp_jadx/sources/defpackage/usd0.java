package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class usd0 {
    public final int a;
    public final int b;
    public final List<BigDecimal> c;

    public usd0(int i) {
        this(1, (i & 2) != 0 ? 3 : 1, m2g.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usd0)) {
            return false;
        }
        usd0 usd0Var = (usd0) obj;
        return this.a == usd0Var.a && this.b == usd0Var.b && Intrinsics.g(this.c, usd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ng1.a(dy5.a("StakeKeyboardUiState(quickStakeToolStatus=", this.a, this.b, ", checkBoxStatus=", ", quickStakes="), this.c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public usd0(int i, int i2, List<? extends BigDecimal> list) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = list;
    }
}
