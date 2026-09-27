package xs;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<c> f145578b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@oy.l List<? extends c> annotations) {
        m0.p(annotations, "annotations");
        this.f145578b = annotations;
    }

    @Override // xs.g
    public boolean I(@oy.l wt.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // xs.g
    @oy.m
    public c c(@oy.l wt.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // xs.g
    public boolean isEmpty() {
        return this.f145578b.isEmpty();
    }

    @Override // java.lang.Iterable
    @oy.l
    public Iterator<c> iterator() {
        return this.f145578b.iterator();
    }

    @oy.l
    public String toString() {
        return this.f145578b.toString();
    }
}
