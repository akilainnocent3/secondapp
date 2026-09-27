package d5;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f78021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    @k.a0("lock")
    public Looper f78022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @k.a0("lock")
    public HandlerThread f78023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.a0("lock")
    public int f78024d;

    public t4() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f78021a) {
            try {
                if (this.f78022b == null) {
                    zi.l0.g0(this.f78024d == 0 && this.f78023c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f78023c = handlerThread;
                    handlerThread.start();
                    this.f78022b = this.f78023c.getLooper();
                }
                this.f78024d++;
                looper = this.f78022b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f78021a) {
            try {
                zi.l0.g0(this.f78024d > 0);
                int i10 = this.f78024d - 1;
                this.f78024d = i10;
                if (i10 == 0 && (handlerThread = this.f78023c) != null) {
                    handlerThread.quit();
                    this.f78023c = null;
                    this.f78022b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t4(@Nullable Looper looper) {
        this.f78021a = new Object();
        this.f78022b = looper;
        this.f78023c = null;
        this.f78024d = 0;
    }
}
