package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class sg00<E> extends i4<E> implements yg00.a<E> {
    public pg00<E> a;
    public Object b;
    public Object c;
    public final se00<E, jgs> d;

    public sg00(pg00<E> pg00Var) {
        this.a = pg00Var;
        this.b = pg00Var.b;
        this.c = pg00Var.c;
        this.d = new se00<>(pg00Var.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        se00<E, jgs> se00Var = this.d;
        if (se00Var.containsKey(e)) {
            return false;
        }
        this.a = null;
        if (isEmpty()) {
            this.b = e;
            this.c = e;
            se00Var.put(e, new jgs());
            return true;
        }
        jgs jgsVar = se00Var.get(this.c);
        jgsVar.getClass();
        se00Var.put((E) this.c, new jgs(jgsVar.a, e));
        se00Var.put(e, new jgs(this.c, g6g.a));
        this.c = e;
        return true;
    }

    @Override // defpackage.i4
    public final int b() {
        return this.d.f;
    }

    @Override // yg00.a
    public final pg00 build() {
        pg00<E> pg00Var = this.a;
        if (pg00Var != null) {
            return pg00Var;
        }
        pg00<E> pg00Var2 = new pg00<>(this.b, this.c, this.d.build());
        this.a = pg00Var2;
        return pg00Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        se00<E, jgs> se00Var = this.d;
        if (!se00Var.isEmpty()) {
            this.a = null;
        }
        se00Var.clear();
        g6g g6gVar = g6g.a;
        this.b = g6gVar;
        this.c = g6gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int i = 1;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        se00<E, jgs> se00Var = this.d;
        Set set = (Set) obj;
        if (se00Var.f != set.size()) {
            return false;
        }
        if (set instanceof pg00) {
            return se00Var.c.g(((pg00) obj).d.d, new rg00());
        }
        return set instanceof sg00 ? se00Var.c.g(((sg00) obj).d.c, new os8(i)) : super.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new wg00(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        se00<E, jgs> se00Var = this.d;
        jgs jgsVarRemove = se00Var.remove(obj);
        if (jgsVarRemove == null) {
            return false;
        }
        Object obj2 = jgsVarRemove.b;
        Object obj3 = jgsVarRemove.a;
        this.a = null;
        g6g g6gVar = g6g.a;
        if (obj3 != g6gVar) {
            jgs jgsVar = se00Var.get(obj3);
            jgsVar.getClass();
            se00Var.put((E) obj3, new jgs(jgsVar.a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == g6gVar) {
            this.c = obj3;
            return true;
        }
        jgs jgsVar2 = se00Var.get(obj2);
        jgsVar2.getClass();
        se00Var.put((E) obj2, new jgs(obj3, jgsVar2.b));
        return true;
    }
}
