package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cvq {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;

    public cvq(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        bigDecimal.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = bigDecimal4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:25:0x0039  */
    /* JADX WARN: Code duplicated, block: B:35:0x004f  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvq)) {
            return false;
        }
        cvq cvqVar = (cvq) obj;
        BigDecimal bigDecimal = cvqVar.a;
        rkd0.a aVar = rkd0.Companion;
        if (!Intrinsics.g(this.a, bigDecimal)) {
            return false;
        }
        BigDecimal bigDecimal2 = cvqVar.b;
        BigDecimal bigDecimal3 = this.b;
        if (bigDecimal3 == null) {
            if (bigDecimal2 == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (bigDecimal2 == null) {
            zEquals = false;
        } else {
            zEquals = bigDecimal3.equals(bigDecimal2);
        }
        if (!zEquals) {
            return false;
        }
        BigDecimal bigDecimal4 = cvqVar.c;
        BigDecimal bigDecimal5 = this.c;
        if (bigDecimal5 == null) {
            if (bigDecimal4 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (bigDecimal4 == null) {
            zEquals2 = false;
        } else {
            zEquals2 = bigDecimal5.equals(bigDecimal4);
        }
        if (!zEquals2) {
            return false;
        }
        BigDecimal bigDecimal6 = cvqVar.d;
        BigDecimal bigDecimal7 = this.d;
        if (bigDecimal7 == null) {
            if (bigDecimal6 == null) {
                zEquals3 = true;
            } else {
                zEquals3 = false;
            }
        } else if (bigDecimal6 == null) {
            zEquals3 = false;
        } else {
            zEquals3 = bigDecimal7.equals(bigDecimal6);
        }
        return zEquals3;
    }

    public final int hashCode() {
        rkd0.a aVar = rkd0.Companion;
        int iHashCode = this.a.hashCode() * 31;
        BigDecimal bigDecimal = this.b;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.c;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.d;
        return iHashCode3 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    public final String toString() {
        String plainString;
        String plainString2;
        String strA = rkd0.a(this.a);
        String plainString3 = "null";
        BigDecimal bigDecimal = this.b;
        if (bigDecimal == null) {
            plainString = "null";
        } else {
            plainString = bigDecimal.toPlainString();
            plainString.getClass();
        }
        BigDecimal bigDecimal2 = this.c;
        if (bigDecimal2 == null) {
            plainString2 = "null";
        } else {
            plainString2 = bigDecimal2.toPlainString();
            plainString2.getClass();
        }
        BigDecimal bigDecimal3 = this.d;
        if (bigDecimal3 != null) {
            plainString3 = bigDecimal3.toPlainString();
            plainString3.getClass();
        }
        return kwi.a(ux5.a("LNMyFavoriteStake(defaultStake=", strA, ", quickAddStake1=", plainString, ", quickAddStake2="), plainString2, ", quickAddStake3=", plainString3, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cvq() {
        this(rkd0.b, null, null, null);
        rkd0.Companion.getClass();
    }
}
