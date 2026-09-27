package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f150267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f150268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pe f150269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hs2 f150270d;

    public hs2(int i10, long j10) {
        a(i10, j10);
    }

    public final void a(int i10, long j10) {
        if (this.f150269c != null) {
            throw new IllegalStateException();
        }
        this.f150267a = j10;
        this.f150268b = j10 + ((long) i10);
    }
}
