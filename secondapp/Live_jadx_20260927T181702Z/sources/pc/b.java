package pc;

import f0.k3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b<K, V> extends f0.a<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f120667h;

    @Override // f0.k3, java.util.Map
    public void clear() {
        this.f120667h = 0;
        super.clear();
    }

    @Override // f0.k3
    public void h(k3<? extends K, ? extends V> k3Var) {
        this.f120667h = 0;
        super.h(k3Var);
    }

    @Override // f0.k3, java.util.Map
    public int hashCode() {
        if (this.f120667h == 0) {
            this.f120667h = super.hashCode();
        }
        return this.f120667h;
    }

    @Override // f0.k3
    public V j(int i10) {
        this.f120667h = 0;
        return (V) super.j(i10);
    }

    @Override // f0.k3
    public V k(int i10, V v10) {
        this.f120667h = 0;
        return (V) super.k(i10, v10);
    }

    @Override // f0.k3, java.util.Map
    public V put(K k10, V v10) {
        this.f120667h = 0;
        return (V) super.put(k10, v10);
    }
}
