package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w340 extends c5c {
    public final double a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;

    public w340(double d, long j, int i, int i2, int i3, ArrayList arrayList, ArrayList arrayList2) {
        this.a = d;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w340)) {
            return false;
        }
        w340 w340Var = (w340) obj;
        return Double.compare(this.a, w340Var.a) == 0 && this.b == w340Var.b && this.c == w340Var.c && this.d == w340Var.d && this.e == w340Var.e && Intrinsics.g(this.f, w340Var.f) && Intrinsics.g(this.g, w340Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + vt5.a(this.f, gpp.a(this.e, gpp.a(this.d, gpp.a(this.c, f87.a(Double.hashCode(this.a) * 31, this.b, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ReadyToClaim(totalReward=" + this.a + ", sessionId=" + this.b + ", rowsCount=" + this.c + ", columnsCount=" + this.d + ", currentRound=" + this.e + ", stackedRows=" + this.f + ", rowConfiguration=" + this.g + ')';
    }
}
