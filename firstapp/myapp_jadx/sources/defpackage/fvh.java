package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fvh {
    public final BigDecimal a;
    public final String b;
    public final String c;
    public final int d;

    public fvh(int i, String str, String str2, BigDecimal bigDecimal) {
        this.a = bigDecimal;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvh)) {
            return false;
        }
        fvh fvhVar = (fvh) obj;
        return Intrinsics.g(this.a, fvhVar.a) && Intrinsics.g(this.b, fvhVar.b) && Intrinsics.g(this.c, fvhVar.c) && this.d == fvhVar.d;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Integer.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlexUiData(flexTotalOdds=");
        sb.append(this.a);
        sb.append(", flexWhTax=");
        sb.append(this.b);
        sb.append(", flexPotWin=");
        return ijg0.a(this.d, this.c, ", flexibleFitSize=", ")", sb);
    }
}
