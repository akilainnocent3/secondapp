package yads;

import com.ironsource.G5;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class s51 implements Map, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient um2 f155266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient vm2 f155267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient wm2 f155268d;

    public static s51 a(HashMap map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        q51 q51Var = new q51(z10 ? setEntrySet.size() : 4);
        if (z10) {
            q51Var.a(setEntrySet.size());
        }
        for (Map.Entry entry : setEntrySet) {
            q51Var.a(entry.getKey(), entry.getValue());
        }
        return xm2.a(q51Var.f154274b, q51Var.f154273a);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u51 entrySet() {
        um2 um2Var = this.f155266b;
        if (um2Var != null) {
            return um2Var;
        }
        xm2 xm2Var = (xm2) this;
        um2 um2Var2 = new um2(xm2Var, xm2Var.f157917f, xm2Var.f157918g);
        this.f155266b = um2Var2;
        return um2Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        wm2 wm2Var = this.f155268d;
        if (wm2Var == null) {
            xm2 xm2Var = (xm2) this;
            wm2 wm2Var2 = new wm2(xm2Var.f157917f, 1, xm2Var.f157918g);
            this.f155268d = wm2Var2;
            wm2Var = wm2Var2;
        }
        return wm2Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((u51) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ly2.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((xm2) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        vm2 vm2Var = this.f155267c;
        if (vm2Var != null) {
            return vm2Var;
        }
        xm2 xm2Var = (xm2) this;
        vm2 vm2Var2 = new vm2(xm2Var, new wm2(xm2Var.f157917f, 0, xm2Var.f157918g));
        this.f155267c = vm2Var2;
        return vm2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = ((xm2) this).size();
        kx.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, sc.k.Q));
        sb2.append(fw.b.f85382i);
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(G5.T);
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(fw.b.f85383j);
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        wm2 wm2Var = this.f155268d;
        if (wm2Var != null) {
            return wm2Var;
        }
        xm2 xm2Var = (xm2) this;
        wm2 wm2Var2 = new wm2(xm2Var.f157917f, 1, xm2Var.f157918g);
        this.f155268d = wm2Var2;
        return wm2Var2;
    }

    public Object writeReplace() {
        return new r51(this);
    }

    public static q51 a() {
        return new q51(4);
    }
}
