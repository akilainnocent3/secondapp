package zi;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(serializable = true)
@k
public final class h0<E, T extends E> extends m<Iterable<T>> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f161728c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m<E> f161729b;

    public h0(m<E> elementEquivalence) {
        this.f161729b = (m) l0.E(elementEquivalence);
    }

    public boolean equals(@zq.a Object object) {
        if (object instanceof h0) {
            return this.f161729b.equals(((h0) object).f161729b);
        }
        return false;
    }

    public int hashCode() {
        return this.f161729b.hashCode() ^ 1185147655;
    }

    @Override // zi.m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean a(Iterable<T> iterableA, Iterable<T> iterableB) {
        Iterator<T> it = iterableA.iterator();
        Iterator<T> it2 = iterableB.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f161729b.e(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // zi.m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int b(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int iG = 78721;
        while (it.hasNext()) {
            iG = (iG * 24943) + this.f161729b.g(it.next());
        }
        return iG;
    }

    public String toString() {
        return this.f161729b + ".pairwise()";
    }
}
