package defpackage;

import com.appsflyer.internal.b0;
import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iw3 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public iw3(long j, String str, String str2, String str3, boolean z, boolean z2) {
        m.a(str, str2, str3);
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw3)) {
            return false;
        }
        iw3 iw3Var = (iw3) obj;
        return this.a == iw3Var.a && Intrinsics.g(this.b, iw3Var.b) && Intrinsics.g(this.c, iw3Var.c) && Intrinsics.g(this.d, iw3Var.d) && this.e == iw3Var.e && this.f == iw3Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + mtg0.a(gmf0.a(gmf0.a(gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = b0.a(this.a, "BetslipTheme(id=", ", path=", this.b);
        hxa.c(sbA, ", name=", this.c, ", category=", this.d);
        u8.a(", owned=", ", current=", sbA, this.e, this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
