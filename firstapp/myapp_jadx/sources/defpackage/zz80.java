package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zz80 {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;

    public zz80(String str, String str2, String str3, BigDecimal bigDecimal) {
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz80)) {
            return false;
        }
        zz80 zz80Var = (zz80) obj;
        return Intrinsics.g(this.a, zz80Var.a) && Intrinsics.g(this.b, zz80Var.b) && Intrinsics.g(this.c, zz80Var.c) && Intrinsics.g(this.d, zz80Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.b;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return kwi.a(yz80.a(this.b, "ShareCodeSummary(potentialWinnings=", this.a, ", totalStake=", ", displayTotalOdds="), this.c, ", displayBonus=", this.d, ")");
    }
}
