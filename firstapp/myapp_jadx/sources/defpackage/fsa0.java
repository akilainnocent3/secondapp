package defpackage;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class fsa0 {
    public static final Object a = new Object();

    public static final Object a(esa0 esa0Var, int i) {
        Object obj;
        esa0Var.getClass();
        int iA = bza.a(esa0Var.d, i, esa0Var.b);
        if (iA < 0 || (obj = esa0Var.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(esa0 esa0Var) {
        int i = esa0Var.d;
        int[] iArr = esa0Var.b;
        Object[] objArr = esa0Var.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        esa0Var.a = false;
        esa0Var.d = i2;
    }

    public static final String c(String str) {
        str.getClass();
        int length = str.length() > 8 ? 4 : (str.length() / 2) - (1 - (str.length() % 2));
        return d(length, length, str);
    }

    public static final String d(int i, int i2, String str) {
        return (i < 0 || i2 < 1 || str.length() <= i + i2) ? str : StringsKt.e0(str, i, str.length() - i2, StringsKt.Y("", (str.length() - i) - i2, '*')).toString();
    }
}
