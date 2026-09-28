package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ox4 {
    public final String a;
    public final String b;
    public final String c;

    public ox4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox4)) {
            return false;
        }
        ox4 ox4Var = (ox4) obj;
        return Intrinsics.g(this.a, ox4Var.a) && Intrinsics.g(this.b, ox4Var.b) && Intrinsics.g(this.c, ox4Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return uf80.a(ux5.a("BookingCodeActionUiState(sharingBookingCode=", this.a, ", addingToBetslipBookingCode=", this.b, ", addingToMultiMakerBookingCode="), this.c, ")");
    }

    public ox4() {
        this(null, null, null);
    }
}
