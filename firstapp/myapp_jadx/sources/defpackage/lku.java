package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class lku {
    public static volatile Handler a;

    public static Handler a() {
        if (a != null) {
            return a;
        }
        synchronized (lku.class) {
            try {
                if (a == null) {
                    a = rcl.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }
}
