package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k07 {
    public final f1s a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;

    public k07(f1s f1sVar, ArrayList arrayList, int i, int i2, int i3) {
        this.a = f1sVar;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k07)) {
            return false;
        }
        k07 k07Var = (k07) obj;
        return Intrinsics.g(this.a, k07Var.a) && this.b.equals(k07Var.b) && this.c == k07Var.c && this.d == k07Var.d && this.e == k07Var.e;
    }

    public final int hashCode() {
        f1s f1sVar = this.a;
        return Integer.hashCode(this.e) + gpp.a(this.d, gpp.a(this.c, vt5.a(this.b, (f1sVar == null ? 0 : f1sVar.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeLeaderboard(selfRanking=");
        sb.append(this.a);
        sb.append(", entries=");
        sb.append(this.b);
        sb.append(", pageNo=");
        d5d.a(sb, this.c, ", pageSize=", this.d, ", totalNum=");
        return zk1.a(this.e, ")", sb);
    }
}
