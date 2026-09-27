package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class jo extends cu {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f151189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f151190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f151191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public lo f151192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f151193n;

    public jo(p30 p30Var, u30 u30Var, mx0 mx0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(p30Var, u30Var, 1, mx0Var, i10, obj, j10, j11);
        mx0Var.getClass();
        this.f151189j = j14;
        this.f151190k = j12;
        this.f151191l = j13;
    }

    public final int a(int i10) {
        int[] iArr = this.f151193n;
        if (iArr != null) {
            return iArr[i10];
        }
        throw new IllegalStateException();
    }

    public long c() {
        long j10 = this.f151189j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean d();
}
