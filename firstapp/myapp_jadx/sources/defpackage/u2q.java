package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u2q {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final BigDecimal e;
    public final BigDecimal f;

    public u2q(String str, String str2, long j, long j2, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bigDecimal;
        this.f = bigDecimal2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2q)) {
            return false;
        }
        u2q u2qVar = (u2q) obj;
        if (!Intrinsics.g(this.a, u2qVar.a) || !Intrinsics.g(this.b, u2qVar.b) || this.c != u2qVar.c || this.d != u2qVar.d) {
            return false;
        }
        BigDecimal bigDecimal = u2qVar.e;
        rkd0.a aVar = rkd0.Companion;
        return Intrinsics.g(this.e, bigDecimal) && Intrinsics.g(this.f, u2qVar.f);
    }

    public final int hashCode() {
        int iA = f87.a(f87.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
        rkd0.a aVar = rkd0.Companion;
        return this.f.hashCode() + dd3.a(this.e, iA, 31);
    }

    public final String toString() {
        String strA = rkd0.a(this.e);
        String strA2 = rkd0.a(this.f);
        StringBuilder sbA = ux5.a("LNBetResponse(orderId=", this.a, ", shortId=", this.b, ", createdTime=");
        sbA.append(this.c);
        g41.a(this.d, ", drawTime=", ", totalAmount=", sbA);
        return kwi.a(sbA, strA, ", odds=", strA2, ")");
    }
}
