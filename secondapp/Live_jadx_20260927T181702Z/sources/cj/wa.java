package cj;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@j4
public interface wa<E> extends ya<E>, qa<E> {
    wa<E> W0(@n9 E lowerBound, y boundType);

    wa<E> Z0(@n9 E lowerBound, y lowerBoundType, @n9 E upperBound, y upperBoundType);

    Comparator<? super E> comparator();

    Set<c9.a<E>> entrySet();

    @zq.a
    c9.a<E> firstEntry();

    wa<E> g0();

    @Override // cj.c9, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    @Override // cj.ya, cj.c9
    NavigableSet<E> k();

    @Override // cj.ya, cj.c9
    /* bridge */ /* synthetic */ Set k();

    @Override // cj.ya, cj.c9
    /* bridge */ /* synthetic */ SortedSet k();

    @zq.a
    c9.a<E> lastEntry();

    @zq.a
    c9.a<E> pollFirstEntry();

    @zq.a
    c9.a<E> pollLastEntry();

    wa<E> y1(@n9 E upperBound, y boundType);
}
