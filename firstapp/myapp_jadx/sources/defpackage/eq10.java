package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class eq10 {
    public final String a;
    public final double b;
    public final boolean c;
    public final long d;
    public final String e;

    public eq10(String str, double d, boolean z, long j, String str2) {
        str.getClass();
        this.a = str;
        this.b = d;
        this.c = z;
        this.d = j;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq10)) {
            return false;
        }
        eq10 eq10Var = (eq10) obj;
        return Intrinsics.g(this.a, eq10Var.a) && Double.compare(this.b, eq10Var.b) == 0 && this.c == eq10Var.c && this.d == eq10Var.d && this.e.equals(eq10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f87.a(mtg0.a(nrg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerReward(currency=");
        sb.append(this.a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", isUser=");
        sb.append(this.c);
        sb.append(", playerId=");
        sb.append(this.d);
        sb.append(", userNickname=");
        return j26.a(sb, this.e, ')');
    }
}
