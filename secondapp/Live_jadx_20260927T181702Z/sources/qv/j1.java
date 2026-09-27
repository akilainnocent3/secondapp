package qv;

import jv.q3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class j1<T> implements q3<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f122993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final ThreadLocal<T> f122994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final or.j.c<?> f122995d;

    public j1(T t10, @oy.l ThreadLocal<T> threadLocal) {
        this.f122993b = t10;
        this.f122994c = threadLocal;
        this.f122995d = new k1(threadLocal);
    }

    @Override // jv.q3
    public T H(@oy.l or.j jVar) {
        T t10 = this.f122994c.get();
        this.f122994c.set(this.f122993b);
        return t10;
    }

    @Override // jv.q3
    public void f0(@oy.l or.j jVar, T t10) {
        this.f122994c.set(t10);
    }

    @Override // or.j.b, or.j
    public <R> R fold(R r10, @oy.l ds.p<? super R, ? super or.j.b, ? extends R> pVar) {
        return (R) q3.a.a(this, r10, pVar);
    }

    @Override // or.j.b, or.j
    @oy.m
    public <E extends or.j.b> E get(@oy.l or.j.c<E> cVar) {
        if (!kotlin.jvm.internal.m0.g(getKey(), cVar)) {
            return null;
        }
        kotlin.jvm.internal.m0.n(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // or.j.b
    @oy.l
    public or.j.c<?> getKey() {
        return this.f122995d;
    }

    @Override // or.j.b, or.j
    @oy.l
    public or.j minusKey(@oy.l or.j.c<?> cVar) {
        return kotlin.jvm.internal.m0.g(getKey(), cVar) ? or.l.f119535b : this;
    }

    @Override // or.j
    @oy.l
    public or.j plus(@oy.l or.j jVar) {
        return q3.a.d(this, jVar);
    }

    @oy.l
    public String toString() {
        return "ThreadLocal(value=" + this.f122993b + ", threadLocal = " + this.f122994c + ')';
    }
}
