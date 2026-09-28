package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q080 {
    public final String a;
    public final List<String> b;
    public final List<String> c;
    public final List<String> d;
    public final wt70 e;

    public q080(String str, List<String> list, List<String> list2, List<String> list3, wt70 wt70Var) {
        str.getClass();
        list.getClass();
        list2.getClass();
        wt70Var.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = wt70Var;
    }

    public static q080 a(q080 q080Var, String str, List list, List list2, List list3, wt70 wt70Var, int i) {
        if ((i & 1) != 0) {
            str = q080Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            list = q080Var.b;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = q080Var.c;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            list3 = q080Var.d;
        }
        List list6 = list3;
        if ((i & 16) != 0) {
            wt70Var = q080Var.e;
        }
        wt70 wt70Var2 = wt70Var;
        q080Var.getClass();
        str2.getClass();
        list4.getClass();
        list5.getClass();
        wt70Var2.getClass();
        return new q080(str2, list4, list5, list6, wt70Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q080)) {
            return false;
        }
        q080 q080Var = (q080) obj;
        return Intrinsics.g(this.a, q080Var.a) && Intrinsics.g(this.b, q080Var.b) && Intrinsics.g(this.c, q080Var.c) && Intrinsics.g(this.d, q080Var.d) && Intrinsics.g(this.e, q080Var.e);
    }

    public final int hashCode() {
        int iA = ai50.a(ai50.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        List<String> list = this.d;
        return this.e.hashCode() + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchUiState(query=");
        sb.append(this.a);
        sb.append(", suggestedQueries=");
        sb.append(this.b);
        sb.append(", recentQueries=");
        qpu.a(", trendingQueries=", ", content=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public q080() {
        this(null, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q080(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        m2g m2gVar = m2g.a;
        this(str, m2gVar, m2gVar, null, wt70.e.a);
    }
}
