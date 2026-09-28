package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d220<T> {
    public final Object[] a = new Object[256];
    public int b;

    public final void a(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }
}
