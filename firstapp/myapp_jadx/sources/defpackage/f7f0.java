package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f7f0 {
    public final String a;
    public final List<a4g0> b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final c7f0 g;
    public final c7f0 h;

    public f7f0(int i) {
        this(null, m2g.a, "", "", false, false, new c7f0(0), new c7f0(0));
    }

    public static f7f0 a(f7f0 f7f0Var, String str, List list, String str2, String str3, boolean z, boolean z2, c7f0 c7f0Var, c7f0 c7f0Var2, int i) {
        if ((i & 1) != 0) {
            str = f7f0Var.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            list = f7f0Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = f7f0Var.c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = f7f0Var.d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = f7f0Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = f7f0Var.f;
        }
        boolean z4 = z2;
        c7f0 c7f0Var3 = (i & 64) != 0 ? f7f0Var.g : c7f0Var;
        c7f0 c7f0Var4 = (i & 128) != 0 ? f7f0Var.h : c7f0Var2;
        f7f0Var.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        c7f0Var3.getClass();
        c7f0Var4.getClass();
        return new f7f0(str4, list2, str5, str6, z3, z4, c7f0Var3, c7f0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7f0)) {
            return false;
        }
        f7f0 f7f0Var = (f7f0) obj;
        return Intrinsics.g(this.a, f7f0Var.a) && Intrinsics.g(this.b, f7f0Var.b) && Intrinsics.g(this.c, f7f0Var.c) && Intrinsics.g(this.d, f7f0Var.d) && this.e == f7f0Var.e && this.f == f7f0Var.f && Intrinsics.g(this.g, f7f0Var.g) && Intrinsics.g(this.h, f7f0Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        return this.h.hashCode() + ((this.g.hashCode() + mtg0.a(mtg0.a(gmf0.a(gmf0.a(ai50.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamMatchesState(errorMessage=");
        sb.append(this.a);
        sb.append(", tournaments=");
        sb.append(this.b);
        sb.append(", allTournamentIds=");
        hxa.c(sb, this.c, ", currentTournamentIds=", this.d, ", isLoadingEvents=");
        nng.a(", isLoadingMore=", ", resultsPagination=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", fixturesPagination=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public f7f0(String str, List<a4g0> list, String str2, String str3, boolean z, boolean z2, c7f0 c7f0Var, c7f0 c7f0Var2) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = c7f0Var;
        this.h = c7f0Var2;
    }

    public f7f0() {
        this(0);
    }
}
