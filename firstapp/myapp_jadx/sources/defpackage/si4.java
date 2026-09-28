package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class si4 {
    public final long a;
    public final int b;
    public final Double c;
    public final List<gm4> d;

    public si4(long j, int i, Double d, List<gm4> list) {
        list.getClass();
        this.a = j;
        this.b = i;
        this.c = d;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si4)) {
            return false;
        }
        si4 si4Var = (si4) obj;
        return this.a == si4Var.a && this.b == si4Var.b && Intrinsics.g(this.c, si4Var.c) && Intrinsics.g(this.d, si4Var.d);
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, Long.hashCode(this.a) * 31, 31);
        Double d = this.c;
        return this.d.hashCode() + ((iA + (d == null ? 0 : d.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupClaimResult(sessionId=");
        sb.append(this.a);
        sb.append(", freeBetCount=");
        sb.append(this.b);
        sb.append(", freeBetValue=");
        sb.append(this.c);
        sb.append(", gifts=");
        return o8i.a(sb, this.d, ')');
    }
}
