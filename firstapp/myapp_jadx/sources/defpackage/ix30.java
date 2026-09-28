package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ix30 {
    public final krf0 a;
    public final String b;
    public final String c;
    public final String d;
    public final ev0 e;
    public final u25 f;

    public ix30(krf0 krf0Var, String str, String str2, String str3, ev0 ev0Var, u25 u25Var) {
        krf0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = krf0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = ev0Var;
        this.f = u25Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix30)) {
            return false;
        }
        ix30 ix30Var = (ix30) obj;
        return this.a == ix30Var.a && Intrinsics.g(this.b, ix30Var.b) && Intrinsics.g(this.c, ix30Var.c) && Intrinsics.g(this.d, ix30Var.d) && Intrinsics.g(this.e, ix30Var.e) && Intrinsics.g(this.f, ix30Var.f);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ev0 ev0Var = this.e;
        int iHashCode = (iA + (ev0Var == null ? 0 : ev0Var.hashCode())) * 31;
        u25 u25Var = this.f;
        return iHashCode + (u25Var != null ? u25Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RakebackInfo(tier=");
        sb.append(this.a);
        sb.append(", realSport=");
        sb.append(this.b);
        sb.append(", iv=");
        hxa.c(sb, this.c, ", game=", this.d, ", boostInfo=");
        sb.append(this.e);
        sb.append(", boostRakebackData=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
