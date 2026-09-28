package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;

/* JADX INFO: loaded from: classes6.dex */
public final class c7k {
    public final uhq a;
    public final i6u b;

    public c7k(uhq uhqVar, i6u i6uVar) {
        i6uVar.getClass();
        this.a = uhqVar;
        this.b = i6uVar;
    }

    public static BigDecimal b(long j) {
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

    public final yzh a(String str) {
        str.getClass();
        uhq uhqVar = this.a;
        return bm50.a(new n1i(uhqVar.b.c(new thq(uhqVar, str, null)), this.b.f.a(), new b7k(this, null)));
    }
}
