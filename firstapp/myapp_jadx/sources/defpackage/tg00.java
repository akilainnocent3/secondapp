package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tg00<E> extends i4<E> implements Collection, ehp {
    public qg00<E> a;
    public Object b;
    public Object c;
    public final te00<E, kgs> d;

    public tg00(qg00<E> qg00Var) {
        this.a = qg00Var;
        this.b = qg00Var.b;
        this.c = qg00Var.c;
        this.d = qg00Var.d.builder();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        te00<E, kgs> te00Var = this.d;
        if (te00Var.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.b = e;
            this.c = e;
            te00Var.put(e, new kgs());
            return true;
        }
        kgs kgsVar = te00Var.get(this.c);
        kgsVar.getClass();
        te00Var.put((E) this.c, new kgs(kgsVar.a, e));
        te00Var.put(e, new kgs(this.c));
        this.c = e;
        return true;
    }

    @Override // defpackage.i4
    public final int b() {
        return this.d.d();
    }

    public final qg00 c() {
        pe00<E, kgs> pe00VarF = this.d.f();
        qg00<E> qg00Var = this.a;
        if (pe00VarF != qg00Var.d) {
            qg00Var = new qg00<>(this.b, this.c, pe00VarF);
        }
        this.a = qg00Var;
        return qg00Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
        h6g h6gVar = h6g.a;
        this.b = h6gVar;
        this.c = h6gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new xg00(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        te00<E, kgs> te00Var = this.d;
        kgs kgsVarRemove = te00Var.remove(obj);
        if (kgsVarRemove == null) {
            return false;
        }
        Object obj2 = kgsVarRemove.b;
        Object obj3 = kgsVarRemove.a;
        h6g h6gVar = h6g.a;
        if (obj3 != h6gVar) {
            kgs kgsVar = te00Var.get(obj3);
            kgsVar.getClass();
            te00Var.put((E) obj3, new kgs(kgsVar.a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == h6gVar) {
            this.c = obj3;
            return true;
        }
        kgs kgsVar2 = te00Var.get(obj2);
        kgsVar2.getClass();
        te00Var.put((E) obj2, new kgs(obj3, kgsVar2.b));
        return true;
    }
}
