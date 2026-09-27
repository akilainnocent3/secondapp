package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class uw2 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f156659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tw2 f156660b;

    public uw2() {
        this(-9223372036854775807L, 0L);
    }

    @Override // yads.vw2
    public final boolean b() {
        return false;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f156659a;
    }

    public uw2(long j10, long j11) {
        this.f156659a = j10;
        this.f156660b = new tw2(j11 == 0 ? xw2.f158029c : new xw2(0L, j11));
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        return this.f156660b;
    }
}
