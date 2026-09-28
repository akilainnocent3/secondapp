package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g5d0 {
    public final h5d0 a;
    public final float b;
    public final List<c5d0> c;

    public g5d0(h5d0 h5d0Var, float f, List<c5d0> list) {
        list.getClass();
        this.a = h5d0Var;
        this.b = f;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5d0)) {
            return false;
        }
        g5d0 g5d0Var = (g5d0) obj;
        return this.a.equals(g5d0Var.a) && Float.compare(this.b, g5d0Var.b) == 0 && Intrinsics.g(this.c, g5d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tvh.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyPenaltyStatsTeam(info=");
        sb.append(this.a);
        sb.append(", averageGoals=");
        sb.append(this.b);
        sb.append(", matchRecords=");
        return ng1.a(sb, this.c, ")");
    }
}
