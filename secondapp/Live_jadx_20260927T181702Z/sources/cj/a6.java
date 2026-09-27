package cj;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class a6<K, V> extends q5<K, V> implements SortedMap<K, V> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends n8.g0<K, V> {
        public a() {
            super(a6.this);
        }
    }

    public static int Z1(@zq.a Comparator<?> comparator, @zq.a Object o10, @zq.a Object o11) {
        return comparator == null ? ((Comparable) o10).compareTo(o11) : comparator.compare(o10, o11);
    }

    @Override // cj.q5, cj.w5
    /* JADX INFO: renamed from: X1 */
    public abstract SortedMap<K, V> g2();

    public SortedMap<K, V> Y1(K fromKey, K toKey) {
        zi.l0.e(Z1(comparator(), fromKey, toKey) <= 0, "fromKey must be <= toKey");
        return tailMap(fromKey).headMap(toKey);
    }

    @Override // java.util.SortedMap
    @zq.a
    public Comparator<? super K> comparator() {
        return g2().comparator();
    }

    @Override // java.util.SortedMap
    @n9
    public K firstKey() {
        return g2().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(@n9 K toKey) {
        return g2().headMap(toKey);
    }

    @Override // java.util.SortedMap
    @n9
    public K lastKey() {
        return g2().lastKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cj.q5
    public boolean standardContainsKey(@zq.a Object key) {
        try {
            return Z1(comparator(), tailMap(key).firstKey(), key) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(@n9 K fromKey, @n9 K toKey) {
        return g2().subMap(fromKey, toKey);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(@n9 K fromKey) {
        return g2().tailMap(fromKey);
    }
}
