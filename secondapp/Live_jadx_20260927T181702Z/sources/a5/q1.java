package a5;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
@Deprecated
public final class q1 implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.a f3772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.x1 f3773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3774c;

    public q1(r.a aVar, u4.x1 x1Var, int i10) {
        this.f3772a = aVar;
        this.f3773b = x1Var;
        this.f3774c = i10;
    }

    @Override // a5.r.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p1 createDataSource() {
        return new p1(this.f3772a.createDataSource(), this.f3773b, this.f3774c);
    }
}
