package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e3 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f47456h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f47458b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f47459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile d3 f47461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f47462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile x2 f47463g;

    public e3(int i10) {
        this.f47457a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f47459c = map;
        this.f47462f = map;
    }

    public final Object a(Comparable comparable, Object obj) {
        a();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((b3) this.f47458b.get(iA)).setValue(obj);
        }
        a();
        if (this.f47458b.isEmpty() && !(this.f47458b instanceof ArrayList)) {
            this.f47458b = new ArrayList(this.f47457a);
        }
        int i10 = -(iA + 1);
        if (i10 >= this.f47457a) {
            return c().put(comparable, obj);
        }
        int size = this.f47458b.size();
        int i11 = this.f47457a;
        if (size == i11) {
            b3 b3Var = (b3) this.f47458b.remove(i11 - 1);
            c().put(b3Var.f47439a, b3Var.f47440b);
        }
        this.f47458b.add(i10, new b3(this, comparable, obj));
        return null;
    }

    public final Iterable b() {
        return this.f47459c.isEmpty() ? a3.f47435b : this.f47459c.entrySet();
    }

    public final SortedMap c() {
        a();
        if (this.f47459c.isEmpty() && !(this.f47459c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f47459c = treeMap;
            this.f47462f = treeMap.descendingMap();
        }
        return (SortedMap) this.f47459c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (!this.f47458b.isEmpty()) {
            this.f47458b.clear();
        }
        if (this.f47459c.isEmpty()) {
            return;
        }
        this.f47459c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f47459c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f47461e == null) {
            this.f47461e = new d3(this);
        }
        return this.f47461e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return super.equals(obj);
        }
        e3 e3Var = (e3) obj;
        int size = size();
        if (size != e3Var.size()) {
            return false;
        }
        int size2 = this.f47458b.size();
        if (size2 != e3Var.f47458b.size()) {
            return entrySet().equals(e3Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!((Map.Entry) this.f47458b.get(i10)).equals((Map.Entry) e3Var.f47458b.get(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f47459c.equals(e3Var.f47459c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((b3) this.f47458b.get(iA)).f47440b : this.f47459c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f47458b.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((b3) this.f47458b.get(i10)).hashCode();
        }
        return this.f47459c.size() > 0 ? this.f47459c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA < 0) {
            if (this.f47459c.isEmpty()) {
                return null;
            }
            return this.f47459c.remove(comparable);
        }
        a();
        Object obj2 = ((b3) this.f47458b.remove(iA)).f47440b;
        if (!this.f47459c.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            this.f47458b.add(new b3(this, (Map.Entry) it.next()));
            it.remove();
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f47459c.size() + this.f47458b.size();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f47458b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((b3) this.f47458b.get(i12)).f47439a);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((b3) this.f47458b.get(i13)).f47439a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((b3) this.f47458b.get(i12)).f47439a);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void a() {
        if (this.f47460d) {
            throw new UnsupportedOperationException();
        }
    }
}
