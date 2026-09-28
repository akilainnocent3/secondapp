package defpackage;

import com.sportygames.newcms.CMSRes;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class il7 {
    public final boolean a;
    public final CMSRes b;
    public final String c;
    public final BigDecimal d;

    public il7(boolean z, CMSRes cMSRes, String str, BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.a = z;
        this.b = cMSRes;
        this.c = str;
        this.d = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il7)) {
            return false;
        }
        il7 il7Var = (il7) obj;
        if (this.a != il7Var.a || !Intrinsics.g(this.b, il7Var.b) || !this.c.equals(il7Var.c)) {
            return false;
        }
        BigDecimal bigDecimal = il7Var.d;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.d, bigDecimal);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        CMSRes cMSRes = this.b;
        int iA = gmf0.a((iHashCode + (cMSRes == null ? 0 : cMSRes.hashCode())) * 31, 31, this.c);
        BigDecimal bigDecimal = skd0.b;
        return this.d.hashCode() + iA;
    }

    public final String toString() {
        return "ChipsItem(enable=" + this.a + ", icon=" + this.b + ", text=" + this.c + ", value=" + ((Object) skd0.a(this.d)) + ')';
    }
}
