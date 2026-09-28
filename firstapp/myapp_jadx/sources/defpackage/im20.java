package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class im20 {
    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return p21.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return p21.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hb5.a(hce0.a(i2, "negative size: "));
        return null;
    }

    public static void b(String str, boolean z) {
        if (z) {
            return;
        }
        hb5.a(str);
    }

    public static void c(boolean z, String str, long j) {
        if (z) {
            return;
        }
        hb5.a(p21.b(str, Long.valueOf(j)));
    }

    public static void d(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = p21.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hb5.a(hce0.a(i2, "negative size: "));
                    return;
                }
                strB = p21.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bmy.a(str);
    }

    public static void f(int i, int i2) {
        if (i < 0 || i > i2) {
            mae0.a(a(i, i2, "index"));
        }
    }

    public static void g(int i, int i2, int i3) {
        String strA;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strA = a(i, i3, "start index");
            } else {
                strA = (i2 < 0 || i2 > i3) ? a(i2, i3, "end index") : p21.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        ib5.a(str);
    }
}
