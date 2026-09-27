package le;

import java.util.concurrent.Executor;
import me.y;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g
@he.f
public final class d implements he.c<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Executor> f103882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<fe.e> f103883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr.c<y> f103884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cr.c<ne.d> f103885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cr.c<oe.b> f103886e;

    public d(cr.c<Executor> cVar, cr.c<fe.e> cVar2, cr.c<y> cVar3, cr.c<ne.d> cVar4, cr.c<oe.b> cVar5) {
        this.f103882a = cVar;
        this.f103883b = cVar2;
        this.f103884c = cVar3;
        this.f103885d = cVar4;
        this.f103886e = cVar5;
    }

    public static d a(cr.c<Executor> cVar, cr.c<fe.e> cVar2, cr.c<y> cVar3, cr.c<ne.d> cVar4, cr.c<oe.b> cVar5) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static c c(Executor executor, fe.e eVar, y yVar, ne.d dVar, oe.b bVar) {
        return new c(executor, eVar, yVar, dVar, bVar);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f103882a.get(), this.f103883b.get(), this.f103884c.get(), this.f103885d.get(), this.f103886e.get());
    }
}
