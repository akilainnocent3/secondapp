package yt;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class n extends AbstractList<String> implements RandomAccess, o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f159930c = new n().getUnmodifiableView();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Object> f159931b;

    public n() {
        this.f159931b = new ArrayList();
    }

    public static d b(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        return obj instanceof String ? d.g((String) obj) : d.e((byte[]) obj);
    }

    public static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof d ? ((d) obj).v() : j.b((byte[]) obj);
    }

    @Override // yt.o
    public void O(d dVar) {
        this.f159931b.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f159931b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f159931b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f159931b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strV = dVar.v();
            if (dVar.m()) {
                this.f159931b.set(i10, strV);
            }
            return strV;
        }
        byte[] bArr = (byte[]) obj;
        String strB = j.b(bArr);
        if (j.a(bArr)) {
            this.f159931b.set(i10, strB);
        }
        return strB;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f159931b.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return d(this.f159931b.set(i10, str));
    }

    @Override // yt.o
    public d getByteString(int i10) {
        Object obj = this.f159931b.get(i10);
        d dVarB = b(obj);
        if (dVarB != obj) {
            this.f159931b.set(i10, dVarB);
        }
        return dVarB;
    }

    @Override // yt.o
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f159931b);
    }

    @Override // yt.o
    public o getUnmodifiableView() {
        return new x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f159931b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof o) {
            collection = ((o) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f159931b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public n(o oVar) {
        this.f159931b = new ArrayList(oVar.size());
        addAll(oVar);
    }
}
