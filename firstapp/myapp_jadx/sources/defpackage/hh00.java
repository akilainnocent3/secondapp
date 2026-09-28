package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hh00<T> extends s3<T> {
    public final T[] c;
    public final awg0<T> d;

    /* JADX WARN: Multi-variable type inference failed */
    public hh00(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new awg0<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        awg0<T> awg0Var = this.d;
        if (awg0Var.hasNext()) {
            this.a++;
            return awg0Var.next();
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i - awg0Var.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            lrh0.a();
            return null;
        }
        int i = this.a;
        awg0<T> awg0Var = this.d;
        int i2 = awg0Var.b;
        if (i <= i2) {
            this.a = i - 1;
            return awg0Var.previous();
        }
        int i3 = i - 1;
        this.a = i3;
        return this.c[i3 - i2];
    }
}
