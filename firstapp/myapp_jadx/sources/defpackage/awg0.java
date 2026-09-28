package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class awg0<E> extends s3<E> {
    public int c;
    public Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public awg0(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e = r5;
        objArr2[0] = objArr;
        c(i - r5, 1);
    }

    public final E b() {
        int i = this.a & 31;
        Object obj = this.d[this.c - 1];
        obj.getClass();
        return (E) ((Object[]) obj)[i];
    }

    public final void c(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[uv.a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void d(int i) {
        int i2 = 0;
        while (uv.a(this.a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            c(this.a, ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        E eB = b();
        int i = this.a + 1;
        this.a = i;
        if (i == this.b) {
            this.e = true;
            return eB;
        }
        d(0);
        return eB;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            lrh0.a();
            return null;
        }
        this.a--;
        if (this.e) {
            this.e = false;
            return b();
        }
        d(31);
        return b();
    }
}
