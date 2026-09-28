package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jfq {
    public final boolean a;
    public final BigDecimal b;
    public final ocq c;

    public jfq(boolean z, BigDecimal bigDecimal, ocq ocqVar) {
        bigDecimal.getClass();
        ocqVar.getClass();
        this.a = z;
        this.b = bigDecimal;
        this.c = ocqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfq)) {
            return false;
        }
        jfq jfqVar = (jfq) obj;
        if (this.a != jfqVar.a) {
            return false;
        }
        BigDecimal bigDecimal = jfqVar.b;
        rkd0.a aVar = rkd0.Companion;
        return Intrinsics.g(this.b, bigDecimal) && Intrinsics.g(this.c, jfqVar.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        rkd0.a aVar = rkd0.Companion;
        return this.c.hashCode() + dd3.a(this.b, iHashCode, 31);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("LNGiftUserSelected(userEnableGift=", ", userAppliedGiftAmount=", rkd0.a(this.b), ", gift=", this.a);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
