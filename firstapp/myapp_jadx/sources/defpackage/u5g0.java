package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u5g0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public u5g0(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5g0)) {
            return false;
        }
        u5g0 u5g0Var = (u5g0) obj;
        return Intrinsics.g(this.a, u5g0Var.a) && Intrinsics.g(this.b, u5g0Var.b) && Intrinsics.g(this.c, u5g0Var.c) && this.d == u5g0Var.d;
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x9d.a(this.c, ", isFavorite=", ")", ux5.a("TournamentBracketTeam(id=", this.a, ", name=", this.b, ", flagUrl="), this.d);
    }

    public /* synthetic */ u5g0(String str, String str2, String str3, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) == 0);
    }
}
