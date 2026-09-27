package ne;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g("javax.inject.Singleton")
@he.f({"javax.inject.Named"})
public final class h implements he.c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Context> f116466a;

    public h(cr.c<Context> cVar) {
        this.f116466a = cVar;
    }

    public static h a(cr.c<Context> cVar) {
        return new h(cVar);
    }

    public static String c(Context context) {
        return (String) he.e.f(f.d(context));
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f116466a.get());
    }
}
