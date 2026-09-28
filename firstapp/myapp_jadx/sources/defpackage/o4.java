package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o4<E> extends q3<E> implements ocn<Object>, Collection, dhp {
    public abstract o4 c(int i, Object obj);

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.q2, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract o4 d(Object obj);

    public o4 e(Collection<? extends E> collection) {
        fh00 fh00VarF = f();
        fh00VarF.addAll(collection);
        return fh00VarF.d();
    }

    public abstract fh00 f();

    public abstract o4 h(m4 m4Var);

    public abstract o4 i(int i);

    @Override // defpackage.q3, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public abstract o4 j(int i, Object obj);

    @Override // defpackage.q3, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.q3, java.util.List
    public final List subList(int i, int i2) {
        return new ocn.a(this, i, i2);
    }
}
