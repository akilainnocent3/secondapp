package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class pg00<E> extends x4<E> implements yg00<E> {
    public static final pg00 e;
    public final Object b;
    public final Object c;
    public final oe00<E, jgs> d;

    static {
        oe00 oe00Var = oe00.f;
        oe00Var.getClass();
        g6g g6gVar = g6g.a;
        e = new pg00(g6gVar, g6gVar, oe00Var);
    }

    public pg00(Object obj, Object obj2, oe00<E, jgs> oe00Var) {
        this.b = obj;
        this.c = obj2;
        this.d = oe00Var;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.d.e;
    }

    public final yg00<E> c(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        sg00 sg00Var = new sg00(this);
        sg00Var.addAll(collection);
        return sg00Var.build();
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    public final sg00 d() {
        return new sg00(this);
    }

    @Override // defpackage.x4, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        oe00<E, jgs> oe00Var = this.d;
        cwg0<E, jgs> cwg0Var = oe00Var.d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (oe00Var.e != set.size()) {
            return false;
        }
        if (set instanceof pg00) {
            return cwg0Var.g(((pg00) obj).d.d, new ng00());
        }
        return set instanceof sg00 ? cwg0Var.g(((sg00) obj).d.c, new og00()) : super.equals(obj);
    }

    @Override // defpackage.x4, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new ug00(this.b, this.d);
    }
}
