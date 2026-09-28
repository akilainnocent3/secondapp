package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class hm20 {
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

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            ib5.a(tx5.a("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            hb5.a("Given String is empty or null");
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            hb5.a(str2);
        }
    }

    public static void g(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        ib5.a(str);
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        bmy.a("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bmy.a(str);
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        ib5.a(str);
    }
}
