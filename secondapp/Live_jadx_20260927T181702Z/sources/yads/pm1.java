package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public interface pm1 extends rx2 {
    long a(long j10, ww2 ww2Var);

    long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10);

    void a(om1 om1Var, long j10);

    void discardBuffer(long j10, boolean z10);

    i73 getTrackGroups();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j10);
}
