package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0j0 {
    public final e0j0 a;
    public final String b;
    public final boolean c;
    public final Set<uzi0> d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public f0j0(e0j0 e0j0Var, String str, boolean z, Set<uzi0> set, boolean z2, boolean z3, String str2) {
        set.getClass();
        this.a = e0j0Var;
        this.b = str;
        this.c = z;
        this.d = set;
        this.e = z2;
        this.f = z3;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0j0)) {
            return false;
        }
        f0j0 f0j0Var = (f0j0) obj;
        return this.a == f0j0Var.a && Intrinsics.g(this.b, f0j0Var.b) && this.c == f0j0Var.c && Intrinsics.g(this.d, f0j0Var.d) && this.e == f0j0Var.e && this.f == f0j0Var.f && Intrinsics.g(this.g, f0j0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iA = mtg0.a(mtg0.a((this.d.hashCode() + mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewTierConfig(tier=");
        sb.append(this.a);
        sb.append(", host=");
        sb.append(this.b);
        sb.append(", jsEnabled=");
        sb.append(this.c);
        sb.append(", jsPermissions=");
        sb.append(this.d);
        sb.append(", injectSportyCookies=");
        nng.a(", useBranding=", ", tier2Justification=", sb, this.e, this.f);
        return uf80.a(sb, this.g, ")");
    }
}
