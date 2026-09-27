package yads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class s83 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f155309b;

    public s83(Iterator it) {
        this.f155309b = (Iterator) ng2.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f155309b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f155309b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f155309b.remove();
    }
}
