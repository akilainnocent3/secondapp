package defpackage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class oey {
    public static final AtomicLong a = new AtomicLong(0);

    public static final BigDecimal a(long j) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        bigDecimalValueOf.getClass();
        rkd0.a aVar = rkd0.Companion;
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
        bigDecimalValueOf2.getClass();
        bigDecimalValueOf2.getClass();
        MathContext mathContext = MathContext.DECIMAL64;
        mathContext.getClass();
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, mathContext);
        bigDecimalDivide.getClass();
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public static final q7q.b b(avq avqVar, vaq vaqVar) {
        avqVar.getClass();
        vaqVar.getClass();
        long jUpdateAndGet = a.updateAndGet(new ney());
        BigDecimal bigDecimalA = a(avqVar.a);
        BigDecimal bigDecimalA2 = a(avqVar.b);
        Long l = avqVar.c;
        return new q7q.b(jUpdateAndGet, bigDecimalA, bigDecimalA2, l != null ? a(l.longValue()) : null, vaqVar);
    }
}
