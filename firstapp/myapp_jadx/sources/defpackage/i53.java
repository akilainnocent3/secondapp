package defpackage;

import com.sporty.android.core.model.OrderBetType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i53 {
    public final OrderBetType a;
    public final Boolean b;
    public final String c;
    public final boolean d;

    public i53(OrderBetType orderBetType, Boolean bool, String str, boolean z) {
        orderBetType.getClass();
        this.a = orderBetType;
        this.b = bool;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i53)) {
            return false;
        }
        i53 i53Var = (i53) obj;
        return this.a == i53Var.a && this.b.equals(i53Var.b) && Intrinsics.g(this.c, i53Var.c) && this.d == i53Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetSlipMission(orderBetType=");
        sb.append(this.a);
        sb.append(", useGift=");
        sb.append(this.b);
        sb.append(", betSlipMaxOdds=");
        return x9d.a(this.c, ", isRealMode=", ")", sb, this.d);
    }
}
