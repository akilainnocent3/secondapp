package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x21 implements ul0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f157632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f157633c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f157635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f157636f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f157631a = new jb2(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f157634d = -9223372036854775807L;

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f157632b == null) {
            throw new IllegalStateException();
        }
        if (this.f157633c) {
            int i10 = jb2Var.f151003c - jb2Var.f151002b;
            int i11 = this.f157636f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(jb2Var.f151001a, jb2Var.f151002b, this.f157631a.f151001a, this.f157636f, iMin);
                if (this.f157636f + iMin == 10) {
                    this.f157631a.e(0);
                    if (73 != this.f157631a.m() || 68 != this.f157631a.m() || 51 != this.f157631a.m()) {
                        ih1.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f157633c = false;
                        return;
                    } else {
                        jb2 jb2Var2 = this.f157631a;
                        jb2Var2.e(jb2Var2.f151002b + 3);
                        this.f157635e = this.f157631a.l() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f157635e - this.f157636f);
            this.f157632b.a(iMin2, jb2Var);
            this.f157636f += iMin2;
        }
    }

    @Override // yads.ul0
    public final void b() {
        int i10;
        m73 m73Var = this.f157632b;
        if (m73Var == null) {
            throw new IllegalStateException();
        }
        if (this.f157633c && (i10 = this.f157635e) != 0 && this.f157636f == i10) {
            long j10 = this.f157634d;
            if (j10 != -9223372036854775807L) {
                m73Var.a(j10, 1, i10, 0, null);
            }
            this.f157633c = false;
        }
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f151906d, 5);
        this.f157632b = m73VarA;
        lx0 lx0Var = new lx0();
        l93Var.b();
        lx0Var.f152182a = l93Var.f151907e;
        lx0Var.f152192k = "application/id3";
        m73VarA.a(new mx0(lx0Var));
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f157633c = true;
        if (j10 != -9223372036854775807L) {
            this.f157634d = j10;
        }
        this.f157635e = 0;
        this.f157636f = 0;
    }

    @Override // yads.ul0
    public final void a() {
        this.f157633c = false;
        this.f157634d = -9223372036854775807L;
    }
}
