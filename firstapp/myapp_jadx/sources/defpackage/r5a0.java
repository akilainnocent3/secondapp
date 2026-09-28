package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r5a0<K, V> extends q5a0<K, V, V> {
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
        return this.a.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.a.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m6a0<K, V> m6a0Var = this.a;
        return new mxd0(m6a0Var, ((vcn) m6a0Var.c().c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        m6a0<K, V> m6a0Var = this.a;
        Object it = m6a0Var.b.iterator();
        do {
            if (!((kxd0) it).hasNext()) {
                next = null;
                break;
            }
            next = ((jxd0) it).next();
        } while (!Intrinsics.g(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        m6a0Var.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        vf00<K, ? extends V> vf00Var;
        int i;
        c5a0 c5a0VarG;
        boolean zB;
        Set setE0 = CollectionsKt.E0(collection);
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
            Object it = m6a0Var.b.iterator();
            while (((kxd0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((jxd0) it).next();
                if (setE0.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        vf00<K, ? extends V> vf00Var;
        int i;
        c5a0 c5a0VarG;
        boolean zB;
        Set setE0 = CollectionsKt.E0(collection);
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
            Object it = m6a0Var.b.iterator();
            while (((kxd0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((jxd0) it).next();
                if (!setE0.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
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
