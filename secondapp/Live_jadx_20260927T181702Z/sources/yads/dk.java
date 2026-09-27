package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dk implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f148237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f148241e;

    public dk(wj wjVar) {
        jb2 jb2Var = wjVar.f157394b;
        this.f148237a = jb2Var;
        jb2Var.e(12);
        this.f148239c = jb2Var.p() & 255;
        this.f148238b = jb2Var.p();
    }

    @Override // yads.ak
    public final int a() {
        return -1;
    }

    @Override // yads.ak
    public final int b() {
        return this.f148238b;
    }

    @Override // yads.ak
    public final int c() {
        int i10 = this.f148239c;
        if (i10 == 8) {
            return this.f148237a.m();
        }
        if (i10 == 16) {
            return this.f148237a.r();
        }
        int i11 = this.f148240d;
        this.f148240d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f148241e & 15;
        }
        int iM = this.f148237a.m();
        this.f148241e = iM;
        return (iM & 240) >> 4;
    }
}
