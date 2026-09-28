package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qaw {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final Double e;

    public qaw(boolean z, long j, long j2, long j3, Double d) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaw)) {
            return false;
        }
        qaw qawVar = (qaw) obj;
        return this.a == qawVar.a && this.b == qawVar.b && this.c == qawVar.c && this.d == qawVar.d && Intrinsics.g(this.e, qawVar.e);
    }

    public final int hashCode() {
        int iA = f87.a(f87.a(f87.a(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
        Double d = this.e;
        return iA + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiLevelBetCardSnapshot(betPlaced=");
        sb.append(this.a);
        sb.append(", roundId=");
        sb.append(this.b);
        g41.a(this.c, ", topBetId=", ", topBetRoundId=", sb);
        sb.append(this.d);
        sb.append(", topBetBonusPercentage=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
