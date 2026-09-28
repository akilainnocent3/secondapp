package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e08 {
    public final j8s a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public e08(j8s j8sVar, String str, boolean z, boolean z2) {
        j8sVar.getClass();
        this.a = j8sVar;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e08)) {
            return false;
        }
        e08 e08Var = (e08) obj;
        return Intrinsics.g(this.a, e08Var.a) && Intrinsics.g(this.b, e08Var.b) && this.c == e08Var.c && this.d == e08Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeLiabilityCheckResult(result=");
        sb.append(this.a);
        sb.append(", bookingCode=");
        sb.append(this.b);
        sb.append(", isHitLiability=");
        return lng.a(", isSmartRemixAvailable=", ")", sb, this.c, this.d);
    }
}
