package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z7z {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a extends z7z {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1576810566;
        }

        public final String toString() {
            return "BestOddsBoost";
        }
    }

    public static final class b extends z7z {
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
            return "Lfb(ratio=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends z7z {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -960303635;
        }

        public final String toString() {
            return "None";
        }
    }
}
