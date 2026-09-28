package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class w41 {
    public static int a(qd4.d dVar, qd4.c cVar) {
        dVar.getClass();
        return cVar != null ? 15 : 255;
    }

    public static boolean b(int i) {
        return (i & 32768) != 0;
    }

    public static boolean c(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i != 32783) {
            return i == 33023 || i == 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 28 || i2 > 29;
    }
}
