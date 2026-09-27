package cj;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public interface c9<E> extends Collection<E> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<E> {
        boolean equals(@zq.a Object o10);

        int getCount();

        int hashCode();

        @n9
        E k();

        String toString();
    }

    int F1(@zq.a @qj.c(l3.a.S4) Object element);

    @qj.a
    int L0(@n9 E element, int count);

    @Override // java.util.Collection
    @qj.a
    boolean add(@n9 E element);

    @Override // java.util.Collection
    boolean contains(@zq.a Object element);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> elements);

    @qj.a
    int d0(@n9 E element, int occurrences);

    Set<a<E>> entrySet();

    @Override // java.util.Collection
    boolean equals(@zq.a Object object);

    @Override // java.util.Collection
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    Set<E> k();

    @qj.a
    boolean p0(@n9 E element, int oldCount, int newCount);

    @Override // java.util.Collection
    @qj.a
    boolean remove(@zq.a Object element);

    @Override // java.util.Collection
    @qj.a
    boolean removeAll(Collection<?> c10);

    @Override // java.util.Collection
    @qj.a
    boolean retainAll(Collection<?> c10);

    int size();

    @qj.a
    int t1(@zq.a @qj.c(l3.a.S4) Object element, int occurrences);

    String toString();
}
