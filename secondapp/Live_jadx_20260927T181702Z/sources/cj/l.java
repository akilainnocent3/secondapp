package cj;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class l<T> extends gc<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public T f24069b;

    public l(@zq.a T firstOrNull) {
        this.f24069b = firstOrNull;
    }

    @zq.a
    public abstract T a(T previous);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24069b != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t10 = this.f24069b;
        if (t10 == null) {
            throw new NoSuchElementException();
        }
        this.f24069b = a(t10);
        return t10;
    }
}
