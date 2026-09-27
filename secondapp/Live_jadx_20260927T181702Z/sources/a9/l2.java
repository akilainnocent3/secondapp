package a9;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class l2 implements or.j.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f4205c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.g f4206b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements or.j.c<l2> {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    public l2(@oy.l or.g transactionDispatcher) {
        kotlin.jvm.internal.m0.p(transactionDispatcher, "transactionDispatcher");
        this.f4206b = transactionDispatcher;
    }

    @oy.l
    public final or.g d() {
        return this.f4206b;
    }

    @Override // or.j.b, or.j
    public <R> R fold(R r10, @oy.l ds.p<? super R, ? super or.j.b, ? extends R> pVar) {
        return (R) or.j.b.a.a(this, r10, pVar);
    }

    @Override // or.j.b, or.j
    @oy.m
    public <E extends or.j.b> E get(@oy.l or.j.c<E> cVar) {
        return (E) or.j.b.a.b(this, cVar);
    }

    @Override // or.j.b
    @oy.l
    public or.j.c<l2> getKey() {
        return f4205c;
    }

    @Override // or.j.b, or.j
    @oy.l
    public or.j minusKey(@oy.l or.j.c<?> cVar) {
        return or.j.b.a.c(this, cVar);
    }

    @Override // or.j
    @oy.l
    public or.j plus(@oy.l or.j jVar) {
        return or.j.b.a.d(this, jVar);
    }
}
