package androidx.databinding;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class w<K, V> extends f0.a<K, V> implements z<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient t f9527h;

    @Override // androidx.databinding.z
    public void S(z.a<? extends z<K, V>, K, V> aVar) {
        if (this.f9527h == null) {
            this.f9527h = new t();
        }
        this.f9527h.a(aVar);
    }

    @Override // f0.k3, java.util.Map
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        s(null);
    }

    @Override // androidx.databinding.z
    public void i1(z.a<? extends z<K, V>, K, V> aVar) {
        t tVar = this.f9527h;
        if (tVar != null) {
            tVar.o(aVar);
        }
    }

    @Override // f0.k3
    public V j(int i10) {
        K kG = g(i10);
        V v10 = (V) super.j(i10);
        if (v10 != null) {
            s(kG);
        }
        return v10;
    }

    @Override // f0.k3
    public V k(int i10, V v10) {
        K kG = g(i10);
        V v11 = (V) super.k(i10, v10);
        s(kG);
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f0.a
    public boolean p(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            int iE = e(it.next());
            if (iE >= 0) {
                j(iE);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // f0.k3, java.util.Map
    public V put(K k10, V v10) {
        super.put(k10, v10);
        s(k10);
        return v10;
    }

    @Override // f0.a
    public boolean r(Collection<?> collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(g(size))) {
                j(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(Object obj) {
        t tVar = this.f9527h;
        if (tVar != null) {
            tVar.j(this, 0, obj);
        }
    }
}
