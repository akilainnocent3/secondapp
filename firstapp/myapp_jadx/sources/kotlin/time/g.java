package kotlin.time;

import defpackage.rgf;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final long a(long j) {
        if (j < 0) {
            b.b.getClass();
            return b.d;
        }
        b.b.getClass();
        return b.c;
    }

    public static final long b(long j, long j2, rgf rgfVar) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return c.i(j3, rgfVar);
        }
        rgf rgfVar2 = rgf.MILLISECONDS;
        if (rgfVar.compareTo(rgfVar2) >= 0) {
            return b.l(a(j3));
        }
        long jConvert = rgfVar.a.convert(1L, TimeUnit.MILLISECONDS);
        long j4 = (j / jConvert) - (j2 / jConvert);
        long j5 = (j % jConvert) - (j2 % jConvert);
        b.a aVar = b.b;
        return b.i(c.i(j4, rgfVar2), c.i(j5, rgfVar));
    }

    public static final long c(long j, long j2, rgf rgfVar) {
        rgfVar.getClass();
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? a(j) : b(j, j2, rgfVar);
        }
        if (j != j2) {
            return b.l(a(j2));
        }
        b.b.getClass();
        return 0L;
    }
}
