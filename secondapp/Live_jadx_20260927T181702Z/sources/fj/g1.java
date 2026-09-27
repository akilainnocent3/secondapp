package fj;

import cj.gc;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
public abstract class g1<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<E, ?> f84588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f84589c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends cj.c<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Iterator f84590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g1 f84591e;

        public a(final g1 this$0, final Iterator val$entries) {
            this.f84590d = val$entries;
            this.f84591e = this$0;
        }

        @Override // cj.c
        @zq.a
        public E a() {
            while (this.f84590d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f84590d.next();
                if (this.f84591e.f84589c.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return b();
        }
    }

    public g1(Map<E, ?> outEdgeToNode, Object targetNode) {
        this.f84588b = (Map) zi.l0.E(outEdgeToNode);
        this.f84589c = zi.l0.E(targetNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@zq.a Object edge) {
        return this.f84589c.equals(this.f84588b.get(edge));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public gc<E> iterator() {
        return new a(this, this.f84588b.entrySet().iterator());
    }
}
