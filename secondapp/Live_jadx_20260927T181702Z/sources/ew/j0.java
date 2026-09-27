package ew;

import fr.r0;
import fw.t1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@zv.b0(with = l0.class)
public final class j0 extends m implements Map<String, m>, es.a {

    @oy.l
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Map<String, m> f81795b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        @oy.l
        public final zv.j<j0> serializer() {
            return l0.f81797a;
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(@oy.l Map<String, ? extends m> content) {
        super(null);
        kotlin.jvm.internal.m0.p(content, "content");
        this.f81795b = content;
    }

    public static final CharSequence x(Map.Entry entry) {
        kotlin.jvm.internal.m0.p(entry, "<destruct>");
        String str = (String) entry.getKey();
        m mVar = (m) entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        t1.d(sb2, str);
        sb2.append(':');
        sb2.append(mVar);
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    public m b(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ m compute(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ m computeIfAbsent(String str, Function<? super String, ? extends m> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ m computeIfPresent(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return f((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof m) {
            return g((m) obj);
        }
        return false;
    }

    public m d(String str, Function<? super String, ? extends m> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public m e(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, m>> entrySet() {
        return l();
    }

    @Override // java.util.Map
    public boolean equals(@oy.m Object obj) {
        return kotlin.jvm.internal.m0.g(this.f81795b, obj);
    }

    public boolean f(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return this.f81795b.containsKey(key);
    }

    public boolean g(@oy.l m value) {
        kotlin.jvm.internal.m0.p(value, "value");
        return this.f81795b.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m get(Object obj) {
        if (obj instanceof String) {
            return j((String) obj);
        }
        return null;
    }

    public final /* bridge */ m h(Object obj) {
        if (obj instanceof String) {
            return j((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f81795b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f81795b.isEmpty();
    }

    @oy.m
    public m j(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return this.f81795b.get(key);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m();
    }

    @oy.l
    public Set<Map.Entry<String, m>> l() {
        return this.f81795b.entrySet();
    }

    @oy.l
    public Set<String> m() {
        return this.f81795b.keySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ m merge(String str, m mVar, BiFunction<? super m, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int n() {
        return this.f81795b.size();
    }

    @oy.l
    public Collection<m> p() {
        return this.f81795b.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ m put(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends m> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ m putIfAbsent(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public m r(String str, m mVar, BiFunction<? super m, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ m replace(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public m s(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return n();
    }

    public m t(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @oy.l
    public String toString() {
        return r0.r3(this.f81795b.entrySet(), ",", "{", "}", 0, null, new ds.l() { // from class: ew.i0
            @Override // ds.l
            public final Object invoke(Object obj) {
                return j0.x((Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public m remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public m v(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<m> values() {
        return p();
    }

    public boolean w(String str, m mVar, m mVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, m mVar, m mVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
