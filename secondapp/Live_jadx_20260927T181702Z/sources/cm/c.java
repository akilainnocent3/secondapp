package cm;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@bm.h
@bm.a
@bm.i("javax.inject.Singleton")
public final class c implements bm.c<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Context> f24849a;

    public c(cr.c<Context> cVar) {
        this.f24849a = cVar;
    }

    public static c a(cr.c<Context> cVar) {
        return new c(cVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f24849a.get());
    }
}
