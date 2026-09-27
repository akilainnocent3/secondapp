package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class tx1 extends AbstractCollection {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a0 a0Var = (a0) ((c0) this).f147463b;
        Iterator it = a0Var.f146594f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f146594f.clear();
        a0Var.f146595g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            e0 e0Var = ((c0) this).f147463b;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) e0Var.a().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            e0 e0Var = ((c0) this).f147463b;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) e0Var.a().get(key);
            if (collection != null && collection.remove(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((a0) ((c0) this).f147463b).f146595g;
    }
}
