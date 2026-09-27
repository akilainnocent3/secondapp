package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kx2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u30 f151765c;

    public kx2(long j10, u30 u30Var) {
        this.f151764b = j10;
        this.f151765c = u30Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f151764b;
        long j11 = ((kx2) obj).f151764b;
        int i10 = ib3.f150516a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }
}
