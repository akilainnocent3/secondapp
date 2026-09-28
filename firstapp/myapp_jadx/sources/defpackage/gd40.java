package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gd40 {
    public static final gd40 e;
    public final boolean a;
    public final List<ro10> b;
    public final List<qqf0> c;
    public final List<t1g0> d;

    static {
        m2g m2gVar = m2g.a;
        e = new gd40(false, m2gVar, m2gVar, m2gVar);
    }

    public gd40(boolean z, List<ro10> list, List<qqf0> list2, List<t1g0> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd40)) {
            return false;
        }
        gd40 gd40Var = (gd40) obj;
        return this.a == gd40Var.a && Intrinsics.g(this.b, gd40Var.b) && Intrinsics.g(this.c, gd40Var.c) && Intrinsics.g(this.d, gd40Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ai50.a(ai50.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecapData(latestRecapYearEligible=");
        sb.append(this.a);
        sb.append(", playedSports=");
        sb.append(this.b);
        sb.append(", ticketStats=");
        return v9d.a(", topMarkets=", ")", sb, this.c, this.d);
    }
}
