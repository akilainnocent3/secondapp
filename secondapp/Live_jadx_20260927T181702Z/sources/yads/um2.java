package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class um2 extends u51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient s51 f156501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f156502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f156503f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f156504g;

    public um2(s51 s51Var, Object[] objArr, int i10) {
        this.f156501d = s51Var;
        this.f156502e = objArr;
        this.f156504g = i10;
    }

    @Override // yads.j51
    public final int a(int i10, Object[] objArr) {
        return a().a(i10, objArr);
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f156501d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // yads.u51
    public final p51 f() {
        return new tm2(this);
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final ja3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f156504g;
    }
}
