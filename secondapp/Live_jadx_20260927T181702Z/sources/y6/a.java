package y6;

import f6.r0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends f6.k implements i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f146338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f146339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f146340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f146341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f146342m;

    public a(long j10, long j11, r0.a aVar, boolean z10) {
        this(j10, j11, aVar.f83650f, aVar.f83647c, z10, true);
    }

    @Override // y6.i
    public long a() {
        return this.f146342m;
    }

    @Override // y6.i
    public long d() {
        return this.f146338i;
    }

    @Override // y6.i
    public int g() {
        return this.f146339j;
    }

    @Override // y6.i
    public long getTimeUs(long j10) {
        return h(j10);
    }

    public a j(long j10) {
        return new a(j10, this.f146338i, this.f146339j, this.f146340k, this.f146341l, false);
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        this(j10, j11, i10, i11, z10, true);
    }

    public a(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        super(j10, j11, i10, i11, z10, z11);
        long j12 = j10;
        this.f146338i = j11;
        this.f146339j = i10;
        this.f146340k = i11;
        this.f146341l = z10;
        this.f146342m = j12 == -1 ? -1L : j12;
    }
}
