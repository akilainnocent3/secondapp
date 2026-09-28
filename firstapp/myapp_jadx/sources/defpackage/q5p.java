package defpackage;

import com.appsflyer.internal.b0;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q5p {
    public final rdd0 a;
    public final psm b;

    public static final class a {
        public final long a;
        public final String b;
        public final boolean c;
        public final Integer d;
        public final String e;

        public a(long j, String str, boolean z, Integer num, String str2) {
            this.a = j;
            this.b = str;
            this.c = z;
            this.d = num;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c == aVar.c && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            int iA = mtg0.a(gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            Integer num = this.d;
            int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.e;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = b0.a(this.a, "BetTrackingParams(totalStake=", ", payAmount=", this.b);
            sbA.append(", useGift=");
            sbA.append(this.c);
            sbA.append(", selectedGiftKind=");
            sbA.append(this.d);
            return pr0.a(sbA, ", selectedGiftValue=", this.e, ")");
        }
    }

    public enum b {
        NETWORK_UNAVAILABLE("Network unavailable"),
        ROUND_CLOSED("Round closed"),
        REQUEST_TIMEOUT("Request timeout"),
        MISSING_ORDER_ID("Missing order ID"),
        EMPTY_RESPONSE("Empty response"),
        REQUEST_FAILED("Request failed");

        public final String a;

        b(String str) {
            this.a = str;
        }
    }

    public q5p(psm psmVar, rdd0 rdd0Var) {
        rdd0Var.getClass();
        psmVar.getClass();
        this.a = rdd0Var;
        this.b = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final o7p.a a(a aVar) {
        String str;
        Integer num;
        String strL = bjb0.L(BigDecimal.valueOf(aVar.a), Locale.US);
        String str2 = aVar.b;
        boolean z = aVar.c;
        if (!z || (num = aVar.d) == null) {
            str = null;
        } else {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                str = "cash";
            } else if (iIntValue == 2) {
                str = "discount";
            } else if (iIntValue != 3) {
                str = null;
            } else {
                str = "free_bet";
            }
        }
        return new o7p.a(strL, str2, str, aVar.c ? aVar.e : null, this.b.B(), z);
    }

    public final void b(o7p o7pVar) {
        this.a.a(o7pVar, k00.d);
    }
}
