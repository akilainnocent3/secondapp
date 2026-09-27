package yads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ex2 extends cx2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final va3 f148873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final va3 f148874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f148875l;

    public ex2(pl2 pl2Var, long j10, long j11, long j12, long j13, long j14, List list, long j15, va3 va3Var, va3 va3Var2, long j16, long j17) {
        super(pl2Var, j10, j11, j12, j14, list, j15, j16, j17);
        this.f148873j = va3Var;
        this.f148874k = va3Var2;
        this.f148875l = j13;
    }

    @Override // yads.hx2
    public final pl2 a(lo2 lo2Var) {
        va3 va3Var = this.f148873j;
        if (va3Var == null) {
            return this.f150334a;
        }
        mx0 mx0Var = lo2Var.f152070a;
        return new pl2(va3Var.a(mx0Var.f152718b, 0L, mx0Var.f152725i, 0L), 0L, -1L);
    }

    @Override // yads.cx2
    public final long a(long j10) {
        List list = this.f147934f;
        if (list != null) {
            return list.size();
        }
        long j11 = this.f148875l;
        if (j11 != -1) {
            return (j11 - this.f147932d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f150335b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f147933e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = kp.f151650a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // yads.cx2
    public final pl2 a(long j10, lo2 lo2Var) {
        long j11;
        List list = this.f147934f;
        if (list != null) {
            j11 = ((fx2) list.get((int) (j10 - this.f147932d))).f149291a;
        } else {
            j11 = (j10 - this.f147932d) * this.f147933e;
        }
        long j12 = j11;
        va3 va3Var = this.f148874k;
        mx0 mx0Var = lo2Var.f152070a;
        return new pl2(va3Var.a(mx0Var.f152718b, j10, mx0Var.f152725i, j12), 0L, -1L);
    }
}
