package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f153275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f153276c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f153277d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f153278e = yd1.INSTANCE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f153279f;

    public o(a0 a0Var) {
        this.f153279f = a0Var;
        this.f153275b = a0Var.f146594f.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f153275b.hasNext() || this.f153278e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f153278e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f153275b.next();
            this.f153276c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f153277d = collection;
            this.f153278e = collection.iterator();
        }
        return a(this.f153276c, this.f153278e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f153278e.remove();
        Collection collection = this.f153277d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f153275b.remove();
        }
        this.f153279f.f146595g--;
    }
}
