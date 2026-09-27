package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f152234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f152235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f152236d;

    public m(n nVar) {
        this.f152236d = nVar;
        this.f152234b = nVar.f152791d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f152234b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f152234b.next();
        this.f152235c = (Collection) entry.getValue();
        return this.f152236d.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this.f152235c != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f152234b.remove();
        this.f152236d.f152792e.f146595g -= this.f152235c.size();
        this.f152235c.clear();
        this.f152235c = null;
    }
}
