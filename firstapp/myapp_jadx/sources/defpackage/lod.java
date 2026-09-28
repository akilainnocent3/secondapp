package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public interface lod {

    public static final class a implements lod {
        public static final a a = new a();
    }

    public static final class b implements lod {
        public static final b a = new b();
    }

    public static final class c implements lod {
        public final BigDecimal a;

        public c(BigDecimal bigDecimal) {
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OverMax(maxAmount=" + this.a + ")";
        }
    }

    public static final class d implements lod {
        public final BigDecimal a;

        public d(BigDecimal bigDecimal) {
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UnderMin(minAmount=" + this.a + ")";
        }
    }

    public static final class e implements lod {
        public static final e a = new e();
    }

    public static final class f implements lod {
        public static final f a = new f();
    }
}
