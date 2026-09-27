package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r42 implements jv.o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz1 f154751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jv.o0.b f154752c = jv.o0.f100846ga;

    public r42(hz1 hz1Var) {
        this.f154751b = hz1Var;
    }

    @Override // or.j.b, or.j
    public final Object fold(Object obj, ds.p pVar) {
        return jv.o0.a.a(this, obj, pVar);
    }

    @Override // or.j.b, or.j
    public final or.j.b get(or.j.c cVar) {
        return jv.o0.a.b(this, cVar);
    }

    @Override // or.j.b
    public final or.j.c getKey() {
        return this.f154752c;
    }

    @Override // jv.o0
    public final void handleException(or.j jVar, Throwable th2) {
        th2.toString();
        boolean z10 = ad1.f146762a;
        hz1 hz1Var = this.f154751b;
        l4 l4Var = h9.f149978a;
        hz1Var.a(h9.f150000w);
    }

    @Override // or.j.b, or.j
    public final or.j minusKey(or.j.c cVar) {
        return jv.o0.a.c(this, cVar);
    }

    @Override // or.j
    public final or.j plus(or.j jVar) {
        return jv.o0.a.d(this, jVar);
    }
}
