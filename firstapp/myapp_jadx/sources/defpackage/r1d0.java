package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r1d0 implements Serializable {
    public final String a;
    public final List<t1d0> b;
    public final List<x5d0> c;
    public final List<z5d0> d;
    public final List<a6d0> e;

    public r1d0(String str, List<t1d0> list, List<x5d0> list2, List<z5d0> list3, List<a6d0> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1d0)) {
            return false;
        }
        r1d0 r1d0Var = (r1d0) obj;
        return this.a.equals(r1d0Var.a) && Intrinsics.g(this.b, r1d0Var.b) && Intrinsics.g(this.c, r1d0Var.c) && Intrinsics.g(this.d, r1d0Var.d) && Intrinsics.g(this.e, r1d0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ai50.a(ai50.a(ai50.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyPenaltySettleRound(sportId=");
        sb.append(this.a);
        sb.append(", tickets=");
        sb.append(this.b);
        sb.append(", events=");
        qpu.a(", markets=", ", outcomes=", sb, this.c, this.d);
        return ng1.a(sb, this.e, ")");
    }
}
