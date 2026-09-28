package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qg00<E> extends x4<E> implements zg00<E> {
    public static final qg00 e;
    public final Object b;
    public final Object c;
    public final pe00<E, kgs> d;

    static {
        h6g h6gVar = h6g.a;
        e = new qg00(h6gVar, h6gVar, pe00.f);
    }

    public qg00(Object obj, Object obj2, pe00<E, kgs> pe00Var) {
        this.b = obj;
        this.c = obj2;
        this.d = pe00Var;
    }

    @Override // java.util.Collection, java.util.Set, defpackage.zg00
    public final qg00 add(Object obj) {
        pe00<E, kgs> pe00Var = this.d;
        if (pe00Var.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new qg00(obj, obj, pe00Var.j(obj, new kgs()));
        }
        Object obj2 = this.c;
        kgs kgsVar = pe00Var.get(obj2);
        kgsVar.getClass();
        return new qg00(this.b, obj, pe00Var.j(obj2, new kgs(kgsVar.a, obj)).j(obj, new kgs(obj2)));
    }

    @Override // java.util.Collection, java.util.Set, defpackage.zg00
    public final zg00<E> addAll(Collection<? extends E> collection) {
        tg00 tg00Var = new tg00(this);
        tg00Var.addAll(collection);
        return tg00Var.c();
    }

    @Override // defpackage.q2
    public final int b() {
        return this.d.e();
    }

    @Override // defpackage.zg00
    public final tg00 builder() {
        return new tg00(this);
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.x4, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new vg00(this.b, this.d);
    }

    @Override // java.util.Collection, java.util.Set, defpackage.zg00
    public final qg00 remove(Object obj) {
        pe00<E, kgs> pe00VarJ = this.d;
        kgs kgsVar = pe00VarJ.get(obj);
        if (kgsVar == null) {
            return this;
        }
        Object obj2 = kgsVar.a;
        Object obj3 = kgsVar.b;
        bwg0<E, kgs> bwg0Var = pe00VarJ.d;
        bwg0<E, kgs> bwg0VarV = bwg0Var.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (bwg0Var != bwg0VarV) {
            pe00VarJ = bwg0VarV == null ? pe00.f : new pe00<>(bwg0VarV, pe00VarJ.e - 1);
        }
        h6g h6gVar = h6g.a;
        if (obj2 != h6gVar) {
            kgs kgsVar2 = pe00VarJ.get(obj2);
            kgsVar2.getClass();
            pe00VarJ = pe00VarJ.j(obj2, new kgs(kgsVar2.a, obj3));
        }
        if (obj3 != h6gVar) {
            kgs kgsVar3 = pe00VarJ.get(obj3);
            kgsVar3.getClass();
            pe00VarJ = pe00VarJ.j(obj3, new kgs(obj2, kgsVar3.b));
        }
        Object obj4 = obj2 != h6gVar ? this.b : obj3;
        if (obj3 != h6gVar) {
            obj2 = this.c;
        }
        return new qg00(obj4, obj2, pe00VarJ);
    }

    @Override // java.util.Collection, java.util.Set, defpackage.zg00
    public final zg00<E> removeAll(Collection<? extends E> collection) {
        tg00 tg00Var = new tg00(this);
        tg00Var.removeAll(collection);
        return tg00Var.c();
    }
}
