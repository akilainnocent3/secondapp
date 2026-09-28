package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fwm {
    public static final int a(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        xx0.i(0, i, 6, objArr, objArr2);
        xx0.e(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        xx0.i(0, i, 6, objArr, objArr2);
        xx0.e(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }
}
