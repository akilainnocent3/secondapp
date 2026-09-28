package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ajk {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends ajk {
        public final BigDecimal a;
        public final BigDecimal b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public a(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, boolean z3) {
            bigDecimal.getClass();
            this.a = bigDecimal;
            this.b = bigDecimal2;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + mtg0.a(mtg0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(llGRV.NQnaJYQqeUEv);
            sb.append(this.a);
            sb.append(", giftValue=");
            sb.append(this.b);
            sb.append(", isSelect=");
            nng.a(", isAddToStake=", ", isGiftValueDown=", sb, this.c, this.d);
            return mq0.a(sb, this.e, ")");
        }
    }
}
