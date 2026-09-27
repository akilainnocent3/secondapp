package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ko implements yj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f151626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f151627d;

    public ko(long j10, long j11) {
        this.f151625b = j10;
        this.f151626c = j11;
        c();
    }

    public final void c() {
        this.f151627d = this.f151625b - 1;
    }

    @Override // yads.yj1
    public final boolean next() {
        long j10 = this.f151627d + 1;
        this.f151627d = j10;
        return !(j10 > this.f151626c);
    }
}
