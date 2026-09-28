package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dp20 {
    public final long a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final int f;
    public final boolean g;
    public final cp20 h;
    public final ap20 i;

    public dp20(long j, String str, String str2, double d, double d2, int i, boolean z, cp20 cp20Var, ap20 ap20Var) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = i;
        this.g = z;
        this.h = cp20Var;
        this.i = ap20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp20)) {
            return false;
        }
        dp20 dp20Var = (dp20) obj;
        return this.a == dp20Var.a && Intrinsics.g(this.b, dp20Var.b) && this.c.equals(dp20Var.c) && Double.compare(this.d, dp20Var.d) == 0 && Double.compare(this.e, dp20Var.e) == 0 && this.f == dp20Var.f && this.g == dp20Var.g && this.h == dp20Var.h && this.i == dp20Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + mtg0.a(gpp.a(this.f, nrg0.a(nrg0.a(gmf0.a(gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g)) * 31);
    }

    public final String toString() {
        return "PresentationSessionCard(roomId=" + this.a + ", title=" + this.b + ", currency=" + this.c + ", totalPrize=" + this.d + ", feeToJoinRoom=" + this.e + ", playersOnline=" + this.f + ", isSpecialEvent=" + this.g + ", cardTheme=" + this.h + ", pigType=" + this.i + ')';
    }
}
