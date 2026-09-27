package au;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i extends j {
    @Override // au.j
    public void b(@oy.l ws.b first, @oy.l ws.b second) {
        m0.p(first, "first");
        m0.p(second, "second");
        e(first, second);
    }

    @Override // au.j
    public void c(@oy.l ws.b fromSuper, @oy.l ws.b fromCurrent) {
        m0.p(fromSuper, "fromSuper");
        m0.p(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    public abstract void e(@oy.l ws.b bVar, @oy.l ws.b bVar2);
}
