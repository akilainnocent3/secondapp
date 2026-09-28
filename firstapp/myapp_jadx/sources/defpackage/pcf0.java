package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class pcf0 {
    public static final ThreadLocal<char[]> a = new ThreadLocal<>();

    public static char[] a(int i) {
        ThreadLocal<char[]> threadLocal = a;
        char[] cArr = threadLocal.get();
        if (cArr != null && cArr.length >= i) {
            return cArr;
        }
        char[] cArr2 = new char[i];
        threadLocal.set(cArr2);
        return cArr2;
    }
}
