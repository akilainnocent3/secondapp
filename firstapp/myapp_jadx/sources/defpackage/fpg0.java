package defpackage;

import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fpg0 {
    public final BigDecimal a;
    public final WithDrawInfo b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fpg0(int i) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        WithDrawInfo withDrawInfo = WithDrawInfo.getDefault();
        withDrawInfo.getClass();
        this(bigDecimal, withDrawInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpg0)) {
            return false;
        }
        fpg0 fpg0Var = (fpg0) obj;
        return Intrinsics.g(this.a, fpg0Var.a) && Intrinsics.g(this.b, fpg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TradingSharedUiState(balance=" + this.a + ", withDrawInfo=" + this.b + ")";
    }

    public fpg0(BigDecimal bigDecimal, WithDrawInfo withDrawInfo) {
        bigDecimal.getClass();
        withDrawInfo.getClass();
        this.a = bigDecimal;
        this.b = withDrawInfo;
    }

    public fpg0() {
        this(0);
    }
}
