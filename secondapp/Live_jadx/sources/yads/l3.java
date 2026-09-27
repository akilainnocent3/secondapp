package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh3 f151847a;

    public l3(kh3 kh3Var) {
        this.f151847a = kh3Var;
    }

    public final long a(q00 q00Var) {
        long j10 = q00Var.f154214b;
        int iOrdinal = q00Var.f154213a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return -1L;
            }
            return j10;
        }
        if (j10 == 100) {
            return Long.MIN_VALUE;
        }
        if (j10 == 0) {
            return 0L;
        }
        long j11 = this.f151847a.f151540a;
        if (j11 == -9223372036854775807L) {
            return -1L;
        }
        return (long) ((j10 / 100) * j11);
    }
}
