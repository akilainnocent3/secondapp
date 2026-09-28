package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yxq {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final BigDecimal f;

    public yxq(String str, String str2, String str3, String str4, int i, BigDecimal bigDecimal) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        bigDecimal.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxq)) {
            return false;
        }
        yxq yxqVar = (yxq) obj;
        if (!Intrinsics.g(this.a, yxqVar.a) || !Intrinsics.g(this.b, yxqVar.b) || !Intrinsics.g(this.c, yxqVar.c) || !Intrinsics.g(this.d, yxqVar.d) || this.e != yxqVar.e) {
            return false;
        }
        BigDecimal bigDecimal = yxqVar.f;
        rkd0.a aVar = rkd0.Companion;
        return Intrinsics.g(this.f, bigDecimal);
    }

    public final int hashCode() {
        int iA = gpp.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        rkd0.a aVar = rkd0.Companion;
        return this.f.hashCode() + iA;
    }

    public final String toString() {
        String strA = rkd0.a(this.f);
        StringBuilder sbA = ux5.a("LNOutComeItem(name=", this.a, ", outcomeId=", this.b, ", odds=");
        hxa.c(sbA, this.c, ", probability=", this.d, ", balls=");
        sbA.append(this.e);
        sbA.append(", multiplier=");
        sbA.append(strA);
        sbA.append(")");
        return sbA.toString();
    }
}
