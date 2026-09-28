package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s28 {
    public final pr50 a;
    public final boolean b;

    public s28(pr50 pr50Var, boolean z) {
        pr50Var.getClass();
        this.a = pr50Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s28)) {
            return false;
        }
        s28 s28Var = (s28) obj;
        return Intrinsics.g(this.a, s28Var.a) && this.b == s28Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoinFlightMetadata(rewardInfo=");
        sb.append(this.a);
        sb.append(", isGoldRain=");
        return ruw.a(sb, this.b, ')');
    }
}
