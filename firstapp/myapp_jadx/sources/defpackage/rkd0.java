package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80(with = vkd0.class)
public final class rkd0 implements Comparable<rkd0> {
    public static final a Companion = new a();
    public static final BigDecimal b;
    public final BigDecimal a;

    public static final class a {
        public final php<rkd0> serializer() {
            return vkd0.a;
        }
    }

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        bigDecimal.getClass();
        b = bigDecimal;
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        bigDecimal2.getClass();
        bigDecimal2.getClass();
        BigDecimal bigDecimal3 = BigDecimal.TEN;
        bigDecimal3.getClass();
        bigDecimal3.getClass();
    }

    public static String a(BigDecimal bigDecimal) {
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        return plainString;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(rkd0 rkd0Var) {
        return this.a.compareTo(rkd0Var.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rkd0) {
            return Intrinsics.g(this.a, ((rkd0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
