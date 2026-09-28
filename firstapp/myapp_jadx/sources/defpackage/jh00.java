package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jh00<T> extends s3<T> {
    public final fh00<T> c;
    public int d;
    public awg0<? extends T> e;
    public int f;

    public jh00(fh00<T> fh00Var, int i) {
        super(i, fh00Var.v);
        this.c = fh00Var;
        this.d = fh00Var.f();
        this.f = -1;
        c();
    }

    @Override // defpackage.s3, java.util.ListIterator
    public final void add(T t) {
        b();
        int i = this.a;
        fh00<T> fh00Var = this.c;
        fh00Var.add(i, t);
        this.a++;
        this.b = fh00Var.getB();
        this.d = fh00Var.f();
        this.f = -1;
        c();
    }

    public final void b() {
        if (this.d == this.c.f()) {
            return;
        }
        sx0.a();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void c() {
        fh00<T> fh00Var = this.c;
        Object[] objArr = fh00Var.f;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (fh00Var.v - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (fh00Var.d / 5) + 1;
        awg0<? extends T> awg0Var = this.e;
        if (awg0Var == null) {
            this.e = new awg0<>(objArr, i2, i, i3);
            return;
        }
        awg0Var.a = i2;
        awg0Var.b = i;
        awg0Var.c = i3;
        Object[] objArr2 = awg0Var.d;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            awg0Var.d = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        awg0Var.e = r0;
        awg0Var.c(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        b();
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        int i = this.a;
        this.f = i;
        awg0<? extends T> awg0Var = this.e;
        fh00<T> fh00Var = this.c;
        if (awg0Var == null) {
            Object[] objArr = fh00Var.i;
            this.a = i + 1;
            return (T) objArr[i];
        }
        if (awg0Var.hasNext()) {
            this.a++;
            return awg0Var.next();
        }
        Object[] objArr2 = fh00Var.i;
        int i2 = this.a;
        this.a = i2 + 1;
        return (T) objArr2[i2 - awg0Var.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        b();
        if (!hasPrevious()) {
            lrh0.a();
            return null;
        }
        int i = this.a;
        this.f = i - 1;
        awg0<? extends T> awg0Var = this.e;
        fh00<T> fh00Var = this.c;
        if (awg0Var == null) {
            Object[] objArr = fh00Var.i;
            int i2 = i - 1;
            this.a = i2;
            return (T) objArr[i2];
        }
        int i3 = awg0Var.b;
        if (i <= i3) {
            this.a = i - 1;
            return awg0Var.previous();
        }
        Object[] objArr2 = fh00Var.i;
        int i4 = i - 1;
        this.a = i4;
        return (T) objArr2[i4 - i3];
    }

    @Override // defpackage.s3, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i = this.f;
        if (i == -1) {
            fm20.a();
            return;
        }
        fh00<T> fh00Var = this.c;
        fh00Var.c(i);
        int i2 = this.f;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = fh00Var.getB();
        this.d = fh00Var.f();
        this.f = -1;
        c();
    }

    @Override // defpackage.s3, java.util.ListIterator
    public final void set(T t) {
        b();
        int i = this.f;
        if (i == -1) {
            fm20.a();
            return;
        }
        fh00<T> fh00Var = this.c;
        fh00Var.set(i, t);
        this.d = fh00Var.f();
        c();
    }
}
