package g0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final LinkedHashMap<K, V> f85761a;

    public d() {
        this(0, 0.0f, 3, null);
    }

    @m
    public final V a(@l K key) {
        m0.p(key, "key");
        return this.f85761a.get(key);
    }

    @l
    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> setEntrySet = this.f85761a.entrySet();
        m0.o(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f85761a.isEmpty();
    }

    @m
    public final V d(@l K key, @l V value) {
        m0.p(key, "key");
        m0.p(value, "value");
        return this.f85761a.put(key, value);
    }

    @m
    public final V e(@l K key) {
        m0.p(key, "key");
        return this.f85761a.remove(key);
    }

    public d(int i10, float f10) {
        this.f85761a = new LinkedHashMap<>(i10, f10, true);
    }

    public /* synthetic */ d(int i10, float f10, int i11, x xVar) {
        this((i11 & 1) != 0 ? 16 : i10, (i11 & 2) != 0 ? 0.75f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@l d<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        m0.p(original, "original");
        for (Map.Entry<? extends K, V> entry : original.b()) {
            d(entry.getKey(), entry.getValue());
        }
    }
}
