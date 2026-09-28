package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ldj0 {

    public static final class a implements ldj0 {
        public final BigDecimal a;

        public a(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StakeAmountBelowMin(minAmount=" + this.a + ")";
        }
    }

    public static final class b implements ldj0 {
        public final BigDecimal a;

        public b(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StakeAmountExceedsBaseAmount(baseAmount=" + this.a + ")";
        }
    }

    public static final class c implements ldj0 {
        public final BigDecimal a;
        public final BigDecimal b;

        public c(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            bigDecimal.getClass();
            bigDecimal2.getClass();
            this.a = bigDecimal;
            this.b = bigDecimal2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StakeAmountExceedsMaxLimitButBelowBaseAmount(maxLimitAmount=" + this.a + ", baseAmount=" + this.b + ")";
        }
    }

    public static final class d implements ldj0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 24888115;
        }

        public final String toString() {
            return "Valid";
        }
    }
}
