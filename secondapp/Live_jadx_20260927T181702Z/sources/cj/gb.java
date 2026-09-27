package cj;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@j4
@yi.b
@qj.f("Use ImmutableTable, HashBasedTable, or another implementation")
public interface gb<R, C, V> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<R, C, V> {
        @n9
        C d();

        boolean equals(@zq.a Object obj);

        @n9
        R g();

        @n9
        V getValue();

        int hashCode();
    }

    void G1(gb<? extends R, ? extends C, ? extends V> table);

    Set<C> J1();

    boolean K1(@zq.a @qj.c("R") Object rowKey);

    Map<C, Map<R, V>> N();

    Map<C, V> U1(@n9 R rowKey);

    Map<R, V> Y(@n9 C columnKey);

    void clear();

    boolean containsValue(@zq.a @qj.c(l3.a.X4) Object value);

    @qj.a
    @zq.a
    V e0(@n9 R rowKey, @n9 C columnKey, @n9 V value);

    boolean equals(@zq.a Object obj);

    int hashCode();

    boolean isEmpty();

    Map<R, Map<C, V>> l();

    Set<R> n();

    @qj.a
    @zq.a
    V remove(@zq.a @qj.c("R") Object rowKey, @zq.a @qj.c("C") Object columnKey);

    int size();

    @zq.a
    V t(@zq.a @qj.c("R") Object rowKey, @zq.a @qj.c("C") Object columnKey);

    Collection<V> values();

    Set<a<R, C, V>> w1();

    boolean y(@zq.a @qj.c("C") Object columnKey);

    boolean y0(@zq.a @qj.c("R") Object rowKey, @zq.a @qj.c("C") Object columnKey);
}
