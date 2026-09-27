package ah;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b1 implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.a f5048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh.v0 f5049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5050c;

    public b1(v.a aVar, eh.v0 v0Var, int i10) {
        this.f5048a = aVar;
        this.f5049b = v0Var;
        this.f5050c = i10;
    }

    @Override // ah.v.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a1 createDataSource() {
        return new a1(this.f5048a.createDataSource(), this.f5049b, this.f5050c);
    }
}
