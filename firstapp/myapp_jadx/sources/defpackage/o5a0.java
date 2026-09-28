package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o5a0<K, V> extends q5a0<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        n6a0.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        n6a0.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if ((obj instanceof dhp) && !(obj instanceof ghp.a)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.g(this.a.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        m6a0<K, V> m6a0Var = this.a;
        return new jxd0(m6a0Var, ((vcn) m6a0Var.c().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof dhp) || (obj instanceof ghp.a)) && this.a.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        vf00<K, ? extends V> vf00Var;
        int i;
        c5a0 c5a0VarG;
        boolean zB;
        Collection<?> collection2 = collection;
        int iA = jpu.a(l48.r(collection2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        m6a0<K, V> m6a0Var = this.a;
        boolean z = false;
        do {
            synchronized (n6a0.a) {
                m6a0.a aVar = m6a0Var.a;
                aVar.getClass();
                m6a0.a aVar2 = (m6a0.a) n5a0.e(aVar);
                vf00Var = aVar2.c;
                i = aVar2.d;
                Unit unit = Unit.a;
            }
            vf00Var.getClass();
            vf00.a<K, ? extends V> aVarBuilder = vf00Var.builder();
            Object it2 = m6a0Var.b.iterator();
            while (((kxd0) it2).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((jxd0) it2).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.g(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarBuilder.remove(entry2.getKey());
                    z = true;
                }
            }
            Unit unit2 = Unit.a;
            vf00<K, ? extends V> vf00VarF = aVarBuilder.f();
            if (Intrinsics.g(vf00VarF, vf00Var)) {
                break;
            }
            m6a0.a aVar3 = m6a0Var.a;
            aVar3.getClass();
            synchronized (n5a0.c) {
                c5a0.e.getClass();
                c5a0VarG = n5a0.g();
                zB = m6a0.b((m6a0.a) n5a0.v(aVar3, m6a0Var, c5a0VarG), i, vf00VarF);
            }
            n5a0.k(c5a0VarG, m6a0Var);
        } while (!zB);
        return z;
    }
}
