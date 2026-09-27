package me;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g
@he.f
public final class x implements he.c<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr.c<Executor> f107331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr.c<ne.d> f107332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr.c<y> f107333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cr.c<oe.b> f107334d;

    public x(cr.c<Executor> cVar, cr.c<ne.d> cVar2, cr.c<y> cVar3, cr.c<oe.b> cVar4) {
        this.f107331a = cVar;
        this.f107332b = cVar2;
        this.f107333c = cVar3;
        this.f107334d = cVar4;
    }

    public static x a(cr.c<Executor> cVar, cr.c<ne.d> cVar2, cr.c<y> cVar3, cr.c<oe.b> cVar4) {
        return new x(cVar, cVar2, cVar3, cVar4);
    }

    public static w c(Executor executor, ne.d dVar, y yVar, oe.b bVar) {
        return new w(executor, dVar, yVar, bVar);
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f107331a.get(), this.f107332b.get(), this.f107333c.get(), this.f107334d.get());
    }
}
