package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@bm.h
@bm.a
@bm.i("javax.inject.Singleton")
public final class v0 implements bm.c<u0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<w0> f159708a;

    public v0(cr.c<w0> cVar) {
        this.f159708a = cVar;
    }

    public static v0 a(cr.c<w0> cVar) {
        return new v0(cVar);
    }

    public static u0 c(w0 w0Var) {
        return new u0(w0Var);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u0 get() {
        return c(this.f159708a.get());
    }
}
