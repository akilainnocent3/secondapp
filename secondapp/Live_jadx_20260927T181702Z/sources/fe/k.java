package fe;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g
@he.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
public final class k implements he.c<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Context> f83919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<pe.a> f83920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr.c<pe.a> f83921c;

    public k(cr.c<Context> cVar, cr.c<pe.a> cVar2, cr.c<pe.a> cVar3) {
        this.f83919a = cVar;
        this.f83920b = cVar2;
        this.f83921c = cVar3;
    }

    public static k a(cr.c<Context> cVar, cr.c<pe.a> cVar2, cr.c<pe.a> cVar3) {
        return new k(cVar, cVar2, cVar3);
    }

    public static j c(Context context, pe.a aVar, pe.a aVar2) {
        return new j(context, aVar, aVar2);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f83919a.get(), this.f83920b.get(), this.f83921c.get());
    }
}
