package ls;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends ks.a {
    @Override // ks.f
    public double m(double d10) {
        return ThreadLocalRandom.current().nextDouble(d10);
    }

    @Override // ks.f
    public int r(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // ks.f
    public long t(long j10) {
        return ThreadLocalRandom.current().nextLong(j10);
    }

    @Override // ks.f
    public long u(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // ks.a
    @l
    public Random v() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        m0.o(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
