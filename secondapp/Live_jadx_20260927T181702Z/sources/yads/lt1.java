package yads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lt1 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f152122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f152123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f152124c;

    public lt1(long j10, long[] jArr, long[] jArr2) {
        this.f152122a = jArr;
        this.f152123b = jArr2;
        this.f152124c = j10 == -9223372036854775807L ? ib3.a(jArr2[jArr2.length - 1]) : j10;
    }

    @Override // yads.zw2
    public final long a() {
        return -1L;
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f152124c;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        return ib3.a(((Long) a(j10, this.f152122a, this.f152123b).second).longValue());
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long j11 = this.f152124c;
        int i10 = ib3.f150516a;
        Pair pairA = a(ib3.b(Math.max(0L, Math.min(j10, j11))), this.f152123b, this.f152122a);
        xw2 xw2Var = new xw2(ib3.a(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new tw2(xw2Var, xw2Var);
    }

    public static Pair a(long j10, long[] jArr, long[] jArr2) {
        int iB = ib3.b(jArr, j10, true);
        long j11 = jArr[iB];
        long j12 = jArr2[iB];
        int i10 = iB + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }
}
