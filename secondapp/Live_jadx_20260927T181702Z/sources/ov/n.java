package ov;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements or.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ or.j f119974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    @cs.g
    public final Throwable f119975c;

    public n(@oy.l Throwable th2, @oy.l or.j jVar) {
        this.f119974b = jVar;
        this.f119975c = th2;
    }

    @Override // or.j
    public <R> R fold(R r10, @oy.l ds.p<? super R, ? super or.j.b, ? extends R> pVar) {
        return (R) this.f119974b.fold(r10, pVar);
    }

    @Override // or.j
    @oy.m
    public <E extends or.j.b> E get(@oy.l or.j.c<E> cVar) {
        return (E) this.f119974b.get(cVar);
    }

    @Override // or.j
    @oy.l
    public or.j minusKey(@oy.l or.j.c<?> cVar) {
        return this.f119974b.minusKey(cVar);
    }

    @Override // or.j
    @oy.l
    public or.j plus(@oy.l or.j jVar) {
        return this.f119974b.plus(jVar);
    }
}
