package c9;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements or.j.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.j.c<a> f22684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final r f22685c;

    public a(@oy.l or.j.c<a> key, @oy.l r connectionWrapper) {
        m0.p(key, "key");
        m0.p(connectionWrapper, "connectionWrapper");
        this.f22684b = key;
        this.f22685c = connectionWrapper;
    }

    @oy.l
    public final r d() {
        return this.f22685c;
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
    public or.j.c<a> getKey() {
        return this.f22684b;
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
