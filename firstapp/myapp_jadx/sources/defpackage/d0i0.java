package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0i0 {
    public final boolean a;
    public final String b;
    public final int c;
    public final boolean d;
    public final String e;
    public final String f;

    public d0i0(boolean z, String str, String str2, String str3, int i, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = z2;
        this.e = str2;
        this.f = str3;
    }

    public static d0i0 a(d0i0 d0i0Var, boolean z, String str, int i, boolean z2, String str2, String str3, int i2) {
        if ((i2 & 1) != 0) {
            z = d0i0Var.a;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            str = d0i0Var.b;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            i = d0i0Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z2 = d0i0Var.d;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            str2 = d0i0Var.e;
        }
        String str5 = str2;
        if ((i2 & 32) != 0) {
            str3 = d0i0Var.f;
        }
        String str6 = str3;
        d0i0Var.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new d0i0(z3, str4, str5, str6, i3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0i0)) {
            return false;
        }
        d0i0 d0i0Var = (d0i0) obj;
        return this.a == d0i0Var.a && Intrinsics.g(this.b, d0i0Var.b) && this.c == d0i0Var.c && this.d == d0i0Var.d && Intrinsics.g(this.e, d0i0Var.e) && Intrinsics.g(this.f, d0i0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(mtg0.a(gpp.a(this.c, gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("VerifyIdentityState(isLoading=", ", message=", this.b, ", bizCode=", this.a);
        sbA.append(this.c);
        sbA.append(", showErrorDialog=");
        sbA.append(this.d);
        sbA.append(", previousPin=");
        return kwi.a(sbA, this.e, ", previousPassword=", this.f, ")");
    }

    public /* synthetic */ d0i0(int i) {
        this(false, "", "", "", 0, false);
    }

    public d0i0() {
        this(0);
    }
}
