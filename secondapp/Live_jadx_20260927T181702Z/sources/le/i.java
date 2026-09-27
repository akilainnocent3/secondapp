package le;

import android.content.Context;
import me.y;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g
@he.f({"com.google.android.datatransport.runtime.time.Monotonic"})
public final class i implements he.c<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Context> f103888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<ne.d> f103889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr.c<me.g> f103890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cr.c<pe.a> f103891d;

    public i(cr.c<Context> cVar, cr.c<ne.d> cVar2, cr.c<me.g> cVar3, cr.c<pe.a> cVar4) {
        this.f103888a = cVar;
        this.f103889b = cVar2;
        this.f103890c = cVar3;
        this.f103891d = cVar4;
    }

    public static i a(cr.c<Context> cVar, cr.c<ne.d> cVar2, cr.c<me.g> cVar3, cr.c<pe.a> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static y c(Context context, ne.d dVar, me.g gVar, pe.a aVar) {
        return (y) he.e.f(h.b(context, dVar, gVar, aVar));
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f103888a.get(), this.f103889b.get(), this.f103890c.get(), this.f103891d.get());
    }
}
