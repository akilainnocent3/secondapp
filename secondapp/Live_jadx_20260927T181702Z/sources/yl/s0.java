package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@bm.h
@bm.a
@bm.i("javax.inject.Singleton")
public final class s0 implements bm.c<r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<a1> f159686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<c1> f159687b;

    public s0(cr.c<a1> cVar, cr.c<c1> cVar2) {
        this.f159686a = cVar;
        this.f159687b = cVar2;
    }

    public static s0 a(cr.c<a1> cVar, cr.c<c1> cVar2) {
        return new s0(cVar, cVar2);
    }

    public static r0 c(a1 a1Var, c1 c1Var) {
        return new r0(a1Var, c1Var);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 get() {
        return c(this.f159686a.get(), this.f159687b.get());
    }
}
