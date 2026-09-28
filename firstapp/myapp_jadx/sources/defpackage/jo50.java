package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jo50 {
    public final boolean a;
    public final Integer b;

    public jo50(Integer num, boolean z) {
        this.a = z;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo50)) {
            return false;
        }
        jo50 jo50Var = (jo50) obj;
        return this.a == jo50Var.a && Intrinsics.g(this.b, jo50Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "RetryWithdrawFlowData(isEnabled=" + this.a + ", assetId=" + this.b + ")";
    }

    public /* synthetic */ jo50() {
        this(null, false);
    }
}
