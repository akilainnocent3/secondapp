package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jnc0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final List<onc0> e;
    public final lbc0 f;

    public jnc0(String str, String str2, boolean z, int i, List<onc0> list, lbc0 lbc0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = list;
        this.f = lbc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnc0)) {
            return false;
        }
        jnc0 jnc0Var = (jnc0) obj;
        return Intrinsics.g(this.a, jnc0Var.a) && Intrinsics.g(this.b, jnc0Var.b) && this.c == jnc0Var.c && this.d == jnc0Var.d && Intrinsics.g(this.e, jnc0Var.e) && this.f == jnc0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iA = gpp.a(this.d, mtg0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31);
        List<onc0> list = this.e;
        return this.f.hashCode() + ((iA + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsTeamInfo(title=", this.a, ", logo=", this.b, ", isLegends=");
        sbA.append(this.c);
        sbA.append(", star=");
        sbA.append(this.d);
        sbA.append(", stats=");
        sbA.append(this.e);
        sbA.append(", state=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
