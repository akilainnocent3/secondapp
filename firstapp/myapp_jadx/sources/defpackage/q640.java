package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q640 {
    public final String a;
    public final String b;
    public final Set<Integer> c;
    public final Integer d;

    public q640(String str, String str2, Set<Integer> set, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q640)) {
            return false;
        }
        q640 q640Var = (q640) obj;
        return Intrinsics.g(this.a, q640Var.a) && Intrinsics.g(this.b, q640Var.b) && Intrinsics.g(this.c, q640Var.c) && Intrinsics.g(this.d, q640Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Set<Integer> set = this.c;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("RealBetHistoryOrderQuery(startTime=", this.a, ", endTime=", this.b, ", winningStatus=");
        sbA.append(this.c);
        sbA.append(", isSettled=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    public q640() {
        this(null, null, null, null);
    }
}
