package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rd0 extends ox0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f154884b;

    public rd0(Map map) {
        this.f154884b = map;
    }

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f154884b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = (Iterator) ng2.a(((lx) entrySet()).iterator());
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.ox0, java.util.Map
    public final Set entrySet() {
        return ly2.a(super.entrySet(), new og2() { // from class: yads.q94
            @Override // yads.og2
            public final boolean apply(Object obj) {
                return rd0.a((Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((iy2) entrySet()).equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f154884b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ly2.a(entrySet());
    }

    @Override // yads.ox0, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && this.f154884b.containsKey(null));
    }

    @Override // yads.ox0, java.util.Map
    public final Set keySet() {
        return ly2.a(super.keySet(), new og2() { // from class: yads.r94
            @Override // yads.og2
            public final boolean apply(Object obj) {
                return rd0.a((String) obj);
            }
        });
    }

    @Override // yads.ox0, java.util.Map
    public final int size() {
        return super.size() - (this.f154884b.containsKey(null) ? 1 : 0);
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getKey() != null;
    }
}
