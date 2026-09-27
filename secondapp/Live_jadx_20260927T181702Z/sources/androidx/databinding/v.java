package androidx.databinding;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class v<T> extends ArrayList<T> implements y<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient s f9526b = new s();

    @Override // androidx.databinding.y
    public void J0(y.a aVar) {
        s sVar = this.f9526b;
        if (sVar != null) {
            sVar.o(aVar);
        }
    }

    public final void a(int i10, int i11) {
        s sVar = this.f9526b;
        if (sVar != null) {
            sVar.v(this, i10, i11);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t10) {
        super.add(t10);
        a(size() - 1, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            a(size, size() - size);
        }
        return zAddAll;
    }

    public final void b(int i10, int i11) {
        s sVar = this.f9526b;
        if (sVar != null) {
            sVar.x(this, i10, i11);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            b(0, size);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i10) {
        T t10 = (T) super.remove(i10);
        b(i10, 1);
        return t10;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i10, int i11) {
        super.removeRange(i10, i11);
        b(i10, i11 - i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        T t11 = (T) super.set(i10, t10);
        s sVar = this.f9526b;
        if (sVar != null) {
            sVar.u(this, i10, 1);
        }
        return t11;
    }

    @Override // androidx.databinding.y
    public void w0(y.a aVar) {
        if (this.f9526b == null) {
            this.f9526b = new s();
        }
        this.f9526b.a(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        super.add(i10, t10);
        a(i10, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean zAddAll = super.addAll(i10, collection);
        if (zAddAll) {
            a(i10, collection.size());
        }
        return zAddAll;
    }
}
