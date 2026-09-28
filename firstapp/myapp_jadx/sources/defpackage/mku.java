package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class mku {
    public static volatile adl a;

    public static ScheduledExecutorService a() {
        if (a != null) {
            return a;
        }
        synchronized (mku.class) {
            try {
                if (a == null) {
                    a = new adl(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }
}
