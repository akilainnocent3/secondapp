package yads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class w implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f157151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f157152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f157153d;

    public w(x xVar) {
        this.f157153d = xVar;
        Collection collection = xVar.f157593c;
        this.f157152c = collection;
        this.f157151b = a0.a(collection);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f157153d.c();
        if (this.f157153d.f157593c == this.f157152c) {
            return this.f157151b.hasNext();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f157153d.c();
        if (this.f157153d.f157593c == this.f157152c) {
            return this.f157151b.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f157151b.remove();
        x xVar = this.f157153d;
        xVar.f157596f.f146595g--;
        xVar.d();
    }

    public w(x xVar, ListIterator listIterator) {
        this.f157153d = xVar;
        this.f157152c = xVar.f157593c;
        this.f157151b = listIterator;
    }
}
