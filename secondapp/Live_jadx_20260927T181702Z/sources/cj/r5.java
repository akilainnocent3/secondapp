package cj;

import com.ironsource.C4235d4;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class r5<K, V> extends w5 implements Map.Entry<K, V> {
    @Override // cj.w5
    /* JADX INFO: renamed from: X1 */
    public abstract Map.Entry<K, V> g2();

    public boolean equals(@zq.a Object object) {
        return g2().equals(object);
    }

    @Override // java.util.Map.Entry
    @n9
    public K getKey() {
        return g2().getKey();
    }

    @n9
    public V getValue() {
        return g2().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return g2().hashCode();
    }

    @qj.a
    @n9
    public V setValue(@n9 V value) {
        return g2().setValue(value);
    }

    public boolean standardEquals(@zq.a Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            if (zi.f0.a(getKey(), entry.getKey()) && zi.f0.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public int standardHashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public String standardToString() {
        return getKey() + C4235d4.j.f61456b + getValue();
    }
}
