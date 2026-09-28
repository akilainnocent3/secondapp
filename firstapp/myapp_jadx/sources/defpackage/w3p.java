package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w3p<T> extends lgh0 {
    public final T b;
    public boolean c;

    public w3p(T t) {
        super(0);
        this.b = t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.c) {
            lrh0.a();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
