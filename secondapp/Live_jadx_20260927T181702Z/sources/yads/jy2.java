package yads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jy2 extends iy2 implements SortedSet {
    public jy2(SortedSet sortedSet, og2 og2Var) {
        super(sortedSet, og2Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f152180b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f152180b.iterator();
        og2 og2Var = this.f152181c;
        it.getClass();
        og2Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (og2Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new jy2(((SortedSet) this.f152180b).headSet(obj), this.f152181c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f152180b;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f152181c.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new jy2(((SortedSet) this.f152180b).subSet(obj, obj2), this.f152181c);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new jy2(((SortedSet) this.f152180b).tailSet(obj), this.f152181c);
    }
}
