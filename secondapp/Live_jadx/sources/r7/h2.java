package r7;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f123803f = 30000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f123804a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f123805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f123806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f123807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f123808e;

    public h2(Runnable runnable) {
        this.f123805b = runnable;
    }

    public boolean a() {
        if (this.f123808e) {
            long j10 = this.f123806c;
            if (j10 > 0) {
                this.f123804a.postDelayed(this.f123805b, j10);
            }
        }
        return this.f123808e;
    }

    public void b(boolean z10, long j10) {
        if (z10) {
            long j11 = this.f123807d;
            if (j11 - j10 >= 30000) {
                return;
            }
            this.f123806c = Math.max(this.f123806c, (j10 + 30000) - j11);
            this.f123808e = true;
        }
    }

    public void c() {
        this.f123806c = 0L;
        this.f123808e = false;
        this.f123807d = SystemClock.elapsedRealtime();
        this.f123804a.removeCallbacks(this.f123805b);
    }
}
