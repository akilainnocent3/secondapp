package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tp10 {
    public final String a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final boolean e;

    public tp10(String str, boolean z, long j, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = z3;
    }

    public static tp10 a(tp10 tp10Var, boolean z, int i) {
        String str = tp10Var.a;
        boolean z2 = tp10Var.b;
        long j = tp10Var.c;
        boolean z3 = (i & 8) != 0 ? tp10Var.d : true;
        if ((i & 16) != 0) {
            z = tp10Var.e;
        }
        tp10Var.getClass();
        str.getClass();
        return new tp10(str, z2, j, z3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp10)) {
            return false;
        }
        tp10 tp10Var = (tp10) obj;
        return Intrinsics.g(this.a, tp10Var.a) && this.b == tp10Var.b && this.c == tp10Var.c && this.d == tp10Var.d && this.e == tp10Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(f87.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerInfo(nickname=");
        sb.append(this.a);
        sb.append(", isUser=");
        sb.append(this.b);
        sb.append(", playerId=");
        sb.append(this.c);
        sb.append(", isVisible=");
        sb.append(this.d);
        sb.append(", isDisabled=");
        return ruw.a(sb, this.e, ')');
    }
}
