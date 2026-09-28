package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class if80 {
    public final long a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final int f;
    public final boolean g;
    public final rx00 h;
    public final hu00 i;

    public if80(long j, String str, String str2, double d, double d2, int i, boolean z, rx00 rx00Var, hu00 hu00Var) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = i;
        this.g = z;
        this.h = rx00Var;
        this.i = hu00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if80)) {
            return false;
        }
        if80 if80Var = (if80) obj;
        return this.a == if80Var.a && Intrinsics.g(this.b, if80Var.b) && this.c.equals(if80Var.c) && Double.compare(this.d, if80Var.d) == 0 && Double.compare(this.e, if80Var.e) == 0 && this.f == if80Var.f && this.g == if80Var.g && this.h == if80Var.h && this.i == if80Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + mtg0.a(gpp.a(this.f, nrg0.a(nrg0.a(gmf0.a(gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g)) * 31);
    }

    public final String toString() {
        return "SessionCard(roomId=" + this.a + ", title=" + this.b + ", currency=" + this.c + ", totalPrize=" + this.d + ", feeToJoinRoom=" + this.e + ", playersOnline=" + this.f + ", isSpecialEvent=" + this.g + ", cardTheme=" + this.h + ", pigType=" + this.i + ')';
    }
}
