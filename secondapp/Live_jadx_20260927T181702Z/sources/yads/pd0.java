package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pd0 implements o30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f153892b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t11 f153891a = new t11();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153893c = 8000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153894d = 8000;

    @Override // yads.o30
    public final p30 createDataSource() {
        return new td0(this.f153892b, this.f153893c, this.f153894d, false, this.f153891a);
    }
}
