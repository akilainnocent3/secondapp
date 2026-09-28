package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public final class a7q {
    public final c5u a;
    public final i6u b;

    public a7q(c5u c5uVar, i6u i6uVar) {
        c5uVar.getClass();
        i6uVar.getClass();
        this.a = c5uVar;
        this.b = i6uVar;
    }

    public static long a(BigDecimal bigDecimal) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10000L);
        bigDecimalValueOf.getClass();
        rkd0.a aVar = rkd0.Companion;
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply.longValueExact();
    }
}
