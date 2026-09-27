package cj;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class e6<R, C, V> extends w5 implements gb<R, C, V> {
    @Override // cj.gb
    public void G1(gb<? extends R, ? extends C, ? extends V> table) {
        g2().G1(table);
    }

    @Override // cj.gb
    public Set<C> J1() {
        return g2().J1();
    }

    @Override // cj.gb
    public boolean K1(@zq.a Object rowKey) {
        return g2().K1(rowKey);
    }

    @Override // cj.gb
    public Map<C, Map<R, V>> N() {
        return g2().N();
    }

    @Override // cj.gb
    public Map<C, V> U1(@n9 R rowKey) {
        return g2().U1(rowKey);
    }

    @Override // cj.w5
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public abstract gb<R, C, V> g2();

    @Override // cj.gb
    public Map<R, V> Y(@n9 C columnKey) {
        return g2().Y(columnKey);
    }

    @Override // cj.gb
    public void clear() {
        g2().clear();
    }

    @Override // cj.gb
    public boolean containsValue(@zq.a Object value) {
        return g2().containsValue(value);
    }

    @Override // cj.gb
    @qj.a
    @zq.a
    public V e0(@n9 R rowKey, @n9 C columnKey, @n9 V value) {
        return g2().e0(rowKey, columnKey, value);
    }

    @Override // cj.gb
    public boolean equals(@zq.a Object obj) {
        return obj == this || g2().equals(obj);
    }

    @Override // cj.gb
    public int hashCode() {
        return g2().hashCode();
    }

    @Override // cj.gb
    public boolean isEmpty() {
        return g2().isEmpty();
    }

    @Override // cj.gb, cj.ja
    public Map<R, Map<C, V>> l() {
        return g2().l();
    }

    @Override // cj.gb, cj.ja
    public Set<R> n() {
        return g2().n();
    }

    @Override // cj.gb
    @qj.a
    @zq.a
    public V remove(@zq.a Object rowKey, @zq.a Object columnKey) {
        return g2().remove(rowKey, columnKey);
    }

    @Override // cj.gb
    public int size() {
        return g2().size();
    }

    @Override // cj.gb
    @zq.a
    public V t(@zq.a Object rowKey, @zq.a Object columnKey) {
        return g2().t(rowKey, columnKey);
    }

    @Override // cj.gb
    public Collection<V> values() {
        return g2().values();
    }

    @Override // cj.gb
    public Set<gb.a<R, C, V>> w1() {
        return g2().w1();
    }

    @Override // cj.gb
    public boolean y(@zq.a Object columnKey) {
        return g2().y(columnKey);
    }

    @Override // cj.gb
    public boolean y0(@zq.a Object rowKey, @zq.a Object columnKey) {
        return g2().y0(rowKey, columnKey);
    }
}
