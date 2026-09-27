package f5;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {
    public static boolean a(int i10) {
        if (i10 == 8 || i10 == 7) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || !(i10 == 26 || i10 == 27)) {
            return i11 >= 33 && i10 == 30;
        }
        return true;
    }

    public static boolean b(int i10) {
        return i10 == 1;
    }

    public static boolean c(int i10) {
        return i10 == 2;
    }

    public static boolean d(int i10) {
        return i10 == 10;
    }

    public static boolean e(int i10) {
        return Build.VERSION.SDK_INT >= 31 && i10 == 29;
    }

    public static boolean f(int i10) {
        if (i10 == 11 || i10 == 12) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 31 && i10 == 22;
    }
}
