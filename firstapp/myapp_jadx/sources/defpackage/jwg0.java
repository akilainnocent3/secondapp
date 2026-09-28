package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jwg0 {
    public static final int a(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final <K, V> Object[] b(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        xx0.i(0, i, 6, objArr, objArr2);
        xx0.e(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        xx0.i(0, i, 6, objArr, objArr2);
        xx0.e(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        xx0.i(0, i, 6, objArr, objArr2);
        xx0.e(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }
}
