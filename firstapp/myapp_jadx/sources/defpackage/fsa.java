package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fsa {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public fsa(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
    }

    public static fsa a(fsa fsaVar, int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        if ((i2 & 1) != 0) {
            i = fsaVar.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            str = fsaVar.b;
        }
        String str3 = str;
        String str4 = (i2 & 4) != 0 ? fsaVar.c : str2;
        boolean z6 = (i2 & 8) != 0 ? fsaVar.d : z;
        boolean z7 = (i2 & 16) != 0 ? fsaVar.e : z2;
        boolean z8 = (i2 & 32) != 0 ? fsaVar.f : z3;
        boolean z9 = (i2 & 64) != 0 ? fsaVar.g : true;
        boolean z10 = (i2 & 128) != 0 ? fsaVar.h : true;
        boolean z11 = (i2 & 256) != 0 ? fsaVar.i : z4;
        boolean z12 = (i2 & 512) != 0 ? fsaVar.j : z5;
        fsaVar.getClass();
        str3.getClass();
        str4.getClass();
        return new fsa(i3, str3, str4, z6, z7, z8, z9, z10, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsa)) {
            return false;
        }
        fsa fsaVar = (fsa) obj;
        return this.a == fsaVar.a && Intrinsics.g(this.b, fsaVar.b) && Intrinsics.g(this.c, fsaVar.c) && this.d == fsaVar.d && this.e == fsaVar.e && this.f == fsaVar.f && this.g == fsaVar.g && this.h == fsaVar.h && this.i == fsaVar.i && this.j == fsaVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "ConfirmAccountInfoState(userCertStatus=", ", firstName=", this.b, ", lastName=");
        uts.b(this.c, ", isNINVerificationConfigOn=", ", isNameUpdateConfigOn=", sbA, this.d);
        nng.a(", isLoading=", ", shouldShowConfirmedSnackbar=", sbA, this.e, this.f);
        nng.a(", shouldShowPendingRequestDialog=", ", showUnexpectedError=", sbA, this.g, this.h);
        return lng.a(", showExitConfirmation=", ")", sbA, this.i, this.j);
    }

    public /* synthetic */ fsa(int i) {
        this(300, "", "", false, false, false, false, false, false, false);
    }

    public fsa() {
        this(0);
    }
}
