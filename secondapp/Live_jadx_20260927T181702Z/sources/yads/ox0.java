package yads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ox0 implements Map {
    @Override // java.util.Map
    public final void clear() {
        ((rd0) this).f154884b.clear();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return ((rd0) this).f154884b.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((rd0) this).f154884b.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return ((rd0) this).f154884b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((rd0) this).f154884b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((rd0) this).f154884b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((rd0) this).f154884b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((rd0) this).f154884b.size();
    }

    public final String toString() {
        return ((rd0) this).f154884b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((rd0) this).f154884b.values();
    }
}
