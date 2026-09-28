package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d94 {
    public final String a;
    public final qd4.c b;
    public final boolean c;
    public final boolean d;
    public final gc4 e;
    public final boolean f;
    public final String g;
    public final int h;

    public d94(String str, qd4.c cVar, boolean z, boolean z2, gc4 gc4Var, boolean z3, String str2, int i) {
        this.a = str;
        this.b = cVar;
        this.c = z;
        this.d = z2;
        this.e = gc4Var;
        this.f = z3;
        this.g = str2;
        this.h = i;
    }

    public static d94 a(d94 d94Var, String str, qd4.c cVar, boolean z, boolean z2, gc4 gc4Var, boolean z3, String str2, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = d94Var.a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            cVar = d94Var.b;
        }
        qd4.c cVar2 = cVar;
        if ((i2 & 4) != 0) {
            z = d94Var.c;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z2 = d94Var.d;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            gc4Var = d94Var.e;
        }
        gc4 gc4Var2 = gc4Var;
        if ((i2 & 32) != 0) {
            z3 = d94Var.f;
        }
        boolean z6 = z3;
        String str4 = (i2 & 64) != 0 ? d94Var.g : str2;
        int i3 = (i2 & 128) != 0 ? d94Var.h : i;
        d94Var.getClass();
        str3.getClass();
        gc4Var2.getClass();
        str4.getClass();
        return new d94(str3, cVar2, z4, z5, gc4Var2, z6, str4, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d94)) {
            return false;
        }
        d94 d94Var = (d94) obj;
        return Intrinsics.g(this.a, d94Var.a) && Intrinsics.g(this.b, d94Var.b) && this.c == d94Var.c && this.d == d94Var.d && this.e == d94Var.e && this.f == d94Var.f && Intrinsics.g(this.g, d94Var.g) && this.h == d94Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qd4.c cVar = this.b;
        return Integer.hashCode(this.h) + gmf0.a(mtg0.a((this.e.hashCode() + mtg0.a(mtg0.a((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BioAuthSettingsUiState(verifiedDate=");
        sb.append(this.a);
        sb.append(", cryptoObject=");
        sb.append(this.b);
        sb.append(", isLoginOn=");
        nng.a(", isSportyPinOn=", ", purpose=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", showErrorDialog=");
        sb.append(this.f);
        sb.append(", apiErrorMsg=");
        return ijg0.a(this.h, this.g, ", bioAuthError=", ")", sb);
    }

    public d94() {
        this(0);
    }

    public /* synthetic */ d94(int i) {
        this("", null, false, false, gc4.None, false, "", 0);
    }
}
