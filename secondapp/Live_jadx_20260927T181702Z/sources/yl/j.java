package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@bm.h
@bm.a
@bm.i("javax.inject.Singleton")
public final class j implements bm.c<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<dl.b<ae.m>> f159629a;

    public j(cr.c<dl.b<ae.m>> cVar) {
        this.f159629a = cVar;
    }

    public static j a(cr.c<dl.b<ae.m>> cVar) {
        return new j(cVar);
    }

    public static h c(dl.b<ae.m> bVar) {
        return new h(bVar);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f159629a.get());
    }
}
