package v6;

import x4.g1;
import x4.m1;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f140243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f140244b;

    public g(long j10, long j11) {
        this.f140243a = j10;
        this.f140244b = j11;
    }

    public static g b(v0 v0Var, long j10, g1 g1Var) {
        long jC = c(v0Var, j10);
        return new g(jC, g1Var.b(jC));
    }

    public static long c(v0 v0Var, long j10) {
        long jU = v0Var.U();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | v0Var.W()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // v6.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f140243a + ", playbackPositionUs= " + this.f140244b + " }";
    }
}
