package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ou0<T> {
    public final Object[] a;
    public Object[] b;
    public int c;

    public ou0() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    public final void a(T t) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = t;
        this.c = i + 1;
    }
}
