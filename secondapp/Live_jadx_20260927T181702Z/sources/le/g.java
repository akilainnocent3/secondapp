package le;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g
@he.f({"com.google.android.datatransport.runtime.time.WallTime"})
public final class g implements he.c<me.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<pe.a> f103887a;

    public g(cr.c<pe.a> cVar) {
        this.f103887a = cVar;
    }

    public static me.g a(pe.a aVar) {
        return (me.g) he.e.f(f.a(aVar));
    }

    public static g b(cr.c<pe.a> cVar) {
        return new g(cVar);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public me.g get() {
        return a(this.f103887a.get());
    }
}
