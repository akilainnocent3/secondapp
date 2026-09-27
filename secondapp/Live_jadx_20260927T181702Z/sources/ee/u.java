package ee;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class u<T> implements ae.l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f80811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ae.e f80813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ae.k<T, byte[]> f80814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f80815e;

    public u(r rVar, String str, ae.e eVar, ae.k<T, byte[]> kVar, v vVar) {
        this.f80811a = rVar;
        this.f80812b = str;
        this.f80813c = eVar;
        this.f80814d = kVar;
        this.f80815e = vVar;
    }

    @Override // ae.l
    public void a(ae.f<T> fVar, ae.n nVar) {
        this.f80815e.a(q.a().f(this.f80811a).c(fVar).g(this.f80812b).e(this.f80814d).b(this.f80813c).a(), nVar);
    }

    @Override // ae.l
    public void b(ae.f<T> fVar) {
        a(fVar, new ae.n() { // from class: ee.t
            @Override // ae.n
            public final void a(Exception exc) {
                u.c(exc);
            }
        });
    }

    public r d() {
        return this.f80811a;
    }

    public static /* synthetic */ void c(Exception exc) {
    }
}
