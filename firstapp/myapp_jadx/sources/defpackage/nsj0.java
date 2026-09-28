package defpackage;

import com.sporty.android.core.model.common.Range;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nsj0 {
    public final List<Range> a;
    public final BigDecimal b;
    public final Integer c;
    public final BigDecimal d;

    /* JADX WARN: Multi-variable type inference failed */
    public nsj0(List<? extends Range> list, BigDecimal bigDecimal, Integer num, BigDecimal bigDecimal2) {
        this.a = list;
        this.b = bigDecimal;
        this.c = num;
        this.d = bigDecimal2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsj0)) {
            return false;
        }
        nsj0 nsj0Var = (nsj0) obj;
        return Intrinsics.g(this.a, nsj0Var.a) && Intrinsics.g(this.b, nsj0Var.b) && Intrinsics.g(this.c, nsj0Var.c) && Intrinsics.g(this.d, nsj0Var.d);
    }

    public final int hashCode() {
        List<Range> list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BigDecimal bigDecimal = this.b;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.d;
        return iHashCode3 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public final String toString() {
        return "WithdrawalFeeConfig(ranges=" + this.a + ", amount=" + this.b + ", type=" + this.c + ", free=" + this.d + ")";
    }
}
