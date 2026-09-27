package kp;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f102861b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f102862a;

    public f() {
        this.f102862a = null;
        try {
            HandlerThread handlerThread = new HandlerThread("tiktok");
            handlerThread.start();
            this.f102862a = new Handler(handlerThread.getLooper());
        } catch (Throwable unused) {
        }
    }

    public static f a() {
        return f102861b;
    }

    public void b(Runnable runnable) {
        if (runnable != null) {
            try {
                Handler handler = this.f102862a;
                if (handler == null) {
                    return;
                }
                handler.post(runnable);
            } catch (Throwable unused) {
            }
        }
    }

    public void c(Runnable runnable, long delayMillis) {
        if (runnable != null) {
            try {
                Handler handler = this.f102862a;
                if (handler == null) {
                    return;
                }
                handler.postDelayed(runnable, delayMillis);
            } catch (Throwable unused) {
            }
        }
    }

    public void d(Runnable runnable) {
        if (runnable != null) {
            try {
                Handler handler = this.f102862a;
                if (handler == null) {
                    return;
                }
                handler.removeCallbacks(runnable);
            } catch (Throwable unused) {
            }
        }
    }
}
