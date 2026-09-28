package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tkh0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final String f;
    public final boolean g;

    public tkh0(String str, boolean z, boolean z2, boolean z3, int i, String str2, boolean z4) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = str2;
        this.g = z4;
    }

    public static tkh0 a(tkh0 tkh0Var, boolean z, boolean z2, boolean z3, int i, String str, boolean z4, int i2) {
        boolean z5 = z;
        String str2 = tkh0Var.a;
        if ((i2 & 2) != 0) {
            z5 = tkh0Var.b;
        }
        if ((i2 & 4) != 0) {
            z2 = tkh0Var.c;
        }
        if ((i2 & 8) != 0) {
            z3 = tkh0Var.d;
        }
        if ((i2 & 16) != 0) {
            i = tkh0Var.e;
        }
        if ((i2 & 32) != 0) {
            str = tkh0Var.f;
        }
        if ((i2 & 64) != 0) {
            z4 = tkh0Var.g;
        }
        boolean z6 = z4;
        tkh0Var.getClass();
        str2.getClass();
        str.getClass();
        String str3 = str;
        int i3 = i;
        boolean z7 = z3;
        return new tkh0(str2, z5, z2, z7, i3, str3, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkh0)) {
            return false;
        }
        tkh0 tkh0Var = (tkh0) obj;
        return Intrinsics.g(this.a, tkh0Var.a) && this.b == tkh0Var.b && this.c == tkh0Var.c && this.d == tkh0Var.d && this.e == tkh0Var.e && Intrinsics.g(this.f, tkh0Var.f) && this.g == tkh0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + gmf0.a(gpp.a(this.e, mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("UpdatePhoneNumberUiState(currentPhoneNumber=", this.a, ", isDepositPhone=", ", shouldShowUpdatePhoneErrorDialog=", this.b);
        nng.a(", shouldShowVerifyNameErrorDialog=", ", bizCode=", sbA, this.c, this.d);
        f78.b(this.e, ", message=", this.f, ", isLoading=", sbA);
        return mq0.a(sbA, this.g, ")");
    }

    public /* synthetic */ tkh0(String str, int i) {
        this((i & 1) != 0 ? "" : str, false, false, false, 0, "", false);
    }

    public tkh0() {
        this(null, 127);
    }
}
