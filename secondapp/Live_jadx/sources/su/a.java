package su;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends ArrayList<n> implements m {
    public a(int i10) {
        super(i10);
    }

    public /* bridge */ boolean a(n nVar) {
        return super.contains(nVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof n) {
            return a((n) obj);
        }
        return false;
    }

    public /* bridge */ int g() {
        return super.size();
    }

    public /* bridge */ int i(n nVar) {
        return super.indexOf(nVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof n) {
            return i((n) obj);
        }
        return -1;
    }

    public /* bridge */ int j(n nVar) {
        return super.lastIndexOf(nVar);
    }

    public /* bridge */ boolean l(n nVar) {
        return super.remove(nVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof n) {
            return j((n) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof n) {
            return l((n) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return g();
    }
}
