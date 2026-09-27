package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class p2<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2<?, ?> f10182c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10183b;

    static {
        p2<?, ?> p2Var = new p2<>();
        f10182c = p2Var;
        p2Var.n();
    }

    public p2() {
        this.f10183b = true;
    }

    public static <K, V> int a(Map<K, V> a10) {
        int iB = 0;
        for (Map.Entry<K, V> entry : a10.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    public static int b(Object a10) {
        if (a10 instanceof byte[]) {
            return t1.m((byte[]) a10);
        }
        if (a10 instanceof t1.c) {
            throw new UnsupportedOperationException();
        }
        return a10.hashCode();
    }

    public static void c(Map<?, ?> m10) {
        for (Object obj : m10.keySet()) {
            t1.d(obj);
            t1.d(m10.get(obj));
        }
    }

    public static Object d(Object object) {
        if (!(object instanceof byte[])) {
            return object;
        }
        byte[] bArr = (byte[]) object;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> e(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), d(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> p2<K, V> g() {
        return (p2<K, V>) f10182c;
    }

    public static boolean k(Object a10, Object b10) {
        return ((a10 instanceof byte[]) && (b10 instanceof byte[])) ? Arrays.equals((byte[]) a10, (byte[]) b10) : a10.equals(b10);
    }

    public static <K, V> boolean l(Map<K, V> a10, Map<K, V> b10) {
        if (a10 == b10) {
            return true;
        }
        if (a10.size() != b10.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : a10.entrySet()) {
            if (!b10.containsKey(entry.getKey()) || !k(entry.getValue(), b10.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object object) {
        return (object instanceof Map) && l(this, (Map) object);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public final void j() {
        if (!m()) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean m() {
        return this.f10183b;
    }

    public void n() {
        this.f10183b = false;
    }

    public void p(p2<K, V> other) {
        j();
        if (other.isEmpty()) {
            return;
        }
        putAll(other);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        j();
        t1.d(k10);
        t1.d(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m10) {
        j();
        c(m10);
        super.putAll(m10);
    }

    public p2<K, V> r() {
        return isEmpty() ? new p2<>() : new p2<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        return (V) super.remove(obj);
    }

    public V s(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    public p2(Map<K, V> mapData) {
        super(mapData);
        this.f10183b = true;
    }
}
