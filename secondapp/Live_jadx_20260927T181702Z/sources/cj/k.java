package cj;

import java.lang.Comparable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@j4
public abstract class k<C extends Comparable> implements u9<C> {
    @Override // cj.u9
    public boolean a(C value) {
        return l(value) != null;
    }

    @Override // cj.u9
    public void b(r9<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // cj.u9
    public void clear() {
        b(r9.d());
    }

    @Override // cj.u9
    public boolean equals(@zq.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u9) {
            return p().equals(((u9) obj).p());
        }
        return false;
    }

    @Override // cj.u9
    public abstract boolean h(r9<C> otherRange);

    @Override // cj.u9
    public final int hashCode() {
        return p().hashCode();
    }

    @Override // cj.u9
    public boolean i(u9<C> other) {
        return m(other.p());
    }

    @Override // cj.u9
    public boolean isEmpty() {
        return p().isEmpty();
    }

    @Override // cj.u9
    public void j(r9<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // cj.u9
    public void k(Iterable<r9<C>> ranges) {
        Iterator<r9<C>> it = ranges.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    @Override // cj.u9
    @zq.a
    public abstract r9<C> l(C value);

    @Override // cj.u9
    public boolean m(Iterable<r9<C>> ranges) {
        Iterator<r9<C>> it = ranges.iterator();
        while (it.hasNext()) {
            if (!h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // cj.u9
    public boolean n(r9<C> otherRange) {
        return !q(otherRange).isEmpty();
    }

    @Override // cj.u9
    public void r(Iterable<r9<C>> ranges) {
        Iterator<r9<C>> it = ranges.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
    }

    @Override // cj.u9
    public void s(u9<C> other) {
        r(other.p());
    }

    @Override // cj.u9
    public void t(u9<C> other) {
        k(other.p());
    }

    @Override // cj.u9
    public final String toString() {
        return p().toString();
    }
}
