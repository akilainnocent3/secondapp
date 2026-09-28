package defpackage;

import com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a740 {
    public final RealBetHistoryOrderEntity a;
    public final Long b;

    public a740(RealBetHistoryOrderEntity realBetHistoryOrderEntity, Long l) {
        this.a = realBetHistoryOrderEntity;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a740)) {
            return false;
        }
        a740 a740Var = (a740) obj;
        return this.a.equals(a740Var.a) && Intrinsics.g(this.b, a740Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "RealBetHistoryOrderWithLastTime(entity=" + this.a + ", lastOrderCreateTime=" + this.b + ")";
    }
}
