package v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f139802f = new HashMap<>();

    public boolean contains(K k10) {
        return this.f139802f.containsKey(k10);
    }

    @Override // v.b
    @Nullable
    public b.c<K, V> e(K k10) {
        return this.f139802f.get(k10);
    }

    @Override // v.b
    public V i(@NonNull K k10, @NonNull V v10) {
        b.c<K, V> cVarE = e(k10);
        if (cVarE != null) {
            return cVarE.f139808c;
        }
        this.f139802f.put(k10, h(k10, v10));
        return null;
    }

    @Override // v.b
    public V j(@NonNull K k10) {
        V v10 = (V) super.j(k10);
        this.f139802f.remove(k10);
        return v10;
    }

    @Nullable
    public Map.Entry<K, V> l(K k10) {
        if (contains(k10)) {
            return this.f139802f.get(k10).f139810e;
        }
        return null;
    }
}
