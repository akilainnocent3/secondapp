package fr;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class v0 implements Map, Serializable, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final v0 f85163b = new v0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f85164c = 8246714829545688274L;

    private final Object l() {
        return f85163b;
    }

    public boolean a(@oy.l Void value) {
        kotlin.jvm.internal.m0.p(value, "value");
        return false;
    }

    @Override // java.util.Map
    @oy.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(@oy.m Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@oy.m Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    @oy.l
    public Set<Map.Entry> d() {
        return w0.f85173b;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(@oy.m Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @oy.l
    public Set<Object> g() {
        return w0.f85173b;
    }

    public int h() {
        return 0;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @oy.l
    public Collection j() {
        return u0.f85157b;
    }

    public Void k(Object obj, Void r10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return g();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @oy.l
    public String toString() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return j();
    }
}
