package fj;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
public final class f1<K, V> extends e1<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.a
    public volatile transient a<K, V> f84576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @zq.a
    public volatile transient a<K, V> f84577d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f84578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f84579b;

        public a(K key, V value) {
            this.f84578a = key;
            this.f84579b = value;
        }
    }

    public f1(Map<K, V> backingMap) {
        super(backingMap);
    }

    @Override // fj.e1
    public void d() {
        super.d();
        this.f84576c = null;
        this.f84577d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fj.e1
    @zq.a
    public V f(Object key) {
        zi.l0.E(key);
        V vG = g(key);
        if (vG != null) {
            return vG;
        }
        V vH = h(key);
        if (vH != null) {
            m(key, vH);
        }
        return vH;
    }

    @Override // fj.e1
    @zq.a
    public V g(@zq.a Object obj) {
        V v10 = (V) super.g(obj);
        if (v10 != null) {
            return v10;
        }
        a<K, V> aVar = this.f84576c;
        if (aVar != null && aVar.f84578a == obj) {
            return aVar.f84579b;
        }
        a<K, V> aVar2 = this.f84577d;
        if (aVar2 == null || aVar2.f84578a != obj) {
            return null;
        }
        l(aVar2);
        return aVar2.f84579b;
    }

    public final void l(a<K, V> entry) {
        this.f84577d = this.f84576c;
        this.f84576c = entry;
    }

    public final void m(K key, V value) {
        l(new a<>(key, value));
    }
}
