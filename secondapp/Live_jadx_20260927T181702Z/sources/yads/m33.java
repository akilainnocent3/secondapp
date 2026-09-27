package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m33 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq0 f152294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152295b;

    public m33(ld0 ld0Var, long j10) {
        this.f152294a = ld0Var;
        ni.a(ld0Var.a() >= j10);
        this.f152295b = j10;
    }

    @Override // yads.nq0
    public final long a() {
        return this.f152294a.a() - this.f152295b;
    }

    @Override // yads.nq0
    public final void b(int i10) {
        this.f152294a.b(i10);
    }

    @Override // yads.nq0
    public final long c() {
        return this.f152294a.c() - this.f152295b;
    }

    @Override // yads.nq0
    public final long getLength() {
        return this.f152294a.getLength() - this.f152295b;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f152294a.read(bArr, i10, i11);
    }

    @Override // yads.nq0
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f152294a.readFully(bArr, i10, i11);
    }

    @Override // yads.nq0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f152294a.b(bArr, i10, i11, z10);
    }

    @Override // yads.nq0
    public final void a(byte[] bArr, int i10, int i11) {
        this.f152294a.a(bArr, i10, i11);
    }

    @Override // yads.nq0
    public final void b() {
        this.f152294a.b();
    }

    @Override // yads.nq0
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f152294a.a(bArr, i10, i11, z10);
    }

    @Override // yads.nq0
    public final void a(int i10) {
        this.f152294a.a(i10);
    }
}
