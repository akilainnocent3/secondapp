package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gx2 extends hx2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f149814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f149815e;

    public gx2(pl2 pl2Var, long j10, long j11, long j12, long j13) {
        super(pl2Var, j10, j11);
        this.f149814d = j12;
        this.f149815e = j13;
    }

    public final pl2 b() {
        long j10 = this.f149815e;
        if (j10 <= 0) {
            return null;
        }
        return new pl2(null, this.f149814d, j10);
    }
}
