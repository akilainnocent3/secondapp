package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pr50 {
    public final double a;
    public final String b;
    public final boolean c;
    public final long d;
    public final qr50 e;
    public final String f;

    public pr50(double d, String str, boolean z, long j, qr50 qr50Var, String str2) {
        str.getClass();
        this.a = d;
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = qr50Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr50)) {
            return false;
        }
        pr50 pr50Var = (pr50) obj;
        return Double.compare(this.a, pr50Var.a) == 0 && Intrinsics.g(this.b, pr50Var.b) && this.c == pr50Var.c && this.d == pr50Var.d && this.e == pr50Var.e && this.f.equals(pr50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + f87.a(mtg0.a(gmf0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardInfo(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", isUser=");
        sb.append(this.c);
        sb.append(", playerId=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", userNickname=");
        return j26.a(sb, this.f, ')');
    }
}
