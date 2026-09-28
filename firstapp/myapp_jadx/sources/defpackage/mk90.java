package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mk90 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final boolean g;
    public final qcn<y6r> h;

    public mk90(String str, String str2, String str3, long j, String str4, String str5, boolean z, uf00 uf00Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk90)) {
            return false;
        }
        mk90 mk90Var = (mk90) obj;
        return Intrinsics.g(this.a, mk90Var.a) && Intrinsics.g(this.b, mk90Var.b) && Intrinsics.g(this.c, mk90Var.c) && this.d == mk90Var.d && Intrinsics.g(this.e, mk90Var.e) && Intrinsics.g(this.f, mk90Var.f) && this.g == mk90Var.g && Intrinsics.g(this.h, mk90Var.h);
    }

    public final int hashCode() {
        int iA = gmf0.a(f87.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e);
        String str = this.f;
        return this.h.hashCode() + mtg0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimpleResultItem(drawId=", this.a, ", lotteryId=", this.b, ", name=");
        l.a(this.d, this.c, ", drawTime=", sbA);
        hxa.c(sbA, ", countryCode=", this.e, ", logoUrl=", this.f);
        sbA.append(", isCanceled=");
        sbA.append(this.g);
        sbA.append(", results=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
