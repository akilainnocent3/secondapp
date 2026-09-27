package cm;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@bm.h({"com.google.firebase.sessions.LocalOverrideSettingsProvider", "com.google.firebase.sessions.RemoteSettingsProvider"})
@bm.a
@bm.i("javax.inject.Singleton")
public final class k implements bm.c<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<o> f24901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<o> f24902b;

    public k(cr.c<o> cVar, cr.c<o> cVar2) {
        this.f24901a = cVar;
        this.f24902b = cVar2;
    }

    public static k a(cr.c<o> cVar, cr.c<o> cVar2) {
        return new k(cVar, cVar2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f24901a.get(), this.f24902b.get());
    }
}
