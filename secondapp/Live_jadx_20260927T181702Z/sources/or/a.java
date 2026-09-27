package or;

import dr.l1;
import ds.p;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
public abstract class a implements j.b {

    @oy.l
    private final j.c<?> key;

    public a(@oy.l j.c<?> key) {
        m0.p(key, "key");
        this.key = key;
    }

    @Override // or.j.b, or.j
    public <R> R fold(R r10, @oy.l p<? super R, ? super j.b, ? extends R> pVar) {
        return (R) j.b.a.a(this, r10, pVar);
    }

    @Override // or.j.b, or.j
    @oy.m
    public <E extends j.b> E get(@oy.l j.c<E> cVar) {
        return (E) j.b.a.b(this, cVar);
    }

    @Override // or.j.b
    @oy.l
    public j.c<?> getKey() {
        return this.key;
    }

    @Override // or.j.b, or.j
    @oy.l
    public j minusKey(@oy.l j.c<?> cVar) {
        return j.b.a.c(this, cVar);
    }

    @Override // or.j
    @oy.l
    public j plus(@oy.l j jVar) {
        return j.b.a.d(this, jVar);
    }
}
