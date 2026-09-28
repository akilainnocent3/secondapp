package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hb40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final boolean f;

    public hb40(String str, String str2, String str3, String str4, long j, boolean z) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb40)) {
            return false;
        }
        hb40 hb40Var = (hb40) obj;
        return Intrinsics.g(this.a, hb40Var.a) && Intrinsics.g(this.b, hb40Var.b) && Intrinsics.g(this.c, hb40Var.c) && Intrinsics.g(this.d, hb40Var.d) && this.e == hb40Var.e && this.f == hb40Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + f87.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("RealtimeCMSEntity(apiPageName=", this.a, ", stringKey=", this.b, ", language=");
        hxa.c(sbA, this.c, ", value=", this.d, ", version=");
        sbA.append(this.e);
        sbA.append(", isPageUpdating=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
