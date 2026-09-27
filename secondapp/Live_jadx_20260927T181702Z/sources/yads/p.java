package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class p implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map.Entry f153658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f153659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f153660d;

    public p(q qVar, Iterator it) {
        this.f153660d = qVar;
        this.f153659c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f153659c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f153659c.next();
        this.f153658b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.f153658b;
        if (!(entry != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Collection collection = (Collection) entry.getValue();
        this.f153659c.remove();
        this.f153660d.f154212c.f146595g -= collection.size();
        collection.clear();
        this.f153658b = null;
    }
}
