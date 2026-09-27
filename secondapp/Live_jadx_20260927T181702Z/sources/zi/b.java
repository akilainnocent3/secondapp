package zi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f161613b = a.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.a
    public T f161614c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @zq.a
    public abstract T a();

    @qj.a
    @zq.a
    public final T b() {
        this.f161613b = a.DONE;
        return null;
    }

    public final boolean c() {
        this.f161613b = a.FAILED;
        this.f161614c = a();
        if (this.f161613b == a.DONE) {
            return false;
        }
        this.f161613b = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l0.g0(this.f161613b != a.FAILED);
        int iOrdinal = this.f161613b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    @i0
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f161613b = a.NOT_READY;
        T t10 = (T) e0.a(this.f161614c);
        this.f161614c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
