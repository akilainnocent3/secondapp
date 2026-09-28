package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;

/* JADX INFO: loaded from: classes6.dex */
public final class m3k {
    public final i6u a;
    public final pyp b;
    public final rdd0 c;

    public m3k(i6u i6uVar, pyp pypVar, rdd0 rdd0Var) {
        i6uVar.getClass();
        rdd0Var.getClass();
        this.a = i6uVar;
        this.b = pypVar;
        this.c = rdd0Var;
    }

    public static BigDecimal a(long j) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        bigDecimalValueOf.getClass();
        rkd0.a aVar = rkd0.Companion;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
        bigDecimalValueOf2.getClass();
        MathContext mathContext = MathContext.DECIMAL64;
        mathContext.getClass();
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, mathContext);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }
}
