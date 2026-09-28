package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class km20 {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        hb5.a(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        d580.a();
    }

    public static void d(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void e(int i) {
        if (i >= 0) {
            return;
        }
        d580.a();
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bmy.a(str);
    }

    public static void g(String str, boolean z) {
        if (z) {
            return;
        }
        ib5.a(str);
    }

    public static void c(float f, String str) {
        if (!Float.isNaN(f)) {
            if (!Float.isInfinite(f)) {
                return;
            }
            hb5.a(str.concat(qUnCRF.oqoKquvPIVC));
            return;
        }
        hb5.a(str.concat(" must not be NaN"));
    }
}
