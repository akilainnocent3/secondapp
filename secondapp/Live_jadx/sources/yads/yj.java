package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f158362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f158363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f158364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f158365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f158366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f158367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f158368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f158369i;

    public yj(jb2 jb2Var, jb2 jb2Var2, boolean z10) throws ob2 {
        this.f158367g = jb2Var;
        this.f158366f = jb2Var2;
        this.f158365e = z10;
        jb2Var2.e(12);
        this.f158361a = jb2Var2.p();
        jb2Var.e(12);
        this.f158369i = jb2Var.p();
        qq0.a("first_chunk must be 1", jb2Var.b() == 1);
        this.f158362b = -1;
    }

    public final boolean a() {
        int i10 = this.f158362b + 1;
        this.f158362b = i10;
        if (i10 == this.f158361a) {
            return false;
        }
        this.f158364d = this.f158365e ? this.f158366f.q() : this.f158366f.n();
        if (this.f158362b == this.f158368h) {
            this.f158363c = this.f158367g.p();
            jb2 jb2Var = this.f158367g;
            jb2Var.e(jb2Var.f151002b + 4);
            int i11 = this.f158369i - 1;
            this.f158369i = i11;
            this.f158368h = i11 > 0 ? this.f158367g.p() - 1 : -1;
        }
        return true;
    }
}
