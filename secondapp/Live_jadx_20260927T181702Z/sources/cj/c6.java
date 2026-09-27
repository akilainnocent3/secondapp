package cj;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class c6<E> extends y5<E> implements SortedSet<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // cj.f5
    public boolean Z1(@zq.a Object object) {
        try {
            return a6.Z1(comparator(), tailSet(object).first(), object) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cj.f5
    public boolean b2(@zq.a Object object) {
        try {
            Iterator<E> it = tailSet(object).iterator();
            if (it.hasNext()) {
                if (a6.Z1(comparator(), it.next(), object) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Override // java.util.SortedSet
    @zq.a
    public Comparator<? super E> comparator() {
        return g2().comparator();
    }

    @Override // java.util.SortedSet
    @n9
    public E first() {
        return g2().first();
    }

    @Override // cj.y5
    /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet<E> g2();

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(@n9 E toElement) {
        return g2().headSet(toElement);
    }

    public SortedSet<E> i2(@n9 E fromElement, @n9 E toElement) {
        return tailSet(fromElement).headSet(toElement);
    }

    @Override // java.util.SortedSet
    @n9
    public E last() {
        return g2().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(@n9 E fromElement, @n9 E toElement) {
        return g2().subSet(fromElement, toElement);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(@n9 E fromElement) {
        return g2().tailSet(fromElement);
    }
}
