package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ybs {
    public final Double a;
    public final Double b;
    public final String c;
    public final boolean d;
    public final int e;

    public ybs(Double d, Double d2, String str, boolean z, int i) {
        str.getClass();
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybs)) {
            return false;
        }
        ybs ybsVar = (ybs) obj;
        return Intrinsics.g(this.a, ybsVar.a) && Intrinsics.g(this.b, ybsVar.b) && Intrinsics.g(this.c, ybsVar.c) && this.d == ybsVar.d && this.e == ybsVar.e;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        return Integer.hashCode(this.e) + mtg0.a(gmf0.a((iHashCode + (d2 != null ? d2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitProgressBarData(currentAmount=");
        sb.append(this.a);
        sb.append(", totalAmount=");
        sb.append(this.b);
        sb.append(", unitType=");
        uts.b(this.c, ", showUnitAsInt=", ", title=", sb, this.d);
        return zk1.a(this.e, ")", sb);
    }

    public /* synthetic */ ybs(Double d, Double d2, String str, int i, int i2) {
        this(d, d2, (i2 & 4) != 0 ? "" : str, false, i);
    }
}
