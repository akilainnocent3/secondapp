package fe;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g("javax.inject.Singleton")
@he.f
public final class m implements he.c<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Context> f83929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<j> f83930b;

    public m(cr.c<Context> cVar, cr.c<j> cVar2) {
        this.f83929a = cVar;
        this.f83930b = cVar2;
    }

    public static m a(cr.c<Context> cVar, cr.c<j> cVar2) {
        return new m(cVar, cVar2);
    }

    public static l c(Context context, Object obj) {
        return new l(context, (j) obj);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f83929a.get(), this.f83930b.get());
    }
}
