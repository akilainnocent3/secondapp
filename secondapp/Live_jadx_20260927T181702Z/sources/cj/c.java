package cj;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class c<T> extends gc<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f23436b = a.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.a
    public T f23437c;

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
        this.f23436b = a.DONE;
        return null;
    }

    public final boolean c() {
        this.f23436b = a.FAILED;
        this.f23437c = a();
        if (this.f23436b == a.DONE) {
            return false;
        }
        this.f23436b = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zi.l0.g0(this.f23436b != a.FAILED);
        int iOrdinal = this.f23436b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    @qj.a
    @n9
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23436b = a.NOT_READY;
        T t10 = (T) g9.a(this.f23437c);
        this.f23437c = null;
        return t10;
    }

    @n9
    public final T peek() {
        if (hasNext()) {
            return (T) g9.a(this.f23437c);
        }
        throw new NoSuchElementException();
    }
}
