package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class n4<E> extends q3<E> implements uf00<E> {
    @Override // java.util.Collection, java.util.List, defpackage.uf00
    public uf00<E> addAll(Collection<? extends E> collection) {
        if (((ArrayList) collection).isEmpty()) {
            return this;
        }
        eh00 eh00VarBuilder = builder();
        eh00VarBuilder.addAll(collection);
        return eh00VarBuilder.build();
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.q2, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
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

    @Override // defpackage.q3, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // defpackage.q3, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.q3, java.util.List
    public final List subList(int i, int i2) {
        return new qcn.a(this, i, i2);
    }
}
