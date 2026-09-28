package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface uz2 {

    public static final class a implements uz2 {
        public final BigDecimal a;

        public a(BigDecimal bigDecimal) {
            bigDecimal.getClass();
            this.a = bigDecimal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            BigDecimal bigDecimal = ((a) obj).a;
            BigDecimal bigDecimal2 = skd0.b;
            return Intrinsics.g(this.a, bigDecimal);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = skd0.b;
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateValue(value=" + ((Object) skd0.a(this.a)) + ')';
        }
    }
}
