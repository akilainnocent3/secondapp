package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yu20 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public /* synthetic */ yu20(String str, int i) {
        this("", (i & 2) != 0 ? "" : "987654321", (i & 4) != 0 ? "" : str, false);
    }

    public static yu20 a(yu20 yu20Var, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = yu20Var.a;
        }
        if ((i & 2) != 0) {
            str2 = yu20Var.b;
        }
        if ((i & 4) != 0) {
            str3 = yu20Var.c;
        }
        if ((i & 8) != 0) {
            z = yu20Var.d;
        }
        yu20Var.getClass();
        str.getClass();
        str3.getClass();
        return new yu20(str, str2, str3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu20)) {
            return false;
        }
        yu20 yu20Var = (yu20) obj;
        return Intrinsics.g(this.a, yu20Var.a) && Intrinsics.g(this.b, yu20Var.b) && Intrinsics.g(this.c, yu20Var.c) && this.d == yu20Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return x9d.a(this.c, ", showErrorDialog=", ")", ux5.a("PrimaryPhoneUpdatedSuccessfullyUiState(currentPhone=", this.a, ", newPhone=", this.b, ", validTime="), this.d);
    }

    public yu20() {
        this(null, 15);
    }

    public yu20(String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }
}
