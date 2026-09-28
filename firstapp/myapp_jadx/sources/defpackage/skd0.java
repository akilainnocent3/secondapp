package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class skd0 implements Comparable<skd0> {
    public static final BigDecimal b;
    public final BigDecimal a;

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        b = bigDecimal;
        BigDecimal.ONE.getClass();
        BigDecimal.TEN.getClass();
    }

    public static String a(BigDecimal bigDecimal) {
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        return plainString;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(skd0 skd0Var) {
        return this.a.compareTo(skd0Var.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof skd0) {
            return Intrinsics.g(this.a, ((skd0) obj).a);
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
