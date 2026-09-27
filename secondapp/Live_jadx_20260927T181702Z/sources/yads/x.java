package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class x extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f157592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f157593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f157594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f157595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f157596f;

    public x(a0 a0Var, Object obj, Collection collection, x xVar) {
        this.f157596f = a0Var;
        this.f157592b = obj;
        this.f157593c = collection;
        this.f157594d = xVar;
        this.f157595e = xVar == null ? null : xVar.b();
    }

    public final void a() {
        x xVar = this.f157594d;
        if (xVar != null) {
            xVar.a();
        } else {
            this.f157596f.f146594f.put(this.f157592b, this.f157593c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.f157593c.isEmpty();
        boolean zAdd = this.f157593c.add(obj);
        if (zAdd) {
            this.f157596f.f146595g++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f157593c.size();
        boolean zAddAll = this.f157593c.addAll(collection);
        if (zAddAll) {
            int size2 = this.f157593c.size();
            a0 a0Var = this.f157596f;
            a0Var.f146595g = (size2 - size) + a0Var.f146595g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final Collection b() {
        return this.f157593c;
    }

    public final void c() {
        Collection collection;
        x xVar = this.f157594d;
        if (xVar != null) {
            xVar.c();
            if (this.f157594d.f157593c != this.f157595e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f157593c.isEmpty() || (collection = (Collection) this.f157596f.f146594f.get(this.f157592b)) == null) {
                return;
            }
            this.f157593c = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        c();
        int size = this.f157593c.size();
        if (size == 0) {
            return;
        }
        this.f157593c.clear();
        this.f157596f.f146595g -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f157593c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f157593c.containsAll(collection);
    }

    public final void d() {
        x xVar = this.f157594d;
        if (xVar != null) {
            xVar.d();
        } else if (this.f157593c.isEmpty()) {
            this.f157596f.f146594f.remove(this.f157592b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f157593c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f157593c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.f157593c.remove(obj);
        if (zRemove) {
            this.f157596f.f146595g--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f157593c.size();
        boolean zRemoveAll = this.f157593c.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f157593c.size();
            a0 a0Var = this.f157596f;
            a0Var.f146595g = (size2 - size) + a0Var.f146595g;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        c();
        int size = this.f157593c.size();
        boolean zRetainAll = this.f157593c.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f157593c.size();
            a0 a0Var = this.f157596f;
            a0Var.f146595g = (size2 - size) + a0Var.f146595g;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f157593c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f157593c.toString();
    }
}
