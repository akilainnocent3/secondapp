package defpackage;

import com.appsflyer.internal.l;
import com.appsflyer.internal.m;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ocq {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final BigDecimal e;
    public final long f;

    public ocq(String str, String str2, String str3, String str4, BigDecimal bigDecimal, long j) {
        m.a(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bigDecimal;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocq)) {
            return false;
        }
        ocq ocqVar = (ocq) obj;
        if (!Intrinsics.g(this.a, ocqVar.a) || !Intrinsics.g(this.b, ocqVar.b) || !Intrinsics.g(this.c, ocqVar.c) || !Intrinsics.g(this.d, ocqVar.d)) {
            return false;
        }
        BigDecimal bigDecimal = ocqVar.e;
        rkd0.a aVar = rkd0.Companion;
        return this.e.equals(bigDecimal) && this.f == ocqVar.f;
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iA2 = gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        rkd0.a aVar = rkd0.Companion;
        return Long.hashCode(this.f) + gpp.a(3, dd3.a(this.e, iA2, 31), 31);
    }

    public final String toString() {
        rkd0.a aVar = rkd0.Companion;
        String plainString = this.e.toPlainString();
        plainString.getClass();
        StringBuilder sbA = ux5.a("LNGift(giftId=", this.a, ", displayTitle=", this.b, ", displayDesc=");
        hxa.c(sbA, this.c, ", currency=", this.d, ", currentBalance=");
        l.a(this.f, plainString, ", kind=3, expireTime=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
