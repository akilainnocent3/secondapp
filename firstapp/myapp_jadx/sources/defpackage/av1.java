package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface av1 {

    public static final class a {
        public final String a;
        public final BigDecimal b;
        public final BigDecimal c;

        public a(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            str.getClass();
            this.a = str;
            this.b = bigDecimal;
            this.c = bigDecimal2;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0021  */
        /* JADX WARN: Code duplicated, block: B:25:0x0039  */
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.g(this.a, aVar.a)) {
                return false;
            }
            BigDecimal bigDecimal = aVar.b;
            BigDecimal bigDecimal2 = this.b;
            if (bigDecimal2 == null) {
                if (bigDecimal == null) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
            } else if (bigDecimal == null) {
                zEquals = false;
            } else {
                BigDecimal bigDecimal3 = skd0.b;
                zEquals = bigDecimal2.equals(bigDecimal);
            }
            if (!zEquals) {
                return false;
            }
            BigDecimal bigDecimal4 = aVar.c;
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
                BigDecimal bigDecimal6 = skd0.b;
                zEquals2 = bigDecimal5.equals(bigDecimal4);
            }
            return zEquals2;
        }

        public final int hashCode() {
            int iHashCode;
            int iHashCode2 = this.a.hashCode() * 31;
            int iHashCode3 = 0;
            BigDecimal bigDecimal = this.b;
            if (bigDecimal == null) {
                iHashCode = 0;
            } else {
                BigDecimal bigDecimal2 = skd0.b;
                iHashCode = bigDecimal.hashCode();
            }
            int i = (iHashCode2 + iHashCode) * 31;
            BigDecimal bigDecimal3 = this.c;
            if (bigDecimal3 != null) {
                BigDecimal bigDecimal4 = skd0.b;
                iHashCode3 = bigDecimal3.hashCode();
            }
            return i + iHashCode3;
        }

        public final String toString() {
            String plainString;
            StringBuilder sb = new StringBuilder("UserBalance(currency=");
            sb.append(this.a);
            sb.append(", balance=");
            String plainString2 = "null";
            BigDecimal bigDecimal = this.b;
            if (bigDecimal == null) {
                plainString = "null";
            } else {
                BigDecimal bigDecimal2 = skd0.b;
                plainString = bigDecimal.toPlainString();
                plainString.getClass();
            }
            sb.append((Object) plainString);
            sb.append(", diff=");
            BigDecimal bigDecimal3 = this.c;
            if (bigDecimal3 != null) {
                BigDecimal bigDecimal4 = skd0.b;
                plainString2 = bigDecimal3.toPlainString();
                plainString2.getClass();
            }
            sb.append((Object) plainString2);
            sb.append(')');
            return sb.toString();
        }
    }

    static String k1(BigDecimal bigDecimal) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.ENGLISH));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = decimalFormat.format(bigDecimal.doubleValue());
        str.getClass();
        return str;
    }
}
