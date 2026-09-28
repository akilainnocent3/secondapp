package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ih00<T> extends r3<T> {
    public final eh00<T> c;
    public int d;
    public zvg0<? extends T> e;
    public int f;

    public ih00(eh00<T> eh00Var, int i) {
        super(i, eh00Var.f);
        this.c = eh00Var;
        this.d = eh00Var.e();
        this.f = -1;
        c();
    }

    @Override // defpackage.r3, java.util.ListIterator
    public final void add(T t) {
        b();
        int i = this.a;
        eh00<T> eh00Var = this.c;
        eh00Var.add(i, t);
        this.a++;
        this.b = eh00Var.getB();
        this.d = eh00Var.e();
        this.f = -1;
        c();
    }

    public final void b() {
        if (this.d == this.c.e()) {
            return;
        }
        sx0.a();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void c() {
        eh00<T> eh00Var = this.c;
        Object[] objArr = eh00Var.d;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (eh00Var.f - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (eh00Var.a / 5) + 1;
        zvg0<? extends T> zvg0Var = this.e;
        if (zvg0Var == null) {
            this.e = new zvg0<>(objArr, i2, i, i3);
            return;
        }
        zvg0Var.a = i2;
        zvg0Var.b = i;
        zvg0Var.c = i3;
        Object[] objArr2 = zvg0Var.d;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            zvg0Var.d = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        zvg0Var.e = r0;
        zvg0Var.c(i2 - r0, 1);
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
        zvg0<? extends T> zvg0Var = this.e;
        eh00<T> eh00Var = this.c;
        if (zvg0Var == null) {
            Object[] objArr = eh00Var.e;
            this.a = i + 1;
            return (T) objArr[i];
        }
        if (zvg0Var.hasNext()) {
            this.a++;
            return zvg0Var.next();
        }
        Object[] objArr2 = eh00Var.e;
        int i2 = this.a;
        this.a = i2 + 1;
        return (T) objArr2[i2 - zvg0Var.b];
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
        zvg0<? extends T> zvg0Var = this.e;
        eh00<T> eh00Var = this.c;
        if (zvg0Var == null) {
            Object[] objArr = eh00Var.e;
            int i2 = i - 1;
            this.a = i2;
            return (T) objArr[i2];
        }
        int i3 = zvg0Var.b;
        if (i <= i3) {
            this.a = i - 1;
            return zvg0Var.previous();
        }
        Object[] objArr2 = eh00Var.e;
        int i4 = i - 1;
        this.a = i4;
        return (T) objArr2[i4 - i3];
    }

    @Override // defpackage.r3, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i = this.f;
        if (i == -1) {
            fm20.a();
            return;
        }
        eh00<T> eh00Var = this.c;
        eh00Var.c(i);
        int i2 = this.f;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = eh00Var.getB();
        this.d = eh00Var.e();
        this.f = -1;
        c();
    }

    @Override // defpackage.r3, java.util.ListIterator
    public final void set(T t) {
        b();
        int i = this.f;
        if (i == -1) {
            fm20.a();
            return;
        }
        eh00<T> eh00Var = this.c;
        eh00Var.set(i, t);
        this.d = eh00Var.e();
        c();
    }
}
